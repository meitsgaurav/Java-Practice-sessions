class A
{
	static int i;
}
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Main"+A.i);
	}
}


// if we run java Hello then Run time error : Error: Could not find or load main class Hello

//If we run java B then it gives an output i.e. Main0 
//default value of static is 0

//We should run the main class because java programs are concerning about main class only.