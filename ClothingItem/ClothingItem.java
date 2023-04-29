public class ClothingItem {
    
    private String description;
    private double price;

    public ClothingItem()
    {
        description = "";
        price =0;
    }

    public ClothingItem( String desc, double aPrice)
    {
        description = desc;
        price = aPrice;
    }

    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return price;
    }
}
