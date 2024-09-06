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
    {
        Scanner scanner =new Scanner(System.in);

        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + lastname + ", grupa: " + group);
    }
}
