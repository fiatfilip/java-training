package code._4_student_effort;

import java.io.*;

public class Phonebook {
    public static void main(String[] args)  {
        try {
            FileReader file=new FileReader("_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Phonebook.txt");
            BufferedReader read=new BufferedReader(file);
            String line;
            String abbey=new String("Abbey");
            String abdul=new String("Abdul");
            while((line=read.readLine())!=null){
                String words[]=line.split(" ");
                if (words[0].equals(abbey)){
                    System.out.println(words[0]+" "+words[1]);
                }
                else if(words[0].equals(abdul)){
                    System.out.println(words[0]+" "+words[1]);
                }
            }

        }catch (Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}
