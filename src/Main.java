import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("EAT & SMILE");
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

        // Ajout des boutons de connexion et d'inscription
        JButton connexionButton = new JButton("Se connecter");
        JButton inscriptionButton = new JButton("S'inscrire");
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonsPanel.setBackground(Color.decode("#ff9e1b"));
        buttonsPanel.add(connexionButton);
        buttonsPanel.add(inscriptionButton);
        topPanel.add(buttonsPanel, BorderLayout.CENTER);

        // Création du logo
        ImageIcon logoIcon = new ImageIcon("src/logo1.png");
        Image image = logoIcon.getImage().getScaledInstance(75, 70, Image.SCALE_SMOOTH);
        logoIcon = new ImageIcon(image);
        JLabel logoLabel = new JLabel("", logoIcon, JLabel.CENTER);
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        logoPanel.setBackground(Color.decode("#ff9e1b"));
        logoPanel.add(logoLabel);
        topPanel.add(logoPanel, BorderLayout.EAST);

        // Création du panel pour le centre de la page
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.WHITE);

        // Création du titre
        JLabel titleLabel = new JLabel("EAT & SMILE", JLabel.CENTER);
        titleLabel.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 50));
        centerPanel.add(titleLabel, BorderLayout.CENTER);
        titleLabel.setForeground(Color.decode("#cd545b"));


        // Ajout du bouton "Qui sommes nous"
        JButton quiSommesNousButton = new JButton("Qui sommes nous ?");
        quiSommesNousButton.setFont(new Font("Arial", Font.PLAIN, 22));
        centerPanel.add(quiSommesNousButton, BorderLayout.AFTER_LAST_LINE);
        quiSommesNousButton.setForeground(Color.decode("#cd545b"));

        // Création du panel pour le bas de la page
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setPreferredSize(new Dimension(800, 80));
        bottomPanel.setBackground(Color.decode("#cd545b"));

        // Ajout des panels à la fenêtre principale
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
