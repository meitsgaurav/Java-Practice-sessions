class E
{
	static int i;
	public static void test()
	{
		System.out.println("test"+i);
		System.out.println("test"+E.i);
	}
}
class F
{
	public static void main(String [] args)
	{
		System.out.println("Main"+E.i);
		//E a=new E();
		E.test();
	}
}

/*
 non-static method test() cannot be referenced from a static context
                E.test();

				OR WE SHOULD WRITE PUBLIC STATIC VOID TEST()
*/
	