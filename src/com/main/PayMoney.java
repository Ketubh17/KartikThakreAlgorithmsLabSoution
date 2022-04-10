package com.main;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args)
	{
		  int size;
		     int transaction;
		    int target;
		    
		     Scanner scan= new Scanner(System.in);
		     System.out.println("Enter the number");
		     size=scan.nextInt();
		     
		     int array[]= new int[size];
		     System.out.println("Enter the values of array"+size);
		    
		    for(transaction= 0 ;transaction < size ; transaction++)
		    {
		       array[transaction]= scan.nextInt();
		    }
		    System.out.println("Enter total no target to achieve");
		     int t =scan.nextInt();
		    for(int i=1 ;i<=t;i++)
		    {
		    	System.out.println("Enter the target");
		    	target= scan.nextInt();
		    
		    
		    	int sum= 0;
		    	for(transaction=0;transaction<size;transaction++)
		    	{
		    		sum=sum+ array[transaction];
		    	    if(sum>=target)
		    		   break;
		    		
		    		
		    	}
		    	if(sum<target)
		    	{
		    	 System.out.println("Target not achieved");
		    	}
		    	else
		    	{
		    		System.out.println("Target achieved after "+(transaction+1)+"transaction");
		    	}
		    
		      } 
	}
}
