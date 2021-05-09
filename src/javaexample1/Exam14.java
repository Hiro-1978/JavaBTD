
package javaexample1;

import java.util.Scanner;

public class Exam14 {
    public static void main(String[] args){
        String password = "1234";
        String inputPassword;
        
        do{ //ทำก่อนแล้วค่อยเช็คเงื่อนไข
            Scanner kb = new Scanner(System.in);
            inputPassword = kb.nextLine();
        }
        while(!password.equals(inputPassword));{
             System.out.println("Hello World");
        }
    }
}
