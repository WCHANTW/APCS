public class HelloWorld {
    

    public static void main(String[] args)
    {
      System.out.println(args.length);

      Shoes my_shoes;
      Pants my_pants;
      Top my_top;

      //ClothingItem outfit = new Outfit( my_shoes, my_pants, my_top );
      ClothingItem outfit = new Outfit( my_pants, my_shoes, my_top );
    }  
}
