//Take input percentage of a student print the three digit number or not.
package conditions;
import java.util.Scanner;
public class Percentage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage:");
        int n = sc.nextInt();
        if(n>90){
            System.out.println("Excellent");
        }
        else if(n>80) {
            System.out.println("very Good");
        } else if (n>70) {
            System.out.println("good");

        } else if (n>60) {
            System.out.println("can do better");

        } else if (n>50) {
            System.out.println("average");

        } else if (n<40) {
            System.out.println("Fail");

        }
    }
}
