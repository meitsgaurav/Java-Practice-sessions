class G
{
	static
	{
		System.out.println("sib1:"); //direct
		test();
	}
	static
	{
		System.out.println("sib2:"); //direct
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
sib1:
test:0
sib2:
test:0
Main:0
*/