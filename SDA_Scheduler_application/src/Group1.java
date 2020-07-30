import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Group1{

    static String[] ArrayOfStudents = ReadFile.result.toArray(new String[0]);

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
