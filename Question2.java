package Task2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Value of number 1: ");
        int first = input.nextInt();
        System.out.println(" Enter the value of number 2: ");
        int second = input.nextInt();
        int Choose;
        Choose = input.nextInt();

        do {
            System.out.println("1-Addition");
            System.out.println("2-Subtraction");
            System.out.println("3-Division");
            System.out.println("4- Multiplication");
            System.out.println("5-Average");
            System.out.println(" Enter your choice: ");
            switch (Choose) {

                case 1:
                    int sum= first+second;
                    System.out.println(" Addition: "+sum);
                    if(sum<0){
                        System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number");
                    }
                    break;

                case 2:

                    int subtract= first-second;
                    System.out.println("Subtraction: "+subtract);
                    if(subtract<0){
                    System.out.println("Oops option X(1/2/3/4/5) is returning the negative number");
}
                    break;

                case 3:
                    float division= first/second;
                    System.out.println("Division: "+ division);
                    if(division<0){
                        System.out.println("Oops option X(1/2/3/4/5) is returning the negative number ");
                    }
                    break;

                case 4:

                    int multliplication=first*second;
                    System.out.println(" Multliplication: "+ multliplication);
                    if(multliplication<0){
                        System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number");

                    }
                    break;

                case 5:
                    float ave=((first+second)/2);
                    System.out.println(" Average: "+ave);
                    if(ave<0){
                        System.out.println("Oops option X(1/2/3/4/5) is returning the negative number");
                    }
                    break;

                default:
                    break;

            }






            }while(Choose<6);

        }
    }
