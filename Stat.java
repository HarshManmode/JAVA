class Mobile{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class Stat
{
public static void main(String[] args) {
    Mobile obj1=new Mobile();
    obj1.brand = "Apple";
    obj1.price = 100000;
    Mobile.name = "Smartphone";

    Mobile obj2= new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 50000;
    Mobile.name = "Smartphone";

    Mobile.name = "Phone";

    obj1.show();
    obj2.show();
}    
}
