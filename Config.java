public class Config {
  public static String configName = "System config" ;
   public String  settingValue;
   public static void main(String[] args) {
       Config obj1 = new Config();
       Config obj2 = new Config();
       obj1.settingValue = "dark mode";
       obj2.settingValue = "Light mode";
       Config.configName = "System Config";
       System.out.println("Config Name :" +Config.configName);
       System.out.println("Setting 1:" +obj1.settingValue);
    System.out.println("Setting 2 :"+ obj2.settingValue);
   }
}
