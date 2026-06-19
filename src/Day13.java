import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/*import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Day13 {
    static void main(){
        Path path=Path.of("files","report.txt");
        try{
            List<String> data= Files.readAllLines(path);
            for(String line:data) {
                System.out.println(line);
            }
                List<String> newData = new ArrayList<>();
                newData.add("Student1");
                newData.add("student2");
                newData.add("student3");
                newData.add("student4");
                newData.add("student5");
        }catch (IOException io){
         io.printStackTrace();
        }
    }
}*/
public class Day13{
    static void main() {
                Path path = Path.of("files","student.csv");
                try {
                    List<String> student = Files.readAllLines(path);

                    for (String line : student) {
                        String[] row = line.split(",");
                        for (int i = 0; i < row.length; i++) {
                            System.out.print(row[i] + " | ");
                        }
                        System.out.println();
                    }
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
        }

