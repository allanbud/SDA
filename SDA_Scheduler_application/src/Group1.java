import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Group1{

    static String[] ArrayOfStudents = {"Allan Budarin 1971 3 14",
            "Cierra Vega 1972 3 14",
            "Alden Cantrell 1941 4 24",
            "Kierra Gentry 2071 6 12",
            "Pierre Cox 1981 2 11",
            "Thomas Crane 1974 5 04",
            "Bradyn Kramer 1976 12 24",
            "Alvaro Mcgee 1979 10 16"};

    public static List<Person> ListOfStudents = new ArrayList<Person>();

    static {

        Student[] student = new Student[ArrayOfStudents.length];


        for (int i=0; i<ArrayOfStudents.length; i++)
        {
            student[i] = new Student();
                String[] StudentCredentials = ArrayOfStudents[i].split(" ");

            student[i].setFirstName(StudentCredentials[0]);

            student[i].setLastName(StudentCredentials[1]);

            student[i].setDateOfBirth(Integer.parseInt(StudentCredentials[2]),
                                      Integer.parseInt(StudentCredentials[3]),
                                      Integer.parseInt(StudentCredentials[4]));

           student[i].hasPreviousJavaKnowledge = true;

            ListOfStudents.add(student[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println(ListOfStudents);
    }

}
