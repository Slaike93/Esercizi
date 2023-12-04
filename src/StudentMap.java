import java.util.HashMap;
import java.util.Map;

    public class StudentMap {

        private Map<String, Student> studentData;

        public StudentMap(){
            studentData = new HashMap<>();
        }

        public void addStudent(String key, Student student){
            studentData.put(key, student);
        }

        public void removeStudent(String key){
            studentData.remove(key);
        }

        public Student getStudent(String key){
            return studentData.get(key);
        }

        public double getAverageGPA(){
            double temp = 0.0;

            if(studentData.isEmpty()){
                return 0.0;
            }

            for(Student element : studentData.values()){
                temp += element.getGPA();
            }
            return temp/studentData.size();
        }

        public static void main(String[] args) {
            StudentMap studMap = new StudentMap();
        }
    }

    class Student {
        private String name;
        private int age;
        private double gpa;

        public Student(String name, int age, double gpa){
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public double getGPA(){
            return gpa;
        }
    }
