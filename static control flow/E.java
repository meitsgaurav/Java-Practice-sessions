class E
{
	static
	{
		System.out.println("sib1:"); //direct
		test();
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


//After i decleration both direct and indirect are allowed but before i decleration no one will be allowed.