package com.barman.ArraysTest;

public class Array2D {
static int hourglassSum(int [][] arr) {
	int sum=-1000;
	//below is the for hacker rank solution
	for(int i=0;i<4; i++) {
			for(int j=0; j < 4; j++) {
			int top= arr[i][j]+arr[i][j+1]+arr[i][j+2];
			int middle =arr[i+1][j+1];
			int bottom = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(top+middle+bottom>sum) sum=top+middle+bottom;
			}
	}
		return sum;
	}
	public static void main(String[] args) {		
		int arr[][] = {
				{1,1,1,0,0,0},
				{0,1,0,0,0,0},
				{1,1,1,0,0,0},
				{0,0,2,4,4,0},
				{0,0,0,2,0,0},
				{0,0,1,2,4,0},
				};
		System.out.println(hourglassSum(arr));
	}

}

/*
 
 Problem Statement

You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three topmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem, you have to print the largest sum among all the hourglasses in the array.

Note: If you have already solved the problem "Java 2D array" in the data structures chapter of the Java domain, you may skip this challenge.

/*Input Format

There will be exactly 6 lines of input, each containing 6 integers separated by spaces. Each integer will be between -9 and 9, inclusively.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19

Explanation

The hourglass possessing the largest sum is:

2 4 4
  2
1 2 4

 */


