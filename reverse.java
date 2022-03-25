import java.util.*;
  
public class reverse {
  
    
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt(),l;
        Integer[] A=new Integer[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        reverse(A);    }
}