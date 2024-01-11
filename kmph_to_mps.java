import java.util.*;
public class Speed{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int kmph=sc.nextInt();
        double mph=0.277778*kmph;
        System.out.printf("%.2f",mph);
    }
}