
package oop1;

import java.util.Scanner;

public class OOP1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        //helloWorld();
        //int a = ab();
        //System.out.println(a);
        
        Car c1 = new Car();
        c1.start();
    }
    
    private static void helloWorld(){
        System.out.println("Hello World");
    }
    
    private static int ab(){
        int a = 10;
        int b = 5;
        int ab=a+b;
        return ab;
    }
}
