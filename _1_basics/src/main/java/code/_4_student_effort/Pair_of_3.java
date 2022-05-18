package code._4_student_effort;

public class Pair_of_3 {
    void run(int[] v)
    {
        int i,j,l,k,perechi=0;
        int n=v.length;
        for(i=0;i<n-2;i++) {
            if (n<3) break;
            for(j=i+1;j<n-1;j++) {
                for (l = j + 1; l < n; l++) {
                    if (v[i] + v[j] + v[l] == 0) {
                        perechi++;
                        System.out.println(v[i]+" "+v[j]+" "+v[l]);
                        for (k = l; k < n - 1; k++) {
                            v[k] = v[k + 1];
                        }
                        n--;
                        for (k = j; k < n - 1; k++) {
                            v[k] = v[k + 1];
                        }
                        n--;
                        for (k = i; k < n - 1; k++) {
                            v[k] = v[k + 1];
                        }
                        n--;
                        i = 0;
                        j = 0;
                        l = 0;
                    }
                }
            }
        }
        System.out.println(perechi);

    }
}
