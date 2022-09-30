
import java.util.HashMap;

import java.util.Scanner;

public class Hashmap {

    public static HashMap<Integer, Integer> numbers;

    public static void main(String[] args) {
        numbers = new HashMap();
        program();
    }

    public static void Put() {

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a key ");
            Integer a = s.nextInt();
            System.out.println("Enter a value: ");
            Integer b = s.nextInt();
            if (b / 2 == 0) {
                System.out.println("*************************************");
                System.out.println("#####Prime Numbers is not Supported!##### ");
                System.out.println("*************************************");
                Put();
            } else {
                numbers.put(a, b);
                System.out.println("Key and Value added");
                System.out.println(numbers);
                program();
            }

        }

    }

    public static void Display() {

        System.out.println("*************************************");
        System.out.println(numbers);
        System.out.println("*************************************");
        program();
    }

    public static void Remove() {
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println(numbers);
        System.out.println("*************************************");
        System.out.println("please input the key of the number you want to remove Key=Value:");
        Integer cl = s.nextInt();

        numbers.remove(cl);
        System.out.println("*************************************");
        System.out.println(cl + " is removed in the list");
        System.out.println("*************************************");
        program();

    }

    public static void Clear() {

        System.out.println("List is Cleared");
        numbers.clear();
        System.out.println("*************************************");
        System.out.println(numbers);
        System.out.println("*************************************");
        program();
    }

    public static void program() {
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("A. Add Number ");
        System.out.println("B. Remove Number");
        System.out.println("C. Display Numbers");
        System.out.println("D. Clear Numbers");
        System.out.println("E. Exit");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println("Please Select a Letter: ");

        String choice = s.nextLine();
        while (true) {

            if (null == choice) {
            } else {
                switch (choice) {
                    case "A" -> {
                        Put();
                    }
                    case "B" -> {
                        Remove();
                    }
                    case "C" -> {
                        Display();

                    }
                    case "D" -> {
                        Clear();
                    }
                    case "E" -> {
                        System.out.println("The Program Is Terminated");
                        return;
                    }

                    default -> {
                        System.out.println("*************************************");
                        System.out.println("Invalid Syntax");
                        System.out.println("*************************************");
                        program();
                    }
                }
            }
        }
    }
}
