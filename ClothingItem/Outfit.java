public class Outfit extends ClothingItem {

    Shoes oShoes;
    Pants oPants;
    Top oTop;

    public Outfit(Shoes s, Pants p, Top t)
    {
        oShoes = s;
        oPants = p;
        oTop = t;
    }

    public String getDescription()
    {
        return oShoes.getDescription()+'/'+oPants.getDescription()+'/'+oTop.getDescription()+" outfit";
    }

    public double getPrice()
    {
        double oTotal = oShoes.getPrice()+oPants.getPrice()+oTop.getPrice();

        if( oTotal > 100)
        {
            oTotal *= 0.75;
        }
        else
        {
            oTotal *= 0.9;
        }
        return oTotal;
    }
}
