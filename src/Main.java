import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        Exercise ex1 = new Exercise();
        ex1.loop();

        System.out.println("---------------------------------------");

        Exercise2 ex2 = new Exercise2();
        ex2.number =11;
        System.out.println(ex2.checkNumber());

        System.out.println("---------------------------------------");

        Exercise3 ex3 = new Exercise3();
        ex3.var1 = 5;
        ex3.var2 = 10;
        System.out.println(ex3.returnSum());
        System.out.println(ex3.returnProduct());

        System.out.println("---------------------------------------");

        StudentMap studentMap = new StudentMap();

        studentMap.addStudent("student1", new Student("Alice", 20, 3.5));
        studentMap.addStudent("student2", new Student("Bob", 22, 3.8));
        studentMap.addStudent("student3", new Student("Charlie", 21, 3.2));

        Student student = studentMap.getStudent("student2");
        if (student != null) {
            System.out.println("Nome studente: " + student.getName() + ", Età: " + student.getAge() + ", GPA: " + student.getGPA());
        } else {
            System.out.println("Studente non trovato.");
        }

        System.out.println("Average GPA: " + studentMap.getAverageGPA());

        studentMap.removeStudent("student3");
        System.out.println("Average GPA dopo rimozione: " + studentMap.getAverageGPA());
            }
        }