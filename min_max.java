import java.util.Scanner;

public class min_max {

    public int maxim(int A[],int n)
    {
        int maxi=A[0];
        for(int i=1;i<n;i++)
        {
            if(A[i]>maxi)
                maxi=A[i];
        }
        return maxi;
    }
    public int minim(int A[],int n)
    {
        int mini=A[0];
        for(int i=1;i<n;i++)
        {
            if(A[i]<mini)
                mini=A[i];
        }
        return mini;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt(),l;
        int[] A=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        main find = new main();
        System.out.println("Max element:"+find.maxim(A,n));
        System.out.println("Min element:"+find.minim(A,n));
    }
    }