package October2024.ex_16102024;

public class Lab009 {
    public static void main(String[] args){

        //Max of Three numbers
        int a = 5;
        int b = 6;
        int c = 7;

        int result = a >= b && a>=c ? a :b >= c ? b : c;
        System.out.println(result);
    }
}
