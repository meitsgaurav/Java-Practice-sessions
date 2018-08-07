class I
{
	static int i=test();
	public static int test()
	{
		System.out.println("test"+i);
		System.out.println("test"+I.i);
		return 10;
	}
	static
	{
		System.out.println("H-sib1:"+i);
	}
}
class J
{
	static
	{
		System.out.println("H-sib:");
	}
	public static void main(String [] args)
	{
		System.out.println("Main"+I.i);
		//E a=new E();
		I.test();
	}
}

/*
H-sib:
test0
test0
H-sib1:10
Main10
test10
test10
*/