import stud.Student;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Ragu");
        s1.setId(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Id: " + s1.getId());

    }
}