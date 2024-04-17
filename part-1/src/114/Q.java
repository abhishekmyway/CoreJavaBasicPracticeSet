class Q
{
	Q(int i)
	{
		this();
		System.out.println("Q()");
	}
	Q()
	{
		this(20);
		System.out.println("Q(int)");
	}
}