package main.java.bin;
import java.sql.*;

public class ConnectBDD {


       public Connection conn ;
       public void connectionbdd(){
              try{
                     //étape 1: charger la classe de driver
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     //étape 2: créer l'objet de connexion
                     this.conn = DriverManager.getConnection(
                             "jdbc:mysql://localhost:3306/eatandsmile", "root", "");
              }
              catch(Exception e){
                     //System.out.println(e);
                     e.printStackTrace();
              }
       }

       public void closebdd(){
              try{
                     //étape 5: fermez l'objet de connexion
                     conn.close();
              }
              catch(Exception e){
                     //System.out.println(e);
                     e.printStackTrace();
              }
       }
       public ResultSet exectutebdd (String email, String password)
       {
              try
              {

                     //étape 3: créer l'objet statement
                     Statement stmt = conn.createStatement();

                     String request =""
                     + " SELECT CASE"
                     + " WHEN u.typeofuser = 1 THEN c.name"
                     + " WHEN u.typeofuser = 2 THEN d.name"
                     + " WHEN u.typeofuser = 3 THEN p.name"
                     + " ELSE 'BOSS'  END AS name"

                     +" FROM users u"
                     +" LEFT JOIN client c ON c.id_user = u.id_user"
                     +" LEFT JOIN deliveryman d ON d.id_user = u.id_user"
                     +" LEFT JOIN producer p ON p.id_user = u.id_user"


                     +" WHERE u.mail_user ='"+email+"' AND u.mdp ='"+password+"'";
                     ResultSet res = stmt.executeQuery(request);
                     //étape 4: exécuter la requête
                     //while(res.next())
                            //System.out.println(res.getInt(1) + "  " + res.getString(2) + "  " + res.getString(3));




                     //étape 6: envoyer l'id de l'utilisateur et son type
                     return(res);
              }
              catch(Exception e){
                     //System.out.println(e);
                     e.printStackTrace();
              }
              return null;
       }
}

