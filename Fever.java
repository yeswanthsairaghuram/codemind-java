import java.util.*;
public class Fever{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>98){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}