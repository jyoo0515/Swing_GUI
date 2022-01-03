import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewStudents {
    private JPanel viewPanel;
    private JLabel mainLabel;
    private JScrollPane scrollPane;
    private JTable studentTable;
    private JButton backButton;
    private JFrame frame;

    public ViewStudents(JFrame launchFrame) {
        frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setResizable(true);
        frame.pack();
        frame.setLocationRelativeTo(launchFrame);

        frame.setContentPane(viewPanel);
        frame.setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new LaunchPage();
            }
        });
    }

    private void createUIComponents() {
        ArrayList<Student> students = Student.loadStudents();
        DefaultTableModel tableModel = new DefaultTableModel(new String[] {"Name", "Age"}, 0);

        for (Student student : students) {
            String[] data = new String[2];
            data[0] = student.getName();
            data[1] = Integer.toString(student.getAge());
            tableModel.addRow(data);
        }
        studentTable = new JTable(tableModel);
        scrollPane = new JScrollPane();
        scrollPane.add(studentTable);
    }
}
