package pack1;
class I
{
	private static I obj = null;
	private I()
	{
		System.out.println("obj created");
	}
	static
	{
		obj = new I();
	}
	public static I getObject()
	{
		System.out.println("I getObject");
		return obj;
	}
}
class Manager
{
	public static void main(String[] args)
	{
		// I i1 = new I();
		I i2 = I.getObject();
		I i3 = I.getObject();
		I i4 = I.getObject();

		System.out.println("done");
	}
}