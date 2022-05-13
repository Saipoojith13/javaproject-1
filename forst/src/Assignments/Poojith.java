package Assignments;
import java.util.Scanner;

interface Arithmetic
{
	public void add();
	public void sub();
	public void mul();
	public void div();
	public void rem();
}
interface Logical
{
	public void and();
	public void or();
	public void not();
}
interface Relational
{
	public void EqualsTo();
	public void Greaterthan();
	public void Lowerthan();
	public void GreaterthanOrEqualto();
	public void LessthanOrEqualto();
	public void NotEqualto();
}
interface Bitwise
{
	public void BitwiseAND();
	public void BitwiseOR();
	public void BitwiseXOR();
	public void BitWiseShiftLeft();
	public void BitWiseShiftRight();
	public void BitWiseShiftRightWithZeroFill();	
}
interface Unary
{
	public void Increment();
	public void Decrement();
}


class Operation implements Arithmetic,Logical,Relational,Bitwise,Unary
{
	int a=10;
	int b=4;
	int x=13;
	int y=14;
	int z=15;
	
	public void add() 
	{
		System.out.println("Addition of given numbers "+a+" & "+b+" is  : "+(a+b));
	}
	public void sub() 
	{
		System.out.println("Subtraction of given numbers "+a+" & "+b+" is  : "+(a-b));
	}
	public void mul() 
	{
		System.out.println("Multiplication of given numbers "+a+" & "+b+" is  : "+(a*b));	
	}	
	public void div() 
	{
		System.out.println("Division of given numbers "+a+" & "+b+" is  : "+(a/b));
	}
	public void rem() 
	{
		System.out.println("Remainder of given numbers "+a+" & "+b+" is  : "+(a%b));
	}
	public void and() 
	{
		System.out.println((x>y)&&(x>z));
	}
	public void or() 
	{
		System.out.println((x<y)||(x<z));
	}
	public void not() 
	{
		System.out.println(!(x==y));	
	}
	public void GreaterthanOrEqualto()
	{
		System.out.println(a>=b);
	}
	public void LessthanOrEqualto()
	{
		System.out.println(a<=b);
	}
	public void NotEqualto()
	{
		System.out.println(a!=b);
	}
	public void EqualsTo()
	{
		System.out.println(a==b);
	}
	public void Greaterthan()
	{
		System.out.println(a>b);
	}
	public void Lowerthan()
	{
		System.out.println(a<b);
	}
	public void BitWiseAND()
	{
		System.out.println(a&b);
	}
	public void BitWiseOR()
	{
		System.out.println(a|b);
	}
	public void BitWiseXOR()
	{
		System.out.println(a^b);
	}
	public void BitWiseShiftLeft()
	{
		System.out.println(a<<2);
	}
	public void BitWiseShiftRight()
	{
		System.out.println(a>>2);
	}
	public void BitWiseShiftRightWithZeroFill()
	{
		System.out.println(a>>>1);
	}
	public void Increment()
	{
		System.out.println("before increment the numbers are: "+a++);
		System.out.println("before increment the numbers are: "+b++);
		System.out.println("Now after increment the numbers are: "+a);
		System.out.println("Now after increment the numbers are: "+b);
	}
	public void Decrement()
	{
		System.out.println("before decrement the numbers are: "+a--);
		System.out.println("before decrement the numbers are: "+b--);
		System.out.println("Now after decrement the numbers are: "+a);
		System.out.println("Now after decrement the numbers are: "+b);
	}
}




public class Poojith 
{
	public static void main(String[] args) 
	{
		Operation opp=new Operation();

		System.out.println("***Operations***");
		System.out.println("***please enter numbers between(1-4) for the operation you required ;) ***");
		System.out.println("***Enter corresponding number(1.Arithmetic, 2.Logical, 3.Relational, 4.Bit wise, 5.Unary) ***");
		Scanner scanner=new Scanner(System.in);
		int operat=scanner.nextInt();
		switch(operat)
		{
		case 1:
			System.out.println("***Arithmetic Operation***");
			System.out.println("***please enter numbers between(1-5) for the operation you required ;) ***");
			System.out.println("***Enter corresponding number(1.Addition, 2.Subtraction, 3.Multiplication, 4.Division, 5.Modulus) ***");
			Scanner scanner1=new Scanner(System.in);
			int arith=scanner1.nextInt();
			switch(arith) 
			{
			case 1:
				opp.add();
				break;
			case 2:
				opp.sub();
				break;
			case 3:
				opp.mul();
				break;
			case 4:
				opp.div();
				break;
			case 5:
				opp.rem();
				break;
			default:
				System.out.println("***Inalid Input please Enter numbers (1-4)***");
			}
		break;
		case 2:
			System.out.println("***Logical Operation***");
			System.out.println("***please enter numbers between(1-3) for the operstion you required ;) ***");
			System.out.println("***Enter corresponding number(1.And, 2.Or, 3.Not) ***");
			Scanner scanner2=new Scanner(System.in);
			int logi=scanner2.nextInt();
			switch(logi) 
			{
			case 1:
				opp.and();
				break;
			case 2:
				opp.or();
				break;
			case 3:
				opp.not();
				break;
			default:
				System.out.println("***Inalid Input please Enter numbers (1-3)***");
			}
		break;
		case 3:
			System.out.println("***Relational Operation***");
			System.out.println("***please enter numbers between(1-6) for the operation you required ;) ***");
			System.out.println("***Enter corresponding number(1.EqualsTo, 2.Greaterthan, 3.Lowerthan, 4.GreaterthanOrEqualto, 5.LessthanOrEqualto ,6.NotEqualto ) ***");
			Scanner scanner3=new Scanner(System.in);
			int rela=scanner3.nextInt();
			switch(rela) 
			{
			case 1:
				opp.EqualsTo();
				break;
			case 2:
				opp.Greaterthan();
				break;
			case 3:
				opp.Lowerthan();
				break;
			case 4:
				opp.GreaterthanOrEqualto();
				break;
			case 5:
				opp.LessthanOrEqualto();
				break;
			case 6:
				opp.NotEqualto();
				break;
			default:
				System.out.println("***Inalid Input please Enter numbers (1-6)***");
			}
		break;
		case 4:
			System.out.println("***BitWise Operation***");
			System.out.println("***please enter numbers between(1-6) for the operation you required ;) ***");
			System.out.println("***Enter corresponding number(1.BitWise AND, 2.BitWise OR, 3.BitWise XOR, 4.BitWise Shift Left, 5.BitWise Shift Right ,6.BitWise Shift Right With Zero Fill ) ***");
			Scanner scanner4=new Scanner(System.in);
			int bitw=scanner4.nextInt();
			switch(bitw) 
			{
			case 1:
				opp.BitWiseAND();
				break;
			case 2:
				opp.BitWiseOR();
				break;
			case 3:
				opp.BitWiseXOR();
				break;
			case 4:
				opp.BitWiseShiftLeft();
				break;
			case 5:
				opp.BitWiseShiftRight();
				break;
			case 6:
				opp.BitWiseShiftRightWithZeroFill();
				break;
			default:
				System.out.println("***Inalid Input please Enter numbers (1-6)***");
			}
		break;
		case 5:
			System.out.println("***Unary Operation***");
			System.out.println("***please enter numbers(1 or 2) for the operation you required ;) ***");
			System.out.println("***Enter corresponding number(1.Increment, 2.Decrement) ***");
			Scanner scanner5=new Scanner(System.in);
			int unary=scanner5.nextInt();
			switch(unary) 
			{
			case 1:
				opp.Increment();
				break;
			case 2:
				opp.Decrement();
				break;
			default:
				System.out.println("***Inalid Input please Enter numbers (1 or 2)***");
			}
		break;
		default:
			System.out.println("***Inalid Input please Enter numbers (1-5)***");

		}	
	}
}

