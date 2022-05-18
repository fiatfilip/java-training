package code._4_student_effort;

public class ArrayCustomIterator {
    int[] arr;
    int index;
    ArrayCustomIterator(int[] v){
        this.arr=v;
        this.index=0;
    }

    boolean hasNext(){
        boolean ok=false;
        if (index<arr.length) {
            ok=true;
        }
        return ok;
    }

    int next(){
        return this.arr[index++];
    }
}
