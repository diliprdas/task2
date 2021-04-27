package Task2;

import java.util.Scanner;

public class Question1<a> {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println("Print: ");

        if ((a / 3) == 0 && (a / 5) == 0) {
            System.out.println(" Consultadd JAVA Training");
        } else if ((a / 3) == 0) {
            System.out.println(" Consultadd");
        } else if (a / 5 == 0) {
            System.out.println("JAVA Training");
        }
    }
}
