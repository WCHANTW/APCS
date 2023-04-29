public class Outfit extends ClothingItem
{
    private Shoes shoes;
    private Pants pants;
    private Top top;
    
    public Outfit (Shoes ashoes, Pants aPants, Top aTop)
    {
        shoes = ashoes;
        pants = aPants;
        top = aTop;
    } 
    public String getDescription()
    {
        return shoes.getDescription() + "/" + pants.getDescription() + "/" + top.getDescription() + "outfit";
    }
    public double getPrice()
    {
        if (shoes.getPrice() + pants.getPrice() >=100
         || shoes.getPrice() + top.getPrice() >=100 
         || top.getPrice() + pants.getPrice() >=100)
         return 0.75 * (shoes.getPrice() + pants.getPrice() + top.getPrice());
        else
            return 0.90 * (shoes.getPrice() + pants.getPrice() + top.getPrice());
    }
}

