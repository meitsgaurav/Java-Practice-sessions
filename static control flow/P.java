class Q
{
	static
	{
		System.out.println("sib:"+Q.i);
	}
	static int i=10;
	public static void main(String [] args)
	{
		System.out.println("main:"+i);
	}
}

/*
sib:0
main:10
*/