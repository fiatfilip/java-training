package code._4_student_effort;

public class FooBarQix {
    String compute(int x)
    {
        String result=new String("");
        int ok=0,aux;
        if (x%3==0) {result+="Foo";ok=1;}
        if (x%5==0) {result+="Bar";ok=1;}
        if (x%7==0) {result+="Qix";ok=1;}

        aux=inversNumber(x);
        while (aux!=0)
        {
            int c=aux%10;
            if (c==3) {result+="Foo";ok=1;}
            if (c==5) {result+="Bar";ok=1;}
            if (c==7) {result+="Qix";ok=1;}
            aux=aux/10;
        }

        if (ok==0) result=""+x;
        return result;
    }

    String compute2(int x)
    {
        String result=new String("");
        int ok=0,aux;
        if (x%3==0) {result+="Foo";ok=1;}
        if (x%5==0) {result+="Bar";ok=1;}
        if (x%7==0) {result+="Qix";ok=1;}

        aux=inversNumber(x);
        while (aux!=0)
        {
            int c=aux%10;
            if (c==0) {result+="*";ok=1;}
            if (c==3) {result+="Foo";ok=1;}
            if (c==5) {result+="Bar";ok=1;}
            if (c==7) {result+="Qix";ok=1;}
            aux=aux/10;
        }

        if (ok==0) result=""+x;
        return result;
    }

    int inversNumber(int n)
    {
        int r=0,c;
        while(n!=0)
        {
            r=r*10;
            c=n%10;
            r=r+c;
            n=n/10;

        }
        return r;
    }
}
