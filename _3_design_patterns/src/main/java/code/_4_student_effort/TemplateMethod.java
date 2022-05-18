package code._4_student_effort;

import java.util.Arrays;

abstract class TemplateMethodBubleSort{
    void sort(Integer[] list){

    }
    abstract boolean numbersInCorrectOrder(Integer i1,Integer i2);
}

class AscBubleSort extends TemplateMethodBubleSort{
    void sort(Integer[] list)
    {
        for(int i=0;i<list.length;i++)
        {
            for(int j=i+1;j<list.length;j++)
            {
                if (this.numbersInCorrectOrder(list[i],list[j])) {
                    int aux=list[i];
                    list[i]=list[j];
                    list[j]=aux;
                }
            }
        }
    }
    boolean numbersInCorrectOrder(Integer i1,Integer i2){
        if (i1>i2) return true;
        else return false;
    }
}

class DescBubleSort extends TemplateMethodBubleSort{
    void sort(Integer[] list)
    {
        for(int i=0;i<list.length;i++)
        {
            for(int j=i+1;j<list.length;j++)
            {
                if (this.numbersInCorrectOrder(list[i],list[j])) {
                    int aux=list[i];
                    list[i]=list[j];
                    list[j]=aux;
                }
            }
        }
    }
    boolean numbersInCorrectOrder(Integer i1,Integer i2){
        if (i1<i2) return true;
        else return false;
    }
}

public class TemplateMethod {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01ofArr= Arrays.copyOf(arr,arr.length);
        Integer[] copy02ofArr= Arrays.copyOf(arr,arr.length);

        AscBubleSort asc=new AscBubleSort();
        asc.sort(copy01ofArr);
        DescBubleSort desc=new DescBubleSort();
        desc.sort(copy02ofArr);

        displaySorted(copy01ofArr);
        displaySorted(copy02ofArr);
    }

    public static void displaySorted(Integer[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
