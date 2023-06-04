package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlatChoicePage {
    private Application application;
    private String selectedRestaurant;
    private JTextArea platDescriptionTextArea; // Ajout de la variable
    private String selectedPlat;

    public PlatChoicePage(Application application, String selectedRestaurant) {
        this.application = application;
        this.selectedRestaurant = selectedRestaurant;
    }

    public JPanel showPlatChoicesPage() {
        JPanel panel = new JPanel(new BorderLayout());

        // En-tête
        JPanel headerPanel = application.createHeaderPanel();
        panel.add(headerPanel, BorderLayout.NORTH);

        // Contenu de la page
        JPanel contentPanel = new JPanel(new BorderLayout());

        // Panel Gauche : Informations sur le restaurant sélectionné
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setPreferredSize(new Dimension(300, 400));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel restaurantNameLabel = new JLabel(selectedRestaurant);
        restaurantNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        leftPanel.add(restaurantNameLabel, BorderLayout.NORTH);

        JTextArea restaurantInfoTextArea = new JTextArea();
        restaurantInfoTextArea.setEditable(false);
        restaurantInfoTextArea.setLineWrap(true);
        // Récupérer les informations sur le restaurant à partir de son nom et les afficher
        String restaurantInfo = getRestaurantInfo(selectedRestaurant);
        restaurantInfoTextArea.setText(restaurantInfo);
        leftPanel.add(new JScrollPane(restaurantInfoTextArea), BorderLayout.CENTER);

        contentPanel.add(leftPanel, BorderLayout.WEST);

        // Panel Droit : Menu déroulant des plats disponibles
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setPreferredSize(new Dimension(300, 400));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] platOptions = {"Plat 1", "Plat 2", "Plat 3", "Plat 4", "Plat 5"};
        JComboBox<String> platComboBox = new JComboBox<>(platOptions);
        platComboBox.setPreferredSize(new Dimension(200, 30));
        rightPanel.add(platComboBox, BorderLayout.NORTH);

        JPanel platDetailsPanel = new JPanel(new BorderLayout());

        // Photo du plat
        JLabel platPhotoLabel = new JLabel();
        platPhotoLabel.setPreferredSize(new Dimension(200, 200)); // Adapter la taille selon vos besoins
        platDetailsPanel.add(platPhotoLabel, BorderLayout.NORTH);

        // Prix du plat
        JLabel platPriceLabel = new JLabel();
        platDetailsPanel.add(platPriceLabel, BorderLayout.CENTER);

        // Bouton "Ajouter"
        JButton addButton = new JButton("Ajouter");
        platDetailsPanel.add(addButton, BorderLayout.EAST);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPlat = (String) platComboBox.getSelectedItem();
                // Ajouter le plat à la commande
                //addToOrder(selectedPlat);
                JOptionPane.showMessageDialog(null, "Plat ajouté à la commande");
            }

        });

        platDescriptionTextArea = new JTextArea(); // Initialisation de la variable
        platDescriptionTextArea.setEditable(false);
        platDescriptionTextArea.setLineWrap(true);
        platDetailsPanel.add(new JScrollPane(platDescriptionTextArea), BorderLayout.SOUTH);

        rightPanel.add(platDetailsPanel, BorderLayout.CENTER);

        platComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPlat = (String) platComboBox.getSelectedItem();
                // Récupérer la description, la photo et le prix du plat sélectionné
                String platDescription = getPlatDescription(selectedPlat);
                String platPhotoPath = getPlatPhotoPath(selectedPlat);
                double platPrice = getPlatPrice(selectedPlat);

                // Afficher la description, la photo et le prix du plat sélectionné
                platDescriptionTextArea.setText(platDescription);
                ImageIcon platPhoto = new ImageIcon(platPhotoPath);
                platPhotoLabel.setIcon(platPhoto);
                platPriceLabel.setText("Prix : " + platPrice + "€");
            }
        });

        contentPanel.add(rightPanel, BorderLayout.CENTER);

        // Bouton "Voir ma commande"
        JButton viewOrderButton = new JButton("Voir ma commande");
        viewOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exemple : Passer à une autre page
                //application.showOrderPage(selectedRestaurant);
            }
        });
        contentPanel.add(viewOrderButton, BorderLayout.SOUTH);

        panel.add(contentPanel, BorderLayout.CENTER);

        // Footer
        JPanel footerPanel = application.createFooterPanel();
        panel.add(footerPanel, BorderLayout.SOUTH);

        return panel;
    }

    private String getRestaurantInfo(String restaurantName) {
        // Code pour récupérer les informations du restaurant à partir de son nom
        // Remplacez ce code par votre propre logique de récupération des informations du restaurant
        // et renvoyez les informations sous la forme d'une chaîne de caractères
        return "Informations sur le restaurant " + restaurantName;
    }

    private String getPlatDescription(String platName) {
        // Code pour récupérer la description du plat à partir de son nom
        // Remplacez ce code par votre propre logique de récupération de la description du plat
        // et renvoyez la description sous la forme d'une chaîne de caractères
        return "Description du plat " + platName;
    }

    private String getPlatPhotoPath(String platName) {
        // Code pour récupérer le chemin de la photo du plat à partir de son nom
        // Remplacez ce code par votre propre logique de récupération du chemin de la photo
        // et renvoyez le chemin sous la forme d'une chaîne de caractères
        return "image/poulet_biryani.png";
    }

    private double getPlatPrice(String platName) {
        // Code pour récupérer le prix du plat à partir de son nom
        // Remplacez ce code par votre propre logique de récupération du prix du plat
        // et renvoyez le prix sous la forme d'un nombre à virgule
        return 10.99; // Exemple de prix
    }
}
