package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                boolean loginSuccessful = verifyLogin(email, password);

                if (loginSuccessful) {
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

    private boolean verifyLogin(String email, String password) {
        // Vérifiez les informations de connexion ici
        // Par exemple, vérifiez si l'email et le mot de passe correspondent à un utilisateur enregistré dans une base de données
        // Pour l'exemple, nous allons simplement vérifier si l'email est "user@example.com" et le mot de passe est "password"

        return email.equals("admin") && password.equals("admin");
    }
}