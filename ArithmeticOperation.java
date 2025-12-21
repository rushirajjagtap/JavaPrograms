package Module1.basicjava;

public class ArithmeticOperation
{
	 static void add()
     {
             int a=10;
             int b=20;
             int c=a+b;
             System.out.println(c);
     }
     static void sub()
     {
             int a=10;
             int b=20;
             int c=a-b;
             System.out.println(c);
     }
     static void mul()
     {
    	 int a=5;
    	 int b=10;
    	 int c=a*b;
    	 System.out.println(c);
     }
     static void div()
     {
    	 int a=6;
    	 int b=2;
    	 int c=a/b;
    	 System.out.println(c);
     }
     static void mod()
     {
    	 int a=10;
    	 int b=3;
    	 int c=a%b;
    	 System.out.println(c);
     }
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
		

	}

}
