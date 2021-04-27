package Task2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the value: ");
        int num = input.nextInt();
        if (num / 2 != 0) {
            System.out.println(" NEW");
        } else {
            if (num > 2 && num <= 5) {
                System.out.println("OLD");
            } else {
                if (num >= 6 && num <= 30) {

                    System.out.println("NEW");
                } else {
                    System.out.println(" OLD");
                }
            }
        }
    }
}
