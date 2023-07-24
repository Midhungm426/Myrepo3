package inheritance;

public class Multi3 extends Multi2
{
	public void jumb()
	{
		System.out.println("Jumbing");
	}
	public static void main(String[] args) 
	{
		Multi3 obj=new Multi3();
		obj.eat();
		obj.run();
		obj.jumb();
	}
}
