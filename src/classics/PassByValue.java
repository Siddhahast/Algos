package classics;

import java.math.BigDecimal;

public class PassByValue
{

	public static void main(String[] args)
	{
		Foo foo = new Foo(10);
		
		changeFoo(foo);
		System.out.println(foo.getA());
	}
	
	private static void setA(Integer a)
	{
		a = 20;
	}
	
	private static void setBigDecimal(BigDecimal t1)
	{
		t1 = BigDecimal.TEN;
	}
	
	private static void changeFoo(Foo foo){
		foo = new Foo(20);
	}
	private static class Foo{
		public Foo(int a) {
			this.a = a;
		}
		private int a = 0;
		
		public int getA() {
			return a;
		}
		
		
	}
}
