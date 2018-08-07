class C
{
	static
	{
		System.out.println("sib1:"+ i); //direct
		//test();
	}
	static int i=10;
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

//Compie time error

//Only after variable decleration direct reading is allowed.

//Indirect reading is allowed everyway