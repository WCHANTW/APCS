public class HelloWorld 
{
    public static void main(String[] args) {
		//System.out.println(args.length);
		//System.out.println(args[0]);
		for(String a: args)
		{
			System.out.println(a);
		}
        
        Seats s = new Seats();

        s.twoTogether();
	}
}