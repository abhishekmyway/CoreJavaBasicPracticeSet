class H
{
	int x;
	static int h;
}
class I extends H
{
	int y;
}
class J extends I
{
	int z;
}
class Manager
{
	public static void main(String[] args)
	{
		H h1 = new H();
		I i1 = new I();
		J j1 = new J();
		System.out.println(h1.x);
		System.out.println(i1.x);
		System.out.println(j1.x);
		System.out.println(i1.y);
		System.out.println(j1.z);
		System.out.println(H.h);
	}
}