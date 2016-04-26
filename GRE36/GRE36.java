// see video:
// https://www.youtube.com/watch?v=rR3oWYba-nc

class BaseClass
{
	int data = 101;
	public void print ()
	{
		System.out.print ( data + " " );
	}
	public void fun ()
	{
		print ();
	}
}

class SubClass extends BaseClass
{
	int data = 202;
	public void print ()
	{
		System.out.print ( data + " " );
	}
}

class GRE36
{
	public static void main ( String[] args )
	{
		BaseClass obj = new SubClass ();
		obj.print ();
		obj.fun ();
		System.out.println ( obj.data );
	}
}
