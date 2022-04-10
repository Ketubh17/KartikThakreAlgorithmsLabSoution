package com.sorting;

public class SortInDes {

	 public static void sortInDes(int[] denomination ) {
		// TODO Auto-generated method stub
		int temp ; 
        for (int i = 0; i < denomination.length; i++)
        {     
            for (int j = i+1; j < denomination.length; j++)
            {     
               if(denomination[i] < denomination[j]) 
               {    
                   temp = denomination[i];    
                   denomination[i] = denomination[j];    
                   denomination[j] = temp;    
               }     
            }     
        } 
	}

	

}
