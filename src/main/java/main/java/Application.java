package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {
    JFrame frame;
    private JPanel currentPanel;
    private String selectedRestaurant;

    public Application() {
        frame = new JFrame("Application de navigation");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        showHomePage();
    }

    void showHomePage() {
        JPanel panel = new JPanel(new BorderLayout());

        // En-tête
        JPanel headerPanel = createHeaderPanel();
        panel.add(headerPanel, BorderLayout.NORTH);

        // Centre de la page
        JPanel centerPanel = new JPanel(new BorderLayout());

        // Boutons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton loginButton = createButton("Se connecter", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showConnexionFormPage();
            }
        });
        JButton registerButton = createButton("S'inscrire", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showInscriptionFormPage();
            }
        });
        JButton descriptionButton = createButton("Description", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDescriptionPage();
            }
        });
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        buttonPanel.add(descriptionButton);
        centerPanel.add(buttonPanel, BorderLayout.NORTH);

        // Texte
        JLabel textLabel = new JLabel("EAT & SMILE");
        textLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerPanel.add(textLabel, BorderLayout.CENTER);

        panel.add(centerPanel, BorderLayout.CENTER);

        // Footer
        JPanel footerPanel = createFooterPanel();
        panel.add(footerPanel, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.setVisible(true);

    }

    private void showLoginPage() {
        ConnexionPage connexionPage = new ConnexionPage(this);
        JPanel panel = connexionPage.showLoginPage();

        updateContentPane(panel);
    }

    private void showInscriptionFormPage() {
        InscriptionFormPage inscriptionFormPage = new InscriptionFormPage(this);
        JPanel panel = inscriptionFormPage.createInscriptionFormPage();

        updateContentPane(panel);
    }

    private void showConnexionFormPage() {
        ConnexionFormPage connexionFormPage = new ConnexionFormPage(this);
        JPanel panel = connexionFormPage.createConnexionFormPage();

        updateContentPane(panel);
    }

    private void showDescriptionPage() {
        DescriptionPage descriptionPage = new DescriptionPage(this);
        JPanel panel = descriptionPage.createDescriptionPage();

        updateContentPane(panel);
    }

    void showRestaurantChoicesPage() {
        RestaurantChoicePage restaurantChoicePage = new RestaurantChoicePage(this);
        JPanel panel = restaurantChoicePage.showRestaurantChoicesPage();

        updateContentPane(panel);
    }
    void showPlatChoicePage(String selectedRestaurant) {
        PlatChoicePage platChoicePage = new PlatChoicePage(this, selectedRestaurant);
        JPanel panel = platChoicePage.showPlatChoicesPage();

        updateContentPane(panel);
    }
    JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel(new BorderLayout());

        // Changer la couleur du fond de l'en-tête
        headerPanel.setBackground(Color.ORANGE); // Remplacez Color.ORANGE par la couleur souhaitée
        headerPanel.setPreferredSize(new Dimension(800,80));

        // Logo à droite
        ImageIcon logoIcon = new ImageIcon("image/logo1.png");
        Image image = logoIcon.getImage().getScaledInstance(75, 70, Image.SCALE_SMOOTH);
        logoIcon = new ImageIcon(image);
        JLabel logoLabel = new JLabel("", logoIcon, JLabel.CENTER);
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        logoPanel.setBackground(Color.decode("#ff9e1b"));
        logoPanel.add(logoLabel);
        headerPanel.add(logoPanel, BorderLayout.EAST);

        return headerPanel;
    }

    JPanel createFooterPanel() {
        JPanel footerPanel = new JPanel(new BorderLayout());
        footerPanel.setPreferredSize(new Dimension(800, 80));
        footerPanel.setBackground(Color.decode("#cd545b"));

        return footerPanel;
    }

    JButton createButton(String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        return button;
    }

    void updateContentPane(JPanel panel) {
        if (currentPanel != null) {
            frame.getContentPane().remove(currentPanel);
        }

        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
        currentPanel = panel;
    }
    JPanel createHeaderPanelWithLogoAndHomeButton() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.decode("#ff9e1b"));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Bouton Accueil
        JButton homeButton = createButton("Accueil", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               showHomePage();
            }
        });
        headerPanel.add(homeButton, BorderLayout.WEST);

        // Logo à droite
        ImageIcon logoIcon = new ImageIcon("image/logo1.png");
        Image image = logoIcon.getImage().getScaledInstance(75, 70, Image.SCALE_SMOOTH);
        logoIcon = new ImageIcon(image);
        JLabel logoLabel = new JLabel("", logoIcon, JLabel.RIGHT);
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        logoPanel.setBackground(Color.decode("#ff9e1b"));
        logoPanel.add(logoLabel);
        headerPanel.add(logoPanel, BorderLayout.EAST);



        return headerPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Application();
            }
        });
    }


}




