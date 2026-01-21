class Computer{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMePen(int cost)
    {
        if(cost >=5)
        {
            return "Pen can be bought";
        }
        else
            return "Give more money";
    }
}

public class Methods
{
    public static void main(String[] args) {
        
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(2);
        System.out.println(str);
    }
}