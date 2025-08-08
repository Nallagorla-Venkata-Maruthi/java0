
interface Operation{
	int perform(int a,int b);
}
public class Lambda {
	public static void main(String[] args)
	{
		Operation addtion=(a,b)->a+b;
		Operation subtraction=(a,b)->a-b;
		Operation multiplication=(a,b)->a*b;
		int num1=10;
		int num2=20;
	System.out.println("Addition:" + addtion.perform(num1,num2));
	System.out.println("Subtraction:"+subtraction.perform(num1,num2));
	System.out.println("Multiplication:"+multiplication.perform(num1,num2));
	}
	

}
