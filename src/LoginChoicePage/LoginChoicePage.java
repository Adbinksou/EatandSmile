package LoginChoicePage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginChoicePage {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("EAT & SMILE - Connexion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Création du panel pour le haut de la page
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(800, 80));
        topPanel.setBackground(Color.decode("#ff9e1b"));

        // Création du bouton du menu déroulant
        JButton menuButton = new JButton("☰");
        menuButton.setFont(new Font("Arial", Font.PLAIN, 40));
        menuButton.setFocusPainted(false);
        menuButton.setBorderPainted(false);
        menuButton.setBackground(Color.decode("#ff9e1b"));
        JPanel menuPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        menuPanel.setBackground(Color.decode("#ff9e1b"));
        menuPanel.add(menuButton);
        topPanel.add(menuPanel, BorderLayout.WEST);

        // Création du logo
        ImageIcon logoIcon = new ImageIcon("src/logo1.png");
        Image image = logoIcon.getImage().getScaledInstance(75, 70, Image.SCALE_SMOOTH);
        logoIcon = new ImageIcon(image);
        JLabel logoLabel = new JLabel("", logoIcon, JLabel.CENTER);
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        logoPanel.setBackground(Color.decode("#ff9e1b"));
        logoPanel.add(logoLabel);
        topPanel.add(logoPanel, BorderLayout.EAST);

        // Ajout du panel supérieur à la fenêtre principale
        frame.add(topPanel, BorderLayout.NORTH);

        // Création du panel pour le centre de la page
        JPanel centerPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        centerPanel.setBackground(Color.WHITE);

        // Création des boutons de choix de connexion
        JButton livreurButton = new JButton("Je me connecte pour livrer !");
        JButton clientButton = new JButton("Je me connecte pour commander !");
        JButton fournisseurButton = new JButton("Je me connecte pour proposer mes repas !");

        // Action listeners pour les boutons de choix de connexion
        livreurButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action à effectuer lors du clic sur "Je me connecte pour livrer !"
                // TODO: Ajouter le code correspondant pour la page de connexion pour les livreurs
            }
        });

        clientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action à effectuer lors du clic sur "Je me connecte pour commander !"
                // TODO: Ajouter le code correspondant pour la page de connexion pour les clients
            }
        });

        fournisseurButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action à effectuer lors du clic sur "Je me connecte pour proposer mes repas !"
                // TODO: Ajouter le code correspondant pour la page de connexion pour les fournisseurs/restaurant
            }
        });

        // Ajout des boutons de choix de connexion au centre du panel
        centerPanel.add(livreurButton);
        centerPanel.add(clientButton);
        centerPanel.add(fournisseurButton);

        // Ajout du panel central à la fenêtre principale
        frame.add(centerPanel, BorderLayout.CENTER);

        // Création du panel pour le bas de la page
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setPreferredSize(new Dimension(800, 80));
        bottomPanel.setBackground(Color.decode("#cd545b"));

        // Création du bouton "Qui sommes-nous ?"
        JButton quiSommesNousButton = new JButton("Qui sommes-nous ?");
        quiSommesNousButton.setFont(new Font("Arial", Font.PLAIN, 22));
        quiSommesNousButton.setForeground(Color.WHITE);

        // Action listener pour le bouton "Qui sommes-nous ?"
        quiSommesNousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action à effectuer lors du clic sur "Qui sommes-nous ?"
                // TODO: Ajouter le code correspondant pour la page d'introduction du produit
            }
        });

        // Ajout du bouton "Qui sommes-nous ?" au centre du panel inférieur
        bottomPanel.add(quiSommesNousButton, BorderLayout.CENTER);
        quiSommesNousButton.setFont(new Font("Arial", Font.PLAIN, 22));
        quiSommesNousButton.setForeground(Color.decode("#cd545b"));

        // Ajout du panel inférieur à la fenêtre principale
        frame.add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.setPreferredSize(new Dimension(800, 80));
        bottomPanel.setBackground(Color.decode("#cd545b"));

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
