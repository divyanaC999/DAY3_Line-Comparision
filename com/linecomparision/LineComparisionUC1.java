package com.linecomparision;

public class LineComparisionUC1 {

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
				}
			}