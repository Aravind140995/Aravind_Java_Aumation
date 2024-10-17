package October2024.ex_16102024;

public class Lab010 {
    public static void main(String[] args){
        // Maximun of Three Numbers

        int x = 10;
        int y = 20;
        int z = 30;

        int result = (x>=y && x>=z)? x : (y>=z)? y : z;
        System.out.println("MAximum Number Is " + result);
    }
}
