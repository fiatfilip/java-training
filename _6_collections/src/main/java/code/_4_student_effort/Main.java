package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> leaders=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(1);
      //  list.add(10);
        for(int i=0;i<list.size();i++)
        {
            List<Integer> auxList=new ArrayList<Integer>();
                for(int j=i+1;j<list.size();j++)
                {
                    auxList.add(list.get(j));
                }
          if  (verifyLeader(auxList,list.get(i))) leaders.add(list.get(i));
        }
        System.out.println("Initial List : "+list);
        System.out.println("Leaders : "+leaders);
    }

    public static boolean verifyLeader(List<Integer> list,int leader)
    {
        boolean ok=true;
        for(int i=0;i<list.size();i++)
        {
            if (list.get(i)>leader || list.get(i)==leader) ok=false;
        }
        return ok;
    }
}
