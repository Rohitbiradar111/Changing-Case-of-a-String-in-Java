//This program performs two operations on a String in Java
//1. First character of the string is capitalized
//2. Whole String is changed to upper case

import java.util.Scanner;
public class StringChangeCase {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
        System.out.println(str.toUpperCase());
    }
}