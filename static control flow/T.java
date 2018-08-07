class T
{
	static int i=test1();
	static int j=test1();
	static int k=test1();
	public static int test1(){
		System.out.println("test:"+i+","+j+","+k);
		i+=1;
		j+=2;
		k+=3;
		return i+j+k;
	}
	public static void main(String [] args)
	{
		System.out.println("main:"+i+","+j+","+k);
	}
}

/*
test:0,0,0
test:6,2,3
test:7,17,6
main:8,19,36
*/