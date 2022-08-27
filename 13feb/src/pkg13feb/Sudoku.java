
package pkg13feb;


public class Sudoku {
    static int [][]mat = new int[][] {
		{8,3,2,4,0,0,1,5,7},
		{1,0,6,7,5,3,0,0,0},
		{0,0,5,0,0,8,3,9,6},
		{0,2,9,0,0,5,0,6,0},
		{0,0,8,0,6,0,4,0,5},
		{0,0,1,3,7,0,0,0,0},
		{0,1,0,8,0,7,5,0,0},
		{0,0,7,0,4,0,0,0,0},
		{0,0,0,0,0,0,0,7,2}
	};
	
	static int IsSafe(int [][]mat, int row, int col, int n, int value)
	{
		//check row
            int count=0;
		for(int i = 0; i< 9; i++)
		{     
			if(mat[row][i] == value)
                        {
                            count++;
                            if(count>=2)
                            {
                                System.out.println("error, given problem is wrong "+value+" is repeated");
                                return 2;
                            }
                        }
				
		}
                if(count==1)
                    return 1;
                        
		
		
		//check column.
                int flag=0;
		for(int i = 0; i<9; i++)
		{
			if(mat[i][col] == value)
                        {
                            flag++;
                            if(flag>=2)
                            {
                                System.out.println("error problem is wrong "+value+" is repeated");
                                return 2;
                            }
                        }
		}
                if(flag==1) return 1;
		
		//check 3*3 matrix.
                int temp=0;
		int baseRow = row - (row%3);
		int baseCol = col - (col%3);
		
		for(int i = baseRow; i < baseRow + 3; i++)
		{
			for(int j = baseCol; j < baseCol + 3; j++)
			{
				if(mat[i][j] == value)
                                {
                                    temp++;
                                    if( temp>=2)
                                    {
                                        System.out.println("error , given problem is wrong "+value+" is repeated");
                                        return 2;
                                    }
                                }
					
			}
		}
                if(temp==1) return 1;
		
		if(temp==0 && flag==0 && count==0) 
                {
                   return 0;
                }
                else return 1;
                
                
	}

	static boolean sudokuSolver(int mat[][], int n)
	{
		int row, col;
		row = col =-1;
		int i,j;
		i = j =0;
		for(i = 0; i<n ;i++)
		{
			for(j = 0; j<n ; j++)
			{
				if(mat[i][j] == 0)
				{
					row = i;
					col = j;
					break;
				}
			}
			
			if(row != -1)
			{
				break;
				
			}
		}
		if( i == n && j == n)
			return true;
		else
		{
			for( int  k = 1; k<=9; k++)
			{
                            if(IsSafe(mat,row,col,n,k)==2)
                                {
                                    return false;
                                }
				if(IsSafe(mat,row,col,n,k)==0)
				{
					mat[row][col] = k;
					if(!sudokuSolver(mat,n))
					{
						mat[row][col] = 0;
                                               
					}
					else
					{
						return true;
					} 
				}
                                
			}
			return false;
			// yaha true ya false
		}
		
		
		
	}
	

    public static void main(String[] args) {
       boolean ans = sudokuSolver(mat,9);
		System.out.println(ans);System.out.println();
		for(int i = 0; i <9 ;i++)
		{
			for(int j = 0; j<9; j++)
			{
				System.out.print(mat[i][j]+" , ");
			}
			System.out.println();
		}
		
    }
    
}
