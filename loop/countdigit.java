package loop;
import java.util.*;

public class countdigit {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int count =0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
