package com.create.pkg;

public class Update {

	
		
		    public static void main(String args[]) 
		    {
		        int[] array = new int[9];
		        try 
		        {
		            array[7] = 3;
		        }
		        catch (ArrayIndexOutOfBoundsException e) 
		        {
		            System.out.println("Array index is out of bounds!"); 
		        }
		        finally 
		        {
		            System.out.println("The array is of size " + array.length);
		        }
		    }
		


	}


