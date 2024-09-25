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
// {
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Give the first number: ");
//     int value1 = Integer.valueOf(scanner.nextLine());

//     System.out.println("Give the second number: ");
//     int value2 = Integer.valueOf(scanner.nextLine());

//     int sum = value1 + value2;
//     System.out.println(value1 + "+" + value2 + "=" + sum);

//     int min = value1 - value2;
//     System.out.println(value1 + "-" + value2 + "=" + min);

//     int reiz = value1 * value2;
//     System.out.println(value1 + "*" + value2 + "=" + reiz);

//     double div = (double) value1 / value2;
//     System.out.println(value1 + "/" + value2 + "=" + div);

// }

// {
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Give speed: ");
//     int speed = Integer.valueOf(scanner.nextLine());

//     if (speed > 120) {
//         System.out.println("Speeding ticket!");
//     }

// }

// {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Give points [0-100]:");
//     int points = Integer.valueOf(scanner.nextLine());

//     if (points < 0) {
//         System.out.println("impossible!");
//     }
//     else if (points <= 49) {
//         System.out.println("failed");
//     }
//     else if (points <= 59) {
//         System.out.println("1");
//     }
//     else if (points <= 69) {
//         System.out.println("2");
//     }
//     else if (points <= 79) {
//         System.out.println("3");
//     }
//     else if (points <= 89) {
//         System.out.println("4");
//     }
//     else if (points <= 100) {
//         System.out.println("5");
//     }
//     else if (points > 100) {
//         System.out.println("incredible!");
//     }
// }
// {
//     Scanner scanner = new Scanner(System.in);

// System.out.println("Enter a string");
// String input = scanner.nextLine();

// if (input.equals("zigijs") || input.equals("Zigijs")) {
//     System.out.println("Great! You read the instructions correctly.");
// } else {
//     System.out.println("Missed the mark!");
// }
// }
{
    Scanner scanner = new Scanner(System.in);

    System.out.println("Value of the gift");

    int value = Integer.valueOf(scanner.nextLine());

    if (value < 5000) {
        System.out.println("No tax!");
    } 
    
    else if (5000 <= value && value <= 25000) {
        System.out.println(100 + (value - 5000) * 0.08);
    } 
    
    else if (25000 < value && value <= 55000) {
        System.out.println(1700 + (value - 25000) * 0.1);
    } 
    
    else if (55000 < value && value <= 200000) {
        System.out.println(4700 + (value - 55000) * 0.12);
    } 
    
    else if (200000 < value && value <= 1000000) {
        System.out.println(4700 + (value - 200000) * 0.15);
    } 
    
    else if(1000000 < value) {
        System.out.println(142100 + (value - 1000000) * 0.17);
    }
}
}