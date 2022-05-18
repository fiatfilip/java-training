package code._4_student_effort;

import java.util.Scanner;

public class Bell {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print(("n="));
        n=scan.nextInt();
        int arr2[]=new int[n];
        int lengthArr2=0;
        for(int i=0;i<n;i++)
        {
            int arr[]=new int[i+1];
            if (i==0){
                arr[0]=1;
            }
            else {
                for (int j = 0; j <= i; j++)
                {
                    if (j==0) {arr[0]=arr2[lengthArr2-1];}
                    else{
                        arr[j]=arr[j-1]+arr2[j-1];
                    }
                }
            }
            for(int k=0;k<arr.length;k++)
            {
                System.out.print(arr[k]+" ");
            }
            arr2=arr;
            lengthArr2=i+1;
            System.out.println();
        }

    }
}
