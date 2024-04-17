class F
{
	int i;
	static int j;
	void test1()
	{
		System.out.println("Test1");
	}
	static void test2()
	{
		System.out.println("Test2");
	}
}
class G extends F
{
	static void test3()
	{
		System.out.println("Test3");
	}
	public static void main(String[] args)
	{
		F.j = 10;
		F.test2();
		G.test2();
		G.test3();
		System.out.println(G.j);
		F f1 = new F();
		f1.i = 20;
		f1.test1();
		G g1 = new G();
		g1.i = 30;
		g1.k = 50;
		g1.test1();
	}
}