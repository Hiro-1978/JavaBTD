
package foundProduct;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        String[] customerProducts = new String[5]; 
        Scanner scn = new Scanner(System.in);
        customerProducts[0] = scn.nextLine();
        customerProducts[1] = scn.nextLine();
        customerProducts[2] = scn.nextLine();
        customerProducts[3] = scn.nextLine();
        customerProducts[4] = scn.nextLine();
        foundProduct(customerProducts);
    }
    
    private static void foundProduct(String[] customerProducts){
            List products = Arrays.asList(new String[]{"Apple","Hamburger","Fish"});
            for(int i =0; i<customerProducts.length;i++){
                if (products.contains(customerProducts[i])){
                    System.out.println("Found ! "+customerProducts[i]);
                }
            }
       }
}
