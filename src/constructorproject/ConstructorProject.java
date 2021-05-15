
package constructorproject;

public class ConstructorProject {
    public static void main(String[] args){
    Customer c1 = new Customer();
    
    Customer c2 = new Customer("Paisan","Pompadech","Thailand");
    System.out.println(c2.getName()+" "+c2.getLastName()+" "+c2.getAddress());
    }
}
