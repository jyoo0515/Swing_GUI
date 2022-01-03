import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage {
    private JPanel registerPanel;
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel ageLabel;
    private JTextField ageField;
    private JButton registerButton;
    private JButton clearButton;
    private JLabel preferenceLabel;
    private JSlider preferenceSlider;
    private JFrame frame;

    public RegisterPage(JFrame launchFrame) {
        frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setResizable(false);
        frame.setContentPane(registerPanel);
        frame.pack();
        frame.setLocationRelativeTo(launchFrame);
        frame.setVisible(true);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                System.out.println( preferenceSlider.getValue());

                Student newStudent = new Student(name, age);
                newStudent.saveStudent();
                frame.setVisible(false);
                new LaunchPage();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                ageField.setText("");
            }
        });
    }
}
