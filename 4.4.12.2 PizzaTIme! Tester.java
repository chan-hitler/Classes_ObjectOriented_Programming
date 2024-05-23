public class PizzaTester extends ConsoleProgram
{
    public void run()
    {
        Pizza chicken = new Pizza("Square cut", "Chicken and Banana Peppers", 10);
        Pizza sausage = new Pizza("Pie cut", "Sausage and Pineapple", 12);
        Pizza pepperoni = new Pizza("Strip cut", "Pepperoni and Mushrooms", 8);

        System.out.println(chicken);
        System.out.println(sausage);
        System.out.println(pepperoni);
    }
}
