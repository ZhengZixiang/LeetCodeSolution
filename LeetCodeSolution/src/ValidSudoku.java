import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public static void main(String[] args) {
		char [][] board = new char[9][9];
/*		board[0] = ".87654321".toCharArray();
		board[1] = "2........".toCharArray();
		board[2] = "3........".toCharArray();
		board[3] = "4........".toCharArray();
		board[4] = "5........".toCharArray();
		board[5] = "6........".toCharArray();
		board[6] = "7........".toCharArray();
		board[7] = "8........".toCharArray();
		board[8] = "9........".toCharArray();*/
		
/*		board[0] = "....5..1.".toCharArray();
		board[1] = ".4.3.....".toCharArray();
		board[2] = ".....3..1".toCharArray();
		board[3] = "8.......2".toCharArray();
		board[4] = "..2.7....".toCharArray();
		board[5] = ".15......".toCharArray();
		board[6] = ".....2...".toCharArray();
		board[7] = ".2.9.....".toCharArray();
		board[8] = "..4......".toCharArray();*/
		
/*		board[0] = "..5.....6".toCharArray();
		board[1] = "....14...".toCharArray();
		board[2] = ".........".toCharArray();
		board[3] = ".....92..".toCharArray();
		board[4] = "5....2...".toCharArray();
		board[5] = ".......3.".toCharArray();
		board[6] = "...54....".toCharArray();
		board[7] = "3.....42.".toCharArray();
		board[8] = "...27.6..".toCharArray();*/

		System.out.println(isValidSudoku2(board));
	}
	
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
        	boolean [] rowContains = new boolean[9];
        	boolean [] colContains = new boolean[9];
        	boolean [] boxContains = new boolean[9];
            for(int j = 0; j < 9; j++) {
                if((i + 1) % 3 == 0 && (j + 1) % 3 == 0) {
                    for(int k = 0; k < 3; k++) {
                        for(int l = 0; l < 3; l++) {
                            char temp = board[i - k][j - l];
                            if(temp != '.') {
                            	if(!boxContains[temp - '1']) boxContains[temp - '1'] = true;
                                else return false;
                            }
                        }
                    }
                    Arrays.fill(boxContains, false);
                }
                if(board[i][j] != '.') {
                    if(!rowContains[board[i][j] - '1']) rowContains[board[i][j] - '1'] = true;
                    else return false;
                }
                if(board[j][i] != '.') {
                    if(!colContains[board[j][i] - '1']) colContains[board[j][i] - '1'] = true;
                    else return false;
                }
            }
            Arrays.fill(rowContains, false);
            Arrays.fill(colContains, false);
        }
        return true;
        
    }
	    
    public static boolean isValidSudoku2(char[][] board) {
    	boolean [] boxContains0 = new boolean[9];
    	boolean [] boxContains1 = new boolean[9];
    	boolean [] boxContains2 = new boolean[9];
        for(int i = 0; i < 9; i++) {
        	boolean [] rowContains = new boolean[9];
        	boolean [] colContains = new boolean[9];
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    int temp = j / 3;
                    if(temp == 0) {
                        if(!boxContains0[board[i][j] - '1']) boxContains0[board[i][j] - '1'] = true;
                        else return false;
                    } else if(temp == 1) {
                        if(!boxContains1[board[i][j] - '1']) boxContains1[board[i][j] - '1'] = true;
                        else return false;
                    } else if(temp == 2) {
                        if(!boxContains2[board[i][j] - '1']) boxContains2[board[i][j] - '1'] = true;
                        else return false;
                    }
                    
                    if(!rowContains[board[i][j] - '1']) rowContains[board[i][j] - '1'] = true;
                    else return false;
                }
                if(board[j][i] != '.') {
                    if(!colContains[board[j][i] - '1']) colContains[board[j][i] - '1'] = true;
                    else return false;
                }
            }
            if(i % 3 == 2) {
                boxContains0 = new boolean[9];
                boxContains1 = new boolean[9];
                boxContains2 = new boolean[9];
            }
        }
        return true;
    }
}
