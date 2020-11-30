import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Grade_Calculator 
{
	static char grade;
	static double grade_point;
	static double cred;
	static double sum_cred_point=0;
	static double cred1=0;
	static double s1=0;
	static int q;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("_________________________________");
		System.out.println(" ");
		System.out.println("     ^^*** WELCOME ***^^");
		System.out.println("_________________________________");
		System.out.println(" ");
		System.out.println("Enter The Operation To Be Performed :-");
		System.out.println(" ");
		System.out.println("1. SGPA CALCULATOR");
		System.out.println("2. CGPA CALCULATOR");
		System.out.println("3. PERCENTAGE CALCULATOR");
		System.out.println(" ");
		System.out.println("Enter Your Choice From Above");
		int choice=sc.nextInt( );
		System.out.println(" ");
		switch(choice)
		{
		    case 1: System.out.println("Enter The No. Of Subjects You Have :-");
		    int n=sc.nextInt( );
		    for(int i=1;i<=n;i++)
		    {
		        System.out.println(" ");
		        System.out.printf("Enter Information About  Subject %d\n",i);
		        System.out.println(" ");
		        System.out.println("Enter Subject Credit In Digits :");
		        double cred_point=sc.nextDouble( );
		        System.out.println(" ");
		        System.out.println("Enter Subject Grade In Capital :");
		        grade=sc.next( ).charAt(0 );
		        
		        System.out.println("_________________________________");
		if(grade=='O')
		{
		    grade_point=10;
		}
		else if(grade=='E')
		{
		    grade_point=9;
		}
		else if(grade=='A')
		{
		    grade_point=8;
		}
		else if(grade=='B')
		{
		    grade_point=7;
		}
		else if(grade=='C')
		{
		    grade_point=6;
		}
		else if(grade=='D')
		{
		    grade_point=5;
		}
		else if(grade=='F')
		{
		    grade_point=2;
		}
		else if(grade=='M')
		{
		    grade_point=0;
		}
		else if(grade=='S')
		{
		    grade_point=0;
		}
		if(i<=n)
		{
		     cred =cred_point * grade_point;
		     cred1=cred1+cred;
		    
		     sum_cred_point=sum_cred_point+cred_point;
		     
		}
		
		
		
		    }
		    double sgpa=cred1/sum_cred_point;
		    System.out.println("Take Your SGPA Correct To Two Decimal Places");
		    System.out.println(" ");
		    System.out.println("Your SGPA is " +sgpa);
		    System.out.println(" ");
		    System.out.println("_________________________________");
		    System.out.println(" ");
		    System.out.println("    ^^*** THANK YOU ***^^");
		    System.out.println("_________________________________");
		    break;
		    case 2: System.out.println("Enter The Number Of Semesters You Have :-");
		    int m=sc.nextInt( );
		       System.out.println(" ");
		       System.out.println("Please Enter Your Corresponding Semester SGPA :");
		       System.out.println(" ");
		      for(int j=1;j<=m;j++)
		    {
		        
		        System.out.printf("SGPA Of Semester %d is :\n",j);
		        double s=sc.nextDouble( );
		        System.out.println("_________________________________");
		        System.out.println(" ");
		         q=m;
		        s1=s1+s;
		        
		    }
		    double cgpa=s1/q;
		    System.out.println("Take Your CGPA Correct To Two Decimal Places");
		    System.out.println(" ");
		    System.out.println("Your CGPA is " + cgpa);
		    System.out.println(" ");
		    System.out.println("_________________________________");
		    System.out.println(" ");
		    System.out.println("    ^^*** THANK YOU ***^^");
		    System.out.println("_________________________________");
		    break;
		    case 3: System.out.println("Enter Your CGPA :-");
		    double cgpa_ = sc.nextDouble( );
		    double percent = ((cgpa_ - 0.5)*10);
		    System.out.println("_________________________________");
		    System.out.println("Take Your PERCENTAGE Correct To Two Decimal Places");
		    System.out.println(" ");
		    System.out.println("Your PERCENTAGE is " + percent);
		    System.out.println(" ");
		    System.out.println("_________________________________");
		    System.out.println(" ");
		    System.out.println("    ^^*** THANK YOU ***^^");
		    System.out.println("_________________________________");
		    break;
		    default : System.out.println("Invalid Input");
		    System.out.println(" ");
		    System.out.println("_________________________________");
		    System.out.println(" ");
		    System.out.println("   !!! PLEASE TRY AGAIN !!!");
		    System.out.println("_________________________________");
		}
		
		
	}
}