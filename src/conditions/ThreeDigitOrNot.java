package conditions;
import java.util.Scanner;
public class ThreeDigitOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
      /*  System.out.println("enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter Third number:");
        int c = sc.nextInt();*/
        if (num > 99 && num <1000) {
            System.out.println("Number is Three digit");
        }else
            System.out.println("Number is not Three Digit");
        }
    }

