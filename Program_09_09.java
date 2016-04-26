/**********************
 * filename: Program_09_09.java
 * author: Tyler Millershaski
 * course: CS116
 * section: 02-MW
 * semester: Winter 2016
 * input: 
 *			1.) None
 * processing: 
 *			1.) Creates 3 regular polygons (same side length and angles)
 *			2.) Each polygon uses a different constructor
 * output: 
 *			1.) Displays the perimeter and area of each polygon
 *					a.) numbers are formatted to 4 decimal places
 * assignment: Extra Credit Program 02
 *					   9.9 on page 362
**********************/


import java.util.*;
import java.text.*;



public class Program_09_09
{
	public static void main(String[] args)
	{
		(new Program_09_09()).Start();
	}
	
	
	
	private DecimalFormat decimalFormat_ = new DecimalFormat("#0.0000");
	
	/*
	/* precondition: none
	/* postcondition: Creates 3 RegularPolygons and displays their perimeter and area
	*/
	public void Start()
	{
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6,4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Perimeter of polygon1 is: " + decimalFormat_.format(polygon1.GetPerimeter()));
		System.out.println("Area of polygon1 is: " + decimalFormat_.format(polygon1.GetArea()));
		
		System.out.println("\nPerimeter of polygon2 is: " + decimalFormat_.format(polygon2.GetPerimeter()));
		System.out.println("Area of polygon2 is: " + decimalFormat_.format(polygon2.GetArea()));
		
		System.out.println("\nPerimeter of polygon3 is: " + decimalFormat_.format(polygon3.GetPerimeter()));
		System.out.println("Area of polygon3 is: " + decimalFormat_.format(polygon3.GetArea()));
	}
	
	
	
	
	private class RegularPolygon
	{
		private int n_ = 3; // number of sides (terrible variable name)
		private double side_ = 1; // length of the polygon side (they should all be the same)
		
		private double x_ = 0; // center position
		private double y_ = 0; // center position
		
		
		public RegularPolygon()
		{
		}
		
		
		
		public RegularPolygon(int numberOfSides, int lengthOfSide)
		{
			n_ = numberOfSides;
			side_ = lengthOfSide;
		}
		
		
		
		public RegularPolygon(int numberOfSides, int lengthOfSide, double x, double y)
		{
			n_ = numberOfSides;
			side_ = lengthOfSide;
			x_ = x;
			y_ = y;
		}
		
		
		
		// On principal, I don't agree with every variable having a getter and setter
		// this defeats the purpose of declaring the variables as private
		public int GetNumberOfSides()
		{
			return n_;
		}
		
		
		
		public void SetNumberOfSidesTo(int newNumberOfSides)
		{
			n_ = newNumberOfSides;
		}
		
		
		
		public double GetSideLength()
		{
			return side_;
		}
		
		
		
		public void SetSideLength(double newSideLength)
		{
			side_ = newSideLength;
		}
		
		
		
		public double GetXCenterPosition()
		{
			return x_;
		}
		
		
		
		public void SetXCenterPosition(double newXCenterPosition)
		{
			x_ = newXCenterPosition;
		}
		
		
		
		public double GetYCenterPosition()
		{
			return y_;
		}
		
		
		
		public void SetYCenterPosition(double newYCenterPosition)
		{
			y_ = newYCenterPosition;
		}
		
		
		
		public double GetPerimeter()
		{
			return n_ * side_;
		}
		
		
		
		public double GetArea()
		{
			double area = n_ * (side_ * side_);
			area /= (4 * Math.tan(Math.PI / n_));
			
			return area;
		}
	}
}