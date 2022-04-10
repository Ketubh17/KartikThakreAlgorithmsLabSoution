package com.main;

import java.util.Scanner;

import com.sorting.SortInDes;

public class Money {
   
	static void notes(int[] denomination,int amount)
	{
		
	      
		   int[] size =new int[ denomination.length];
		   for(int i=0;i<denomination.length;i++)
		   {
			   if(amount >=denomination[i])
			   {
				   size[i]= amount / denomination[i];
				   amount =amount -(size[i] * denomination[i]);
				   		
			   }
			   
			   else if(amount <=denomination[i] || i<=denomination.length)
			   {
				   
				   size[i]= amount / denomination[i];
				   amount =amount -(size[i] * denomination[i]);
				  
				   
			   }
			   
		   }
		   if(amount==0)
		   {
			   System.out.println("Your payment approach in order to give min no of notes will be");
			   for(int j=0;j<denomination.length;j++)
				{
					if(size[j]!=0)
					{
						 
						
						System.out.println(denomination[j]+":"+size[j]);
					}
				}
		   }
		   
		   else if (amount>0)
		  
		   {
			   System.out.println("Unable to find");
		   }
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		int size=0;
		int amount ;
		System.out.println("Enter the size of currency denominations");
		Scanner scan= new Scanner(System.in);
		size= scan.nextInt();
		int[] denomination=new int[size];
		size=denomination.length;
	    System.out.println("The value ofdenomination are follows : ");
	    for(int i=0;i<size;i++)
	    {
//	    	System.out.println(denomination[i]);
	    	denomination[i]= scan.nextInt();
	    }
	    SortInDes.sortInDes(denomination);
	   
	    
	    System.out.println("Please enter a amount :");
	    amount=scan.nextInt();
	    notes(denomination,amount);
	}

}
