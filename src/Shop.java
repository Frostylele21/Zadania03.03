public class Shop
{
    private String address;
    private String size;

    public String getInformation()
    {
        return "Adres: " +address+ " rozmiar: " +size;
    }

    public Shop(String address, String size)
    {
        this.address = address;
        this.size = size;
    }

    public String getAddress()
    {
        return address;
    }

    public String getSize()
    {
        return size;
    }
}
