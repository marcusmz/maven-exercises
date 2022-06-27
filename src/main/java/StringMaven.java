import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class StringMaven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter something:");
        String x = sc.nextLine();
        System.out.println("You entered:");
        System.out.println(x);



        if (StringUtils.isNumeric(x)) {
            System.out.printf("%s is a number%n", x);

    } else {
            System.out.printf("%s is not a number%n", x);
            System.out.println(StringUtils.swapCase(x));
            System.out.println(StringUtils.reverse(x));
        }
    }
}
