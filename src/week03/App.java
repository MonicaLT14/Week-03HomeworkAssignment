package week03;

public class App{
	  static void multidimensional(int a, int b) {
	        /****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/

	          if (a <= 2 || b <= 2) {
	            System.out.println("Both numbers need to be greater than 2.");
	            return;
	        }

	           int[][] arr = new int[a][b];

	            for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                 arr[i][j] = i + j;
	            }
	        }

	        int firstPosition = 0;
	        int lastPosition = arr[firstPosition].length - 1;
	        System.out.println(arr[firstPosition][lastPosition]);
	    }

	    /****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
	    public static void main(String[] args) {
	        int input1, input2;
	        input1 = 10;
	        input2 = 15;
	        multidimensional(input1, input2);
	    }
	}