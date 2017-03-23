import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by M60095A on 1-2-2017.
 */
public class PathDemo {

    public static void main(String[] args) {

        Path path1 = Paths.get("C:\\dev\\test");
        Path path2 = Paths.get("C:\\Windows\\test");

        Path relativePath = path1.relativize(path2);

        System.out.println(relativePath); // ..\..\Windows\test
        System.out.println(path1.resolve(relativePath)); // C:\dev\test\..\..\Windows\test
        System.out.println(path1.resolve(relativePath).normalize()); // C:\Windows\test



    }
}
