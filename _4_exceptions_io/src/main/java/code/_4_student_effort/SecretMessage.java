package code._4_student_effort;

import java.io.FileReader;

public class SecretMessage {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\SecretMessage.txt");
            int c;
            while((c=file.read())!=-1){
                if( (char)c>='A' && (char)c<='Z'){
                    if((char)c=='X'){
                        System.out.print(" ");
                    }else
                        System.out.print((char)c);
                }
            }

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
