package Student;

import java.util.ArrayList;
import java.util.List;


public class StudentTest {
    //main method
    public static void main(String[] args) {
        List<StudentClass> studentList = new ArrayList<>();
        studentList.add(new StudentClass(1, "Rohan", "rohan@gmail.com", "passwo", "9235876410"));
        studentList.add(new StudentClass(2, "Sohan", "sohan@gmail.com", "passwo", "9235867410"));
        studentList.add(new StudentClass(3, "Mohan", "mohan@gmail.com", "passwo", "9306587410"));
        studentList.add(new StudentClass(4, "Pohan", "pohan@gmail.com", "passwo", "9265874110"));
        studentList.add(new StudentClass(5, "Kohan", "kohan@gmail.com", "passwo", "92565874120"));
        studentList.add(new StudentClass(6, "Raman", "raman@gmail.com", "passwo", "9236741020"));
        studentList.add(new StudentClass(7, "Daman", "daman@gmail.com", "passwo", "9258745210"));
        studentList.add(new StudentClass(8, "Tarun", "tarun@gmail.com", "passwo", "9658749110"));
        studentList.add(new StudentClass(9, "Barun", "barun@gmail.com", "passwo", "9238741250"));
        studentList.add(new StudentClass(10, "Karuna", "karun@gmail.com", "passwo", "9658741740"));


        System.out.println(studentList);

    }
}
