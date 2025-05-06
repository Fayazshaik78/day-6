public class Prodect {
    public static String  category = "Electronics";
    public String  productName ;
     
    public static void main(String[] args) {
        Prodect obj1 = new Prodect();
        Prodect obj2 = new Prodect ();
        obj1.productName = "Laptop";
        obj2.productName = " Smartphone";
        System.out.println("Category :"+ category);
        System.out.println("Product 1 :" + obj1.productName );
        System.out.println("Prodect 2 :"+ obj2.productName);

        
    }

    
}
