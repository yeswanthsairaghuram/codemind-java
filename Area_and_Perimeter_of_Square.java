import java.util.*;
public class Square{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int area = x*x;
        int perimeter= 4*x;
        System.out.println(area + " " + perimeter);
    }
}