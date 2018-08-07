class M
{
	//static int i=test();
	public static void main(String []args)
	{
		System.out.println("M.Main");
		//System.out.println("test"+I.i);
	}
	static
	{
		System.out.println("K-sib1");
	}
}
class N
{
	static
	{
		System.out.println("N-sib");
	}
	public static void main(String [] args)
	{
		System.out.println("N-Main");
	}
}

//If we run M class then we get the output of that class and vice versa