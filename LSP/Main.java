package LSP;

public class Main
{
    public static void main(String[] args)
    {
        Penguin penguin = new Penguin();
        penguin.move();
        
        Ostrich ostrich = new Ostrich();
        ostrich.move();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.move();
        
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.move();

    }
}
