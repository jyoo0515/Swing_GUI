import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage {
    private JPanel launchPanel;
    private JLabel topLabel;
    private JButton registerStudentButton;
    private JButton viewStudentsButton;
    private JFrame frame;

    public LaunchPage() {
        frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setResizable(false);
        frame.setContentPane(launchPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        registerStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new RegisterPage(frame);
            }
        });
        viewStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new ViewStudents(frame);
            }
        });
    }
}
