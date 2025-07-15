import java.util.*;
import java.util.Scanner;
public class day2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your Name is "+name);

        System.out.println("Enter your Roll no");
        long roll = sc.nextLong();
        System.out.println("My roll no is "+ roll);

        System.out.println("Enter your session");
        int ses = sc.nextInt();
        System.out.println("Session "+ ses);

        System.out.println("Enter you Mobile No.");
        long mobile = sc.nextLong();
        System.out.println("My Mobile no. is "+ mobile);

        System.out.println("Enter blood group");
        String blood = sc.nextLine();
        System.out.println("Blood group" + blood);

    }
}
