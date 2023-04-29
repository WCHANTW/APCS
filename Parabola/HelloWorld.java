public class HelloWorld {

    public static void main(String[] args) {
		//System.out.println(args.length);
		//System.out.println(args[0]);
		for(String a: args)
		{
			System.out.println(a);
		}
		
        Parabola par1 = new Parabola(2, -6, -5);
        double axis1 = par1.getAxis();
        System.out.println(axis1);
        boolean onGraph1 = par1.isOnGraph(4, 3);
        System.out.println(onGraph1);

		Parabola par2 = new Parabola(4, 2, -3);
        double axis2 = par2.getAxis();
        System.out.println(axis2);
        boolean onGraph2 = par2.isOnGraph(4, 3);
        System.out.println(onGraph2);
	}
    
}
