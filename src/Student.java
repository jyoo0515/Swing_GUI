import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void saveStudent() {
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter("students.txt", true));
            wr.write("\n" + this.name + "," + this.age);
            wr.close();
        } catch(Exception e) {
            System.out.println("Error!");
        }
    }

    public static ArrayList<Student> loadStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            BufferedReader rd = new BufferedReader(new FileReader("students.txt"));
            String line = null;
            while ((line = rd.readLine()) != null) {
                String[] info = line.split(",");
                Student student = new Student(info[0], Integer.parseInt(info[1]));
                students.add(student);
            }
        } catch(Exception e) {
            System.out.println("Error!");
        }
        return students;
    }
}
