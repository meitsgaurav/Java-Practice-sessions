public class A
{
	static int i;
}
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Main"+i);
	}
}


// cannot find symbol because i is a member of another class

//We can't make more than one class as a public in one program i.e. public class A and public class B