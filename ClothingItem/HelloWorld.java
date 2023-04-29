public class HelloWorld {
    

    public static void main(String[] args)
    {
      System.out.println(args.length);

      Shoes my_shoes = new Shoes( "sneakers", 40);
      Pants my_pants = new Pants( "blue jeans", 50);
      Top my_top = new Top( "T-shirt", 10);

      ClothingItem outfit = new Outfit( my_shoes, my_pants, my_top );
      //ClothingItem outfit = new Outfit( my_pants, my_shoes, my_top );

      System.out.println(outfit.getDescription());
      System.out.println(outfit.getPrice());
    }  
}
