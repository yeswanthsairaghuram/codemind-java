import java.util.*;
public class Capacity{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int cap = t*s*b;
        System.out.printf("%d KB",cap);
    }
}