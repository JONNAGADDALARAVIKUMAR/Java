import java.util.Scanner;


public class EmployeeWages 
{
	static int hrs=0,present=0,max=0,totalPay;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("\tChoose type of Employee\n\t\t1.Full Time\n\t\t2.Part Time\n\tEnter Choice : ");
		int type = s.nextInt();
		System.out.println("\n\n\t\t\tWelcome to Employee Wage Computation programme");
		
		switch(type)
		{
		case 1:
			fullTime();
			break;
	
		case 2:
			parttime();
			break;
		}
		if(hrs>max)
		{
			totalPay=max*20;
		}
		else
		{
			totalPay=hrs*20;
		}
		System.out.println("\t\t\t\t\t\t\t\t\t      --------\n\t\t\t\t\t\t\t\t\tTotal\t: "+totalPay+"\n\n\n\t\tNo. of Working days\t: 20 \n\n\t\tNo. of days Worked\t: "+present+"\n\n\t\tNo. of Absents\t\t: "+(20-present)+"\n\n\t\ttotal Working Hours\t: "+hrs+"\n\n\t\tMaximum Working Hours\t: "+max);
		System.out.println("\n\t\tTotal wage\t\t: "+totalPay);
	}

	private static void fullTime() 
	{
		max=100;
		System.out.println("\n\n\t\tDay\tAttendence\tHours Worked\tDaily Wage\t    Total Wage");
		for(int i=1;i<=20;i++)
		{
			if(Math.random()>0.43)
			{
				if(hrs<100)
				{
					present++;
					hrs+=8;
					System.out.println("\t\t "+i+"\t    PR\t\t    "+hrs+"\t\t   160.00\t\t"+(hrs*20));
				}
				else if(hrs>=100)
				{
					System.out.println("\t\t "+i+"\t    AB\t\t    "+hrs+"\t\t   0.00\t\t\t"+(hrs*20));
				}
			}
			else
			{
				System.out.println("\t\t "+i+"\t    AB\t\t    "+hrs+"\t\t   0.00\t\t\t"+(hrs*20));
			}
		}		
	}

	private static void parttime() 
	{
		max=50;
		System.out.println("\n\n\t\tDay\tAttendence\tHours Worked\tDaily Wage\t   Total Wage");
		for(int i=1;i<=20;i++)
		{
			if(Math.random()>0.43)
			{
				if(hrs<50)
				{
					
					present++;
					hrs+=4;
					System.out.println("\t\t "+i+"\t    PR\t\t    "+hrs+"\t\t   80.00\t\t"+(hrs*20));
				}
				else if(hrs >=50)
				{
					System.out.println("\t\t "+i+"\t    AB\t\t    "+hrs+"\t\t   0.00\t\t\t"+(hrs*20));
				}
					
			}
			else
			{
				System.out.println("\t\t "+i+"\t    AB\t\t    "+hrs+"\t\t   0.00\t\t\t"+(hrs*20));
			}
		}
		
	}

}
