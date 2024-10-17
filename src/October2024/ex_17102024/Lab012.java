package October2024.ex_17102024;
import  java.util.Scanner;

public class Lab012 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age\n");
        int age = sc.nextInt();

        System.out.println(age > 18? "Allow" : "Not Allow");

    }
}
