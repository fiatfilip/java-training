package code._4_student_effort;


import java.util.Scanner;
import java.util.Arrays;


public class Pascal {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Introduceti marimea triunghiului : ");
        n=scan.nextInt();
        int[] arr2=new int[n];
        for(int i=1;i<n;i++) {
            int[] arr = new int[i];
            if (i%2==0) {
                for (int j = 0; j < arr.length / 2; j++) {
                    if (j!=0){
                        arr[j]=arr2[j-1]+arr2[j];
                        arr[arr.length - (j + 1)] = arr[j];
                    }
                    else {
                        arr[j] = j + 1;
                        arr[arr.length - (j + 1)] = arr[j];
                    }
                }
            }
            else {
                for (int j = 0; j <= arr.length / 2; j++) {
                    if (j!=0){
                        arr[j]=arr2[j-1]+arr2[j];
                        arr[arr.length - (j + 1)] = arr[j];
                    }
                    else {
                        arr[j] = j + 1;
                        arr[arr.length - (j + 1)] = arr[j];
                    }
                }
            }
            if (n%2==0) {
                for (int k = 0; k < n-arr.length / 2; k++)
                {
                    System.out.print(" ");
                }
            }
            else{
                for (int k = 0; k < n-arr.length / 2; k++)
                {
                    System.out.print(" ");
                }
            }
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]+" ");
            }
            arr2=Arrays.copyOf(arr,arr.length);
            System.out.println();
        }

    }
}
