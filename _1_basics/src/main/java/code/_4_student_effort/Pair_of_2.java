package code._4_student_effort;

public class Pair_of_2 {
    void run(int[] v)
    {
        int i,j,k,perechi=0;
        int n=v.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if (v[i]+v[j]==0){
                    perechi++;
                    for(k=j;k<n-1;k++)
                    {
                        v[k]=v[k+1];
                    }
                    n--;
                    for(k=i;k<n-1;k++)
                    {
                        v[k]=v[k+1];
                    }
                    n--;
                    i=0;
                    j=0;
                }
            }
        }
        System.out.println(perechi);

    }
}
