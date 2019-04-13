import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3FileExtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("^([A-Z]:\\\\)([\\w-_]+\\\\)+([\\w-_\\.]+)(\\.)([\\w]{2,4})$");


        String input = scanner.nextLine();
        Matcher m = p.matcher(input);

        if(m.matches()) {
            System.out.println("File name: " + m.group(3));
            System.out.println("File extension: " + m.group(5));
        }
    }
}
