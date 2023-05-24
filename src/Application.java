import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {
    private JFrame frame;
    private JPanel currentPanel;

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
                showLoginPage();
            }
        });
        JButton registerButton = createButton("S'inscrire", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRegistrationPage();
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
        buttonPanel.add((descriptionButton));
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
    private void showRegistrationPage() {
        InscriptionPage inscriptionPage = new InscriptionPage(this);
        JPanel panel = inscriptionPage.showInscriptionPage();

        updateContentPane(panel);
    }
    private void showDescriptionPage() {
        DescriptionPage descriptionPage = new DescriptionPage(this);
        JPanel panel = descriptionPage.createDescriptionPage();

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

    private JPanel createFooterPanel() {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Application();
            }
        });
    }
}