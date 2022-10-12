
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String args[]) {
        var a = new ArrayList<String>();

        int i = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("How Many List You want To create?: ");
        try {
            int times = s.nextInt();
            s.nextLine();
            while (i < times) {
                i++;
                try {

                    System.out.println("************************");
                    System.out.println("Name Something: ");
                    String name = s.nextLine();
                    var b = new ArrayList<String>();
                    System.out.println("Define That Name: ");
                    String value = s.nextLine();
                    System.out.println("************************");

                    a.add(name);
                    b.add(value);
                    String c = b.toString();
                    a.add(c);

                } catch (Exception e) {
                    System.out.println("Something went Wrong");
                }
                System.out.println("************************");
                System.out.println("This is your list. With your name, and your value []");
                System.out.println("-------------------------");
                System.out.println(a);
                System.out.println("-------------------------");

            }
        } catch (Exception e) {
            System.out.println("Something went Wrong!\nYou might have entered None integer value or a letter!");
        }

    }

}
