package code._4_student_effort;

import java.util.Arrays;

interface SortingStrategy{
    void sort(Integer[] list);
}

class BubbleSort implements SortingStrategy{
    public void sort(Integer[] list){
        int n=list.length;
        int i,j,aux;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if (list[i]>list[j]){
                    aux=list[i];
                    list[i]=list[j];
                    list[j]=aux;
                }
            }
        }

    }
}

class MergeSort implements SortingStrategy {

    public void sort(Integer[] list) {
        if (list.length < 2) {
            return;
        }
        int mid = list.length / 2;
        Integer[] left = Arrays.copyOfRange(list, 0, mid);
        Integer[] right = Arrays.copyOfRange(list, mid, list.length);

        sort(left);
        sort(right);
        merge(left, right, list);
    }

    private void merge(Integer[] left, Integer[] right, Integer[] list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                list[listIndex++] = left[leftIndex++];
            } else {
                list[listIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            list[listIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            list[listIndex++] = right[rightIndex++];
        }
    }
}

public class Strategy {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr= Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr= Arrays.copyOf(arr,arr.length);

        displaySorted(new BubbleSort(),copy01OfArr);
        System.out.println("");
        displaySorted(new MergeSort(),copy02OfArr);
    }

    public static void displaySorted(SortingStrategy strategy,Integer[] arr){
        strategy.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
