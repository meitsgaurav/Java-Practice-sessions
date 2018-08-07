class B
{
	static int i=10;
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


/*
sib:10
test:10
Main:10
*/