
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static ArrayList<String> numbers;

    public static void main(String[] args) {
        numbers= new ArrayList();
        program();
    }

    
    public static void Add() {

        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please Input a positive number: ");
        Integer num = s.nextInt();
        if(num<0){
             System.out.println("*************************************");
             System.out.println("#####Negative Numbers is not Supported!##### ");
             System.out.println("*************************************");
             Add();
        }else{
        String n = num.toString();
        numbers.add(n);
        System.out.println("*************************************");
        System.out.println(n + " is Added on The List");
        System.out.println("*************************************");
        program();  
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
        System.out.println("please input the number you want to remove");
        String cl = s.nextLine();
        String cle = cl;
        numbers.remove(cle);
        System.out.println("*************************************");
        System.out.println(cl + " is removed in the list");
        System.out.println("*************************************");
        program();
    }

    public static void Clear() {
        
        System.out.println("List is Cleared");
        numbers.removeAll(numbers);
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
                        Add();
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
