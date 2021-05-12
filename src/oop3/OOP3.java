
package oop3;

public class OOP3 {
    public static void main(String[] args){
        double x=8, y=15;
        CalculationNew cal = new CalculationNew();
        System.out.println("ผลบวกของ X และ Y มีค่าเท่ากับ : "+cal.addition(x, y));
        System.out.println("ผลลบของ X และ Y มีค่าเท่ากับ : "+cal.subtraction(x, y));
        System.out.println("ผลคูณของ X และ Y มีค่าเท่ากับ : "+cal.multiply(x, y));
        System.out.println("ผลหารของ X และ Y มีค่าเท่ากับ : "+cal.subtraction(x, y));
    }
}
