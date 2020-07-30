import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;

public class ReadFile {




        static List<String> result;

    static {
        try {
            result = Files.readAllLines(Paths.get("C:\\JAVA Projects\\SDA\\SDA_Scheduler_application\\src\\Persons.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

