class F
{
	static
	{
		System.out.println("sib1:"); //direct
		test();
	}
	static
	{
		System.out.println("sib2:"+ i); //direct
		test();
	}
	static int i;
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
F.java:10: error: illegal forward reference
                System.out.println("sib2:"+ i); //direct
                                            ^
*/