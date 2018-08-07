class K
{
	static int i=test();
	public static int test()
	{
		System.out.println("test"+i);
		//System.out.println("test"+I.i);
		return i+10;
	}
	static
	{
		System.out.println("K-sib1:"+i);
		i+=10;
	}
}
class L
{
	static
	{
		System.out.println("L-sib:");
	}
	public static void main(String [] args)
	{
		System.out.println("Main Begin");
		System.out.println(K.i);
		System.out.println("-----------");
		K.i +=10;
		System.out.println("-----------");
		System.out.println(K.test());
		System.out.println("-----------");
		System.out.println("Main End");
		//E a=new E();
		//I.test();
	}
}

/*
L-sib:
Main Begin
test0
K-sib1:10
20
-----------
-----------
test30
40
-----------
Main End
*/