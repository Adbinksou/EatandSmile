package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DescriptionPage {


    private Application application;

    public DescriptionPage(Application application) {
        this.application = application;
    }

    public JPanel createDescriptionPage() {
        JPanel panel = new JPanel(new BorderLayout());

        // En-tête
        JPanel headerPanel = application.createHeaderPanel();
        panel.add(headerPanel, BorderLayout.NORTH);

        // Contenu de la page
        JPanel contentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contentPanel.add(new JLabel("Page de description"));

        // Bouton Accueil
        JButton homeButton = application.createButton("Accueil", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                application.showHomePage();
            }
        });
        contentPanel.add(homeButton);

        panel.add(contentPanel, BorderLayout.CENTER);

        return panel;
    }
}


