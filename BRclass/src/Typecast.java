import java.util.*;
import java.util.Scanner;
public class Typecast {
    public static void main(String[] args){
        double num1 = 50.49;
        int num2 = (int)num1;
        System.out.println(num1);
        System.out.println(num2);

//       String str = "123";
//       int num = Integer.parseInt(str);
//       System.out.println(num);

        long num = 123444L;
        int num3 = (int) num;
        System.out.println(num);
        System.out.println(num3);

        short s = 12345;
        long l = (long)s;
        System.out.println(s);
        System.out.println(l);

//        byte b = 100;
//        short s = 1009;
//        int i = 1234;
//        long l = 1234L;
//        System.out.println("byte: " + b);
//        System.out.println("short: " + s);
//        System.out.println("int: " + i);
//        System.out.println("long: " + l);
    }

}
