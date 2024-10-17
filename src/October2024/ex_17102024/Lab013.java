package October2024.ex_17102024;

import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args){
        Scanner score = new Scanner(System.in);
        System.out.println("Enter your Grade\n");
        int Grade = score.nextInt();
        if(Grade >= 90 && Grade <= 100) {
            System.out.println("A");
        }
        else if(Grade >= 80 && Grade <=89){
            System.out.println("B");
        }

        else if (Grade >= 70 && Grade <= 79){
            System.out.println("C");

        }

        else if (Grade >= 60 && Grade <= 69){
            System.out.println("C");

        }

        else if (Grade >= 50 && Grade <= 59){
            System.out.println("C");

        }

        score.close();

    }
}
