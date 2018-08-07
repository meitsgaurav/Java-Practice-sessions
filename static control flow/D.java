class D
{
	static
	{
		System.out.println("sib1:"+ i); //direct
		//test();
	}
	static int i;
	static
	{
		System.out.println("sib2:"+ i); //direct
		test();
	}
	public static void test()
	{
		System.out.println("test:"+ i); //indirect
	}
	public static void main(String[] args) 
	{
		System.out.println("Main:"+i);
	}
}

/*
illegal forward reference
                System.out.println("sib1:"+ i); //direct
                                            ^
*/