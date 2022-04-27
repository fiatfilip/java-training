package code._4_student_effort;

import java.io.*;

public class NumberToLCD {
    public static void main(String[] args) {

        try{
            FileReader file=new FileReader("_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\numbersIN.txt");
            BufferedReader read=new BufferedReader(file);
            FileWriter fileout=new FileWriter("_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\numbersOUT.txt");
            BufferedWriter out=new BufferedWriter(fileout);
            int c;
            String line;
            while((line=read.readLine())!=null){
                int[] arr=new int[line.length()];
                int k=0;
                for(int i=0;i<line.length();i++)
                {
                    c=line.charAt(i);
                    arr[k]=c-48;
                    k++;
                }
                ArrToLcd(arr,out);
            }
            out.close();
            file.close();
            fileout.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    static public void ArrToLcd(int[] arr,BufferedWriter out) throws  IOException{
        for(int i=0;i<arr.length;i++)
        {
            switch (arr[i]){
                case 0:
                    out.write(" _ ");
                    break;
                case 1:
                    out.write("   ");
                    break;
                case 2:
                    out.write(" _ ");
                    break;
                case 3:
                    out.write(" _ ");
                    break;
                case 4:
                    out.write("   ");
                    break;
                case 5:
                    out.write(" _ ");
                    break;
                case 6:
                    out.write(" _ ");
                    break;
                case 7:
                    out.write(" _ ");
                    break;
                case 8:
                    out.write(" _ ");
                    break;
                case 9:
                    out.write(" _ ");
                    break;
                case -16:
                    out.write("   ");
                    break;

            }
        }
        out.write("\n");
        for(int i=0;i<arr.length;i++)
        {
            switch (arr[i]){
                case 0:
                    out.write("| |");
                    break;
                case 1:
                    out.write(" | ");
                    break;
                case 2:
                    out.write(" _|");
                    break;
                case 3:
                    out.write(" _|");
                    break;
                case 4:
                    out.write("|_|");
                    break;
                case 5:
                    out.write("|_ ");
                    break;
                case 6:
                    out.write("|_ ");
                    break;
                case 7:
                    out.write("  |");
                    break;
                case 8:
                    out.write("|_|");
                    break;
                case 9:
                    out.write("|_|");
                    break;
                case -16:
                    out.write("   ");
                    break;
            }
        }
        out.write("\n");
        for(int i=0;i<arr.length;i++)
        {
            switch (arr[i]){
                case 0:
                    out.write("|_|");
                    break;
                case 1:
                    out.write(" | ");
                    break;
                case 2:
                    out.write("|_ ");
                    break;
                case 3:
                    out.write(" _|");
                    break;
                case 4:
                    out.write("  |");
                    break;
                case 5:
                    out.write(" _|");
                    break;
                case 6:
                    out.write("|_|");
                    break;
                case 7:
                    out.write("  |");
                    break;
                case 8:
                    out.write("|_|");
                    break;
                case 9:
                    out.write(" _|");
                    break;
                case -16:
                    out.write("   ");
                    break;
            }
        }
        out.write("\n");
    }
}
