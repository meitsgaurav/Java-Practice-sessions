class R
{
	static int i=j+100;
	static int j=10;
	public static void main(String [] args)
	{
		System.out.println("main:"+i+","+j);
	}
}
/*
 illegal forward reference
        static int i=j+100;
                     ^
*/