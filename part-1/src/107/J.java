class J
{
	J(int x)
	{
		System.out.println("X(int x)");
	}
	J(byte y)
	{
		System.out.println("X(int y)");
	}
	public static void main(String[] args)
	{
		J obj = new J(90);
		System.out.println("done");
	}
}