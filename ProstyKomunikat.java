import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProstyKomunikat {
    public static void main(String[] args) {
        // Tworzenie głównego okna aplikacji
        JFrame frame = new JFrame("Prosty Komunikat");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centrowanie okna

        // Tworzenie panelu i komponentów
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Kliknij przycisk...");
        JButton button = new JButton("Kliknij mnie");

        // Dodanie komponentów do panelu
        panel.add(label);
        panel.add(button);
        frame.add(panel);

        // Rejestracja słuchacza zdarzeń dla przycisku (Click Event)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Zmiana tekstu etykiety po kliknięciu
                label.setText("Przycisk został kliknięty!");
            }
        });

        // Wyświetlenie okna
        frame.setVisible(true);
    }
}
