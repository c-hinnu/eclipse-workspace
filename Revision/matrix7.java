package Revision;
import java.util.*;

public class matrix7 {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column for matrix ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int b[][] = new int[row][col];
        int zeroCount = 0;
        System.out.println("Elements : ");
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                b[i][j] = sc.nextInt();    
            }    
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(b[i][j] == 0)
                    zeroCount++;        
            }
        }
        int minZeroCount = row*col/2;
        if(zeroCount>minZeroCount)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not Sparse Matrix");
            
        }





	}


