public class Computer {
    public static String  os =  "Windows";
    public String ram ;
    public static void main(String[] args) {
       System.out.println ("os :"+Computer.os);
        Computer obj1 = new Computer();
        Computer obj2 = new Computer();
        obj1.ram = "8GB";
        obj2.ram = "16GB";
        System.out.println("Computer 1 RAM :" + obj1.ram);
        System.out.println("Computer 2 RAM :" + obj2.ram);
    }

    
    
}
