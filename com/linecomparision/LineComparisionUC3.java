package com.linecomparision;

public class LineComparisionUC3{
	
		 public static void main(String[] args) {
				System.out.println( "Welcome to Line Comparison Computation Program" );		
				int x1 = 2;
				int x2 = 2;
				int y1 = 3;
				int y2 = 4;

				int a1 = 2;
				int a2 = 0;
				int b1 = 3;
				int b2 = 4;

				double lgth1 = Math.sqrt((x2 - x1)*(x2 - x1)+(y2 -y1)*(y2 -y1));
				System.out.println( "Length of first line is :" +lgth1 );

				double lgth2 = Math.sqrt((a2 - a1)*(a2 - a1)+(b2 -b1)*(b2 -b1));
				System.out.println("Length of second line is :" +lgth2  );

				int val1 = (int) lgth1;
				int val2 = (int) lgth2;

				if(val1 == val2){
					System.out.println( "Lines are equal" );
				}else {
					System.out.println( "Lines are not equal" );
				}
				System.out.println(Double.compare(val1 , val2));
			}
		}