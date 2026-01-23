class Human{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}

class Encapsulation
{
    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Harsh");

        Human obj2 = new Human();
        obj2.setAge(20);
        obj2.setName("Siddhesh");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}