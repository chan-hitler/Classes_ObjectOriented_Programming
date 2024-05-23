public class PizzaTester extends ConsoleProgram
{
    public void run()
    {
        Pizza chicken = new Pizza("Square cut", "Chicken and Banana Peppers", 10);
        Pizza sausage = new Pizza("Pie cut", "Sausage and Pineapple", 12);
        
        System.out.println(chicken);
        System.out.println(sausage);
    }
}
