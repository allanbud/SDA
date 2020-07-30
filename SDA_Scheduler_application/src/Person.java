
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    protected String FirstName;
    protected String LastName;
    protected Date DateOfBirth;

    public Person (String FirstName, String LastName, int Year, int Month, int Day){
        this.FirstName = FirstName;
        this.LastName = LastName;
        Calendar cal = Calendar.getInstance();
        cal.set( Year, Month, Day );
        this.DateOfBirth = cal.getTime();
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {

        // Calendar objects for "today" and "date of birth"...

        Calendar today = Calendar.getInstance();
        Calendar PersonName = new GregorianCalendar();
        PersonName.setTime(DateOfBirth);

        // Compute basic difference in years ....

        int yearDiff = today.get(Calendar.YEAR) - PersonName.get(Calendar.YEAR);

        // PersonName still needs to occur this year...

        if ( today.get(Calendar.MONTH) < PersonName.get(Calendar.MONTH) )
            yearDiff = yearDiff - 1;
        else if (today.get(Calendar.MONTH) == PersonName.get(Calendar.MONTH) &&
                today.get(Calendar.DATE)   < PersonName.get(Calendar.DATE) ) {
            yearDiff = yearDiff - 1;
        }

        return yearDiff;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }


    //Forming a string that includes full credentials
    //The toString() method returns the string representation of the object.
    public String toString() {
        String PersonCredentials = "Name: " + getFirstName() + " " + getLastName() + "\n";
        PersonCredentials += " Age: " + getAge() + "\n";
        return PersonCredentials;
    }


    public static void main ( String [] args ) {
        Person Allan_Budarin = new Person("Allan", "Budarin",1971, Calendar.MARCH, 14 );
        //Allan_Budarin.setDateOfBirth ( 1971, Calendar.MARCH, 14 );
        System.out.println(Allan_Budarin);
    }


}