class I
{
	static int x = 10;
	static int y = test();
	static int z = 20;
	static int test()
	{
		return x;
	}
	public static void main(String[] args)
	{
		System.out.println(x);	
		System.out.println(y);	
		System.out.println(z);	
	}
}