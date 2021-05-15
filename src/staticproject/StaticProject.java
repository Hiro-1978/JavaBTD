
package staticproject;

public class StaticProject {
    public static void main(String[] args){
        Company c1 = new Company();
        c1.setName("AAA");
        System.out.println(c1.getName());
        
        Company c2 = new Company();
        c2.setName("BBB");
        c2.getName();
        System.out.println(c2.getName());
        
        Company.name= "CCCC";
        System.out.println(Company.name);
    }
}
