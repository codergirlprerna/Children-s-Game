import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Learning App for Kids");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Add buttons
        JButton alphabetButton = new JButton("Learn Alphabets");
        JButton numberButton = new JButton("Learn Numbers");
        JButton quizButton = new JButton("Take a Quiz");

        panel.add(alphabetButton);
        panel.add(numberButton);
        panel.add(quizButton);

        frame.add(panel);
        frame.setVisible(true);

        // Add action listeners
        alphabetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "A for Apple!");
            }
        });

        numberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "1, 2, 3, ...");
            }
        });

        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "What is 2 + 2?");
            }
        });
    }
}
