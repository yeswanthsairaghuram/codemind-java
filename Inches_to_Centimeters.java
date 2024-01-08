import java.util.*;
public class Inches{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float in = sc.nextFloat();
        double cm = 2.54*in;
        System.out.printf("%.2f",cm);
        
    }
}