import java.util.*;
public class Investment{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x >= 2*y){
            System.out.println("YES");
        }
        
        else{
            System.out.println("NO");
        }
    }
}