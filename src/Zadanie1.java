public class Zadanie1
{
    public static void main(String[] args)
    {
        Dog pies = new Dog();
        Cat kot = new Cat();

        pies.setColor("biały");
        pies.setName("Puszek");
        kot.setColor("szary");
        kot.setName("Burek");

        System.out.println(pies.makeSound());
        System.out.println(kot.makeSound());
    }
}
