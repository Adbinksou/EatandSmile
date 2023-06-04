package main.java;

import main.java.bin.ConnectBDD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnexionFormPage {
    private Application application;

    public ConnexionFormPage(Application application) {
        this.application = application;
    }

    public JPanel createConnexionFormPage() {
        JPanel panel = new JPanel(new BorderLayout());

        // En-tête
        JPanel headerPanel = application.createHeaderPanel();
        panel.add(headerPanel, BorderLayout.NORTH);

        // Contenu de la page
        JPanel contentPanel = new JPanel(new BorderLayout());

        // Footer
        JPanel footerPanel = application.createFooterPanel();
        panel.add(footerPanel, BorderLayout.SOUTH);

        application.frame.setContentPane(panel);
        application.frame.setVisible(true);

        // Formulaire de connexion
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Champs de formulaire
        JLabel emailLabel = new JLabel("Email :");
        JTextField emailField = new JTextField(20);
        formPanel.add(emailLabel);
        formPanel.add(emailField);

        JLabel passwordLabel = new JLabel("Mot de passe :");
        JPasswordField passwordField = new JPasswordField(20);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);

        contentPanel.add(formPanel, BorderLayout.CENTER);

        // Bouton Connexion
        JButton loginButton = application.createButton("Se connecter", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Récupérer les valeurs des champs de formulaire
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());


                // Vérifier les informations de connexion
                ArrayList loginSuccessful = null;
                try {
                    loginSuccessful = verifyLogin(email,password);
                    for (Object name : loginSuccessful) {
                        String name2 = (String) name;
                        JOptionPane.showMessageDialog(panel, "Bienvenue "+name2);

                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


                if (loginSuccessful != null) {



                    // Afficher un message de succès
                    JOptionPane.showMessageDialog(panel, "Connexion réussie!");
                    application.showRestaurantChoicesPage();



                } else {
                    // Afficher un message d'erreur
                    JOptionPane.showMessageDialog(panel, "Échec de la connexion. Veuillez vérifier vos informations.");
                }

            }

        });
        contentPanel.add(loginButton, BorderLayout.SOUTH);

        panel.add(contentPanel, BorderLayout.CENTER);

        return panel;
    }

    private ArrayList verifyLogin(String email, String password) throws SQLException {
        // Vérifiez les informations de connexion ici
        // Par exemple, vérifiez si l'email et le mot de passe correspondent à un utilisateur enregistré dans une base de données
        // Pour l'exemple, nous allons simplement vérifier si l'email est "user@example.com" et le mot de passe est "password"


        ConnectBDD request = new ConnectBDD();
        request.connectionbdd();


        //request.exectutebdd(email,password);

        ArrayList nameFistname = new ArrayList();
        ResultSet res = request.exectutebdd(email,password);
        while (res.next())
        {
            nameFistname.add(res.getString(1));
        }

        request.closebdd();
        return nameFistname;

       // return email.equals("admin") && password.equals("admin");
    }
}