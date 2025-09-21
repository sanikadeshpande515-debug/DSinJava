public class BubbleSort
{ 
    public static void main(String s[])
    {
        int A[]={183, 912, 347, 726, 504, 891, 312, 479, 658, 723, 145, 801, 637, 215, 398};
        int temp=0;
        System.out.print("Array before sort:");
        for(int i=0; i<A.length;i++)
        {
            System.out.print(A[i] +"\t");

        }
        for(int k=0; k<A.length;k++)
        {
            for(int j=k+1;j<A.length;j++)
            {
                if(A[k]>A[j])
                {    
                    temp=A[k];
                    A[k]=A[j];
                    A[j]=temp;

                
                }
            }
        }
        System.out.print("Array after sort");
        for(int i=0; i<A.length;i++)
        {
            System.out.print(A[i] +"\t");

        }

    }
}
