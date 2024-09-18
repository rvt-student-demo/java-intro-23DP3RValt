package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    // {
    //     // Make your first Hello World app!
    //     System.out.println("Once upon a time");
    //     System.out.println("there was");
    //     System.out.println("a program");
    // }
    // {
    //     int age = 17;
    //     String name = "Reinis";
    //     Boolean isonline = false;

    //     System.out.println(age);
    //     System.out.println(name);
    //     System.out.println(isonline);
    // }
    // {
    //     Scanner scanner = new Scanner(System.in);

    //     String name = scanner.nextLine();

    //     System.out.println("Sveiks " + name);
    // }
    // {
    //     Scanner scanner =new Scanner(System.in);

    //     String name = scanner.nextLine();
    //     String lastname = scanner.nextLine();
    //     String group = scanner.nextLine();

    //     System.out.println("Students: " + name + " " + lastname + ", grupa: " + group);
    // }
    // {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Give a number:");
    //     int value = Integer.valueOf(scanner.nextLine());
    //     System.out.println("You gave the number " + value);
    // }
    // {
    //         Scanner scanner = new Scanner(System.in);
    
    //         System.out.println("Give a number:");
    //         double value = Double.valueOf(scanner.nextLine());
    //         System.out.println("You gave the number " + value);
    // }
//     {
//             Scanner scanner = new Scanner(System.in);
    
//             System.out.println("Give a boolean:");
//             boolean value = Boolean.valueOf(scanner.nextLine());
//             System.out.println("You wrote " + value);
//     }

    // {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Give a number:");
    //     int value1 = Integer.valueOf(scanner.nextLine());
    //     int value2 = Integer.valueOf(scanner.nextLine());
        
    //     System.out.println(value1 + value2);
    //     System.out.println(value1 * value2);

    //     double dalisana = Double.valueOf(value1) / Double.valueOf(value2);
    //     System.out.println(dalisana);

    // }
{
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give the first number: ");
    int value1 = Integer.valueOf(scanner.nextLine());

    System.out.println("Give the second number: ");
    int value2 = Integer.valueOf(scanner.nextLine());

    int sum = value1 + value2;
    System.out.println(value1 + "+" + value2 + "=" + sum);

    int min = value1 - value2;
    System.out.println(value1 + "-" + value2 + "=" + min);

    int reiz = value1 * value2;
    System.out.println(value1 + "*" + value2 + "=" + reiz);

    double div = (double) value1 / value2;
    System.out.println(value1 + "/" + value2 + "=" + div);

}

}