package com.samples.one;

public class TwoDimention {

	public static void main(String[] args) {

		int[][] num = {{1,2},{3,4}};
		
		for( int i=0; i<2; i++) {
		  System.out.println("[");
			for( int j=0; j<2; j++ ) {
				System.out.println(num[i][j]);
			}
			  System.out.println("]");
		}
	}

}
