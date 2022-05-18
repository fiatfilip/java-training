package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Anagram {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Anagram.txt");
            BufferedReader read=new BufferedReader(file);
            FileWriter write=new FileWriter("_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\AnagramOut.txt");
            String listen=new String("listen");
            String line;
            while((line= read.readLine())!=null){
                String[] words=line.split(" ");
                for(int i=0;i< words.length;i++)
                {
                    if (listen.length()==words[i].length()) {
                        if (verifyAnagram(listen, words[i]) == true) {
                            System.out.println(words[i]);
                            write.write(words[i]);
                            write.write("\n");
                        }
                    }
                }
            }
            write.close();
            read.close();
            file.close();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    static public boolean verifyAnagram(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int[] allOk=new int[n1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if (s1.charAt(i)==s2.charAt(j)) {
                    allOk[i]++;
                }
            }
        }
        boolean finalCheck=true;
        for(int i=0;i<n1;i++)
        {
            if (allOk[i]!=1) finalCheck=false;
        }
        return finalCheck;
    }
}
