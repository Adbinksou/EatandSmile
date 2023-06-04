package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InscriptionFormPage {
    private Application application;

    public InscriptionFormPage(Application application) {

        this.application = application;
    }

    public JPanel createInscriptionFormPage() {
        JPanel panel = new JPanel(new BorderLayout());

        // En-tête
        JPanel headerPanel = application.createHeaderPanel();
        panel.add(headerPanel, BorderLayout.NORTH);

        // Contenu de la page
        JPanel contentPanel = new JPanel(new BorderLayout());

        // Formulaire d'inscription
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));

        // Champs de formulaire
        JLabel nomLabel = new JLabel("Nom :");
        JTextField nomField = new JTextField(20);
        formPanel.add(nomLabel);
        formPanel.add(nomField);

        JLabel prenomLabel = new JLabel("Prénom :");
        JTextField prenomField = new JTextField(20);
        formPanel.add(prenomLabel);
        formPanel.add(prenomField);

        JLabel emailLabel = new JLabel("Email :");
        JTextField emailField = new JTextField(20);
        formPanel.add(emailLabel);
        formPanel.add(emailField);

        JLabel ageLabel = new JLabel("Âge :");
        JTextField ageField = new JTextField(20);
        formPanel.add(ageLabel);
        formPanel.add(ageField);

        JLabel adresseLabel = new JLabel("Adresse :");
        JTextField adresseField = new JTextField(20);
        formPanel.add(adresseLabel);
        formPanel.add(adresseField);

        JLabel villeLabel = new JLabel("Ville :");
        JTextField villeField = new JTextField(20);
        formPanel.add(villeLabel);
        formPanel.add(villeField);

        contentPanel.add(formPanel, BorderLayout.CENTER);

        // Bouton Soumettre
        JButton submitButton = application.createButton("Soumettre", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Récupérer les valeurs des champs de formulaire
                String nom = nomField.getText();
                String prenom = prenomField.getText();
                String email = emailField.getText();
                String age = ageField.getText();
                String adresse = adresseField.getText();
                String ville = villeField.getText();

                // Faire quelque chose avec les données du formulaire
                // Par exemple, enregistrer les informations dans une base de données

                // Afficher un message de succès
                JOptionPane.showMessageDialog(panel, "Formulaire soumis avec succès!");

                // Revenir à la page d'accueil
                application.showHomePage();
            }
        });
        contentPanel.add(submitButton, BorderLayout.SOUTH);

        panel.add(contentPanel, BorderLayout.CENTER);

        return panel;
    }
}
