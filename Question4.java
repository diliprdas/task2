package Task2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number;

        do{
            number=input.nextInt();
            if(number>0){
                System.out.println(" Good Going");
            }
            else{
                System.out.println(" It's Over");
            }
        }while(true);
    }
}
