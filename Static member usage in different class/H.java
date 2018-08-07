class G
{
	static int i;
	public static void test()
	{
		System.out.println("test"+i);
		System.out.println("test"+G.i);
	}
	static
	{
		System.out.println("H-sib1:");
	}
}
class H
{
	static
	{
		System.out.println("H-sib:");
	}
	public static void main(String [] args)
	{
		System.out.println("Main"+G.i);
		//E a=new E();
		G.test();
	}
}


/*
H-sib:
H-sib1:
Main0
test0
test0
*/

//Note : Static will always run first.The class which runs, the static will also run of that class first