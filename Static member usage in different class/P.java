class O
{
	//static int i=test();
	public static void main(String []args)
	{
		System.out.println("O.Main");
		//System.out.println("test"+I.i);
	}
	static
	{
		System.out.println("O-sib1");
	}
}
class P
{
	static
	{
		System.out.println("p-sib");
	}
	public static void main(String [] p)
	{
		System.out.println("p-Main begin");
		O.main(null);
		System.out.println("----------");
		O.main(p);
		System.out.println("----------");
		System.out.println("p-Main End");
	}
}