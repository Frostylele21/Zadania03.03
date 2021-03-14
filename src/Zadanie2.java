public class Zadanie2
{
    public static void main(String[] args)
    {
        String[] productsBookshop = {"podręcznik", "gazeta", "encyklopedia"};
        String[] productsBakery = {"chleb", "bułki", "drożdżówka"};

        Bookshop ksiegarnia = new Bookshop("Startowa 12", "Średni", productsBookshop);
        Bakery stonka = new Bakery("Chlebowa 32", "Mały", productsBakery);

        System.out.println(ksiegarnia.getInformation());
        System.out.println(stonka.getInformation());
    }
}
