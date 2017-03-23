/**
 * Created by M60095A on 16-3-2017.
 */
import java.io.*;
import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] sNumbers;
        Stack<Integer> stack = new Stack<>();

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here


            sNumbers = line.split(" ");
            for(String n: sNumbers){
                stack.push(Integer.parseInt(n));
            }
        }

        Locale locale1 = new Locale("ENG","eng");
        Locale locale2 = new Locale("eng","eng");

        stack.forEach(System.out::println);
    }
}