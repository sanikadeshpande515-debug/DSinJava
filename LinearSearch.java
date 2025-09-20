import java.util.*;
public class LinearSearch
{
 public static void main(String S[])
    {
    int A []={10,20,30,40,50,33,92};
    int Flag=0;
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<A.length;i++)
    {
        if(A[i]==n)
        {
            Flag=1;
            break;

        }
    }
if(Flag==1)
{
    System.out.print("Element found");
    
}
else
{
    System.out.print("Element not found");
}
  
 }
}
    


