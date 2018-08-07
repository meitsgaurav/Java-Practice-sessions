class A 
{
	static int i;
	static
	{
		System.out.println("sib:"+ i); //direct
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


//If any value comes from the initializer in straight away then it is called indirect
