package main.java;

import javax.swing.*;
import java.awt.*;

public class RestaurantChoicePage {
    private Application application;

    public RestaurantChoicePage(Application application) {
        this.application = application;
    }

    public JPanel showRestaurantChoicesPage() {
        JPanel panel = new JPanel(new BorderLayout());

        // Header
        JPanel headerPanel = application.createHeaderPanel();
        panel.add(headerPanel, BorderLayout.NORTH);

        // Contenu de la page
        JPanel contentPanel = new JPanel(new BorderLayout());

        // Menu déroulant gauche
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setPreferredSize(new Dimension(200, 0));

        // Menu déroulant Distance
        JPanel distancePanel = createFilterPanel("Distance", new String[]{"< 1 km", "1 - 5 km", "> 5 km"});
        leftPanel.add(distancePanel, BorderLayout.NORTH);

        // Menu déroulant Prix
        JPanel pricePanel = createFilterPanel("Prix", new String[]{"€", "€€", "€€€"});
        leftPanel.add(pricePanel, BorderLayout.CENTER);

        // Menu déroulant Catégorie
        JPanel categoryPanel = createFilterPanel("Catégorie", new String[]{"Burger", "Italien", "Japonais"});
        leftPanel.add(categoryPanel, BorderLayout.SOUTH);

        contentPanel.add(leftPanel, BorderLayout.WEST);

        // Liste des restaurants et informations sur le restaurant sélectionné
        JPanel rightPanel = new JPanel(new BorderLayout());

        // Menu déroulant pour la liste des restaurants
        JPanel restaurantPanel = new JPanel(new BorderLayout());
        String[] restaurantOptions = {"Restaurant 1 - Description du restaurant", "Restaurant 2 - Description du restaurant", "Restaurant 3 - Description du restaurant"};
        JComboBox<String> restaurantComboBox = new JComboBox<>(restaurantOptions);
        restaurantComboBox.setPreferredSize(new Dimension(300, 30));
        restaurantPanel.add(restaurantComboBox, BorderLayout.NORTH);

        // Informations sur le restaurant sélectionné
        JTextArea restaurantInfoTextArea = new JTextArea();
        restaurantInfoTextArea.setEditable(false);
        restaurantInfoTextArea.setLineWrap(true);
        JScrollPane infoScrollPane = new JScrollPane(restaurantInfoTextArea);
        infoScrollPane.setPreferredSize(new Dimension(300, 200));
        restaurantPanel.add(infoScrollPane, BorderLayout.CENTER);

        rightPanel.add(restaurantPanel, BorderLayout.NORTH);

        restaurantComboBox.addActionListener(e -> {
            String selectedRestaurant = (String) restaurantComboBox.getSelectedItem();
            // Code pour afficher les informations du restaurant sélectionné
            restaurantInfoTextArea.setText(getRestaurantInfo(selectedRestaurant));
        });

        contentPanel.add(rightPanel, BorderLayout.CENTER);

        // Bouton Valider
        JButton validateButton = new JButton("Valider");
        validateButton.addActionListener(e -> {
            String selectedRestaurant = (String) restaurantComboBox.getSelectedItem();
            application.showPlatChoicePage(selectedRestaurant);
        });
        contentPanel.add(validateButton, BorderLayout.SOUTH);

        panel.add(contentPanel, BorderLayout.CENTER);

        // Footer
        JPanel footerPanel = application.createFooterPanel();
        panel.add(footerPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createFilterPanel(String title, String[] options) {
        JPanel filterPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(title);
        JComboBox<String> comboBox = new JComboBox<>(options);
        filterPanel.add(titleLabel, BorderLayout.NORTH);
        filterPanel.add(comboBox, BorderLayout.CENTER);
        return filterPanel;
    }

    private String getRestaurantInfo(String restaurantName) {
        // Code pour récupérer les informations du restaurant à partir de son nom
        // Remplacez ce code par votre propre logique de récupération des informations du restaurant
        // et renvoyez les informations sous la forme d'une chaîne de caractères
        return "Informations sur le restaurant " + restaurantName;
    }
}