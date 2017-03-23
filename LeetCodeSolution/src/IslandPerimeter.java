
public class IslandPerimeter {

	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		//int[][] grid = {{0}};
		//int[][] grid = {{1, 0}};
		//int[][] grid = [[1,1,1,0,1,0,1,0,1,1,1,0,1,1,0,0,1,1,1,1,1,1,0,1,0,1,1,1,1,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,0,1,1,1,0,1,0,1],[1,0,1,0,1,1,1,1,1,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,0,1,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1],[1,0,0,0,1,0,0,1,0,0,1,1,1,0,1,1,0,0,1,0,1,0,1,1,0,1,1,0,0,0,0,0,1,0,0,1,0,0,0,1,0,1,1,0,0,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0],[1,1,0,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,0,0,1,0,1,1,0,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1],[0,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,1,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,0,1,1,1,0,0,0,1,1,0,1,0,0,1,1,1,0,0,1,0,0,0,0,1,1,0,1,0,1,0,0,1,1,1,0,1,1,1,1,1,1,0,1,0,0,0,1,1,0,1,0,1,1,1,1,0,0,0,0],[1,1,0,0,0,0,1,0,0,1,0,0,0,1,0,1,1,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,1,1,0,1,0,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,1,1,0,0,1,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0,0,0,0,0,1,1,1],[1,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0,1,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,1,1,1,1,0,0,1,1,0,1,0,1,1,0,1,1,1,0,0,1,0,1],[1,1,0,1,1,0,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,0,1,0,0,0,0,1,0,1,0,0,1,1,0,1,0,1,1,1,0,1,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,1,0,1,1,0,0,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,0,0,1,0,1,0,0,0,0,1,0,1,0,1,1,0,1],[0,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,1,0,0,1,1,1,0,0,1,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,1,1,1,0,1,0,0,1,1,0,1,0,1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,0,0,1],[0,0,0,1,0,0,0,0,1,1,1,1,0,1,0,1,0,0,1,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,0,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,0,0,1,0,1,1,0,0,1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1],[1,1,0,1,1,0,1,0,0,0,1,0,0,1,0,1,1,0,1,0,0,0,0,1,1,1,0,1,0,1,0,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,1,1,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,0,1,0,1,1,0,1],[1,0,0,0,1,1,1,1,1,0,0,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,0,0,0,1,0,1,0,0,0,0,1,1,1,1,1,1,0,1,1,0,0,0,0,0,1,0,1,0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,1],[1,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,0,1,1,1,0,1,0,0,0,1,1,0,1,0,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0,0,0,0,1,0,0,1,1,1,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,1,1],[1,0,1,1,0,1,1,0,0,0,0,1,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,0,0,0,1,1,0,0,1,0,0,1,1,1,1,0,0,1,1,0,1,1,0,0,1,1,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,1,0],[1,0,0,1,1,1,0,0,0,1,1,1,0,0,1,0,0,1,1,1,0,0,1,0,1,1,1,1,0,0,1,1,0,0,0,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,1,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1,1,0,1,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,1],[1,1,0,0,1,0,0,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,1,0,0,1,1,0,0,1,1,0,0,0,1,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,0,0,1,0,1,1,0,1,0,0,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,1,1,0,1,1,0,1,1,0,0,1],[0,1,1,0,0,0,1,1,0,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,1,0,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,1,1,1,1,1,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,0,1,1,0,1],[0,0,1,1,0,1,1,0,0,1,0,1,0,0,0,0,1,1,0,1,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,1,0,0,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,0,1,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,0,1,0,0,1],[1,0,0,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,1,0,0,1,1,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1,1,1,0,0,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,0,0,1,0,1,1,0,1,0,1,1],[1,0,0,0,0,1,0,0,1,0,0,0,1,0,1,1,1,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,0,1,1,1,0,0,1,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,0],[1,1,0,0,1,1,1,0,1,1,0,1,1,0,1,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,0,0,1,1,1,0,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,1,1],[0,1,1,0,1,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,0,1,0,0,0,0,1,0,1,1,1,0,1,0,0,0,1,1,1,0,0,0,1,0,0,0,1,0,1,1,1,1,0,0,1,0,0,0,1],[0,0,1,1,1,0,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,0,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,0,0,1,0,0,1,1,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,0,0,0,1,1,1,1,0,1],[0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,1,1,1,1,0,0,1,1,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,1,1,0,0,1,0,0,0,1,1,0,1,1,0,1,1,0,0,1,0,0,1,1,0,0,1,0,1,1,1,0,0,0,1,1,1,1,0,0,0,0,1,0,1],[1,1,0,0,1,1,1,1,0,0,1,1,0,1,1,1,0,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,1,0,1,1,0,0,1,1,0,1,0,1,1,1,1,0,0,1,0,1,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,1,1,0,1,1,0,0,1,1,0,1,0,0,0,1,1,1,0,0,1,1,1,0,1,1,1,1],[0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,1,1,1,0,0,0,1,0,1,0,1,1,1,0,0,0,1,0,0,0,0,1,0,1,0,0,1,1,0,1,0,0,1,0,1,0,0,1,1,0,0,0,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,1],[1,1,1,1,1,0,1,1,1,1,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1,0,1,1,0,1,1,1,0,1,1,1,0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,0,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,0,0,1,0,1,1,0,1,0,1,1,0,1],[0,1,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0,1,1,0,0,0,1,1,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,1,0,0,0,0,0,0,1,0,1,1,0,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,1,1,1,0,0,1,0,0,1,1,1],[0,1,0,1,1,1,1,0,1,1,0,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,1,1,0,1,0,0,1,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,0,0,1,1,0,1,1,1,1,0,0,1,1,0,1,0,0,1,1,0,0,1,1,0,1,1,0,0,0,1],[1,1,0,1,0,0,0,0,1,0,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,1,1,0,0,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,1,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,1,1,0,0,1,0,1,0,0,1,0,1,1,0,0,1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1],[1,0,0,1,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,0,0,0,1,1,0,0,0,0,1,0,0,1,1,0,0,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,0,0,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,1,0,0,0],[1,0,1,1,1,1,0,1,1,0,1,0,0,1,1,0,1,1,1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,1,0,0,0,1,0,1,0,0,0,1,1,1,1,0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,0,1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,1,1,1,1,0,0,0,0,1,1,1,1],[1,1,1,0,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,0,0,0,1,1,1,1,1,0,1,1,1,0,1,0,0,0,0,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,0,1,0,1,0,0,1,1,1,0,0,0,0,1,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,1,0,0,0,0,1],[0,0,0,0,0,1,0,1,1,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,1,0,1,0,1,1,1,0,0,0,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,0,1,1,0,1],[1,1,1,1,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,0,0,1,1,1,0,1,0,0,1,0,0,1,0,0,1,1,1,0,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,1,0,1,1,1,0,0,1,1,0,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,0,0,1],[0,1,0,1,1,1,1,0,0,1,1,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,0,1,0,1,1,0,1,1,0,1,1,1,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,1,0,0,1,0,0,1,1,0,0,1,1,1,0,0,0,1,1,0,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1],[1,1,0,0,0,0,1,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,1,1,1,1,1,0,1,1,1,1,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,0,0,1,1,1,0,0,1,0,1,1,0,1,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,1,1,0,1],[1,0,0,0,1,1,1,0,0,1,0,1,1,1,1,0,1,0,0,0,0,1,1,0,1,1,1,1,0,0,0,0,0,0,1,0,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,1,0,1,0,1,0,1,1,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,0,1,0,1,0,1,0,0,0,1],[1,1,0,1,1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1,1,0,1,1,0,1,1,0,1,0,0,1,1,1,0,1,1,0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,1,1,0,1,1],[0,1,0,1,0,0,1,0,0,1,1,1,0,0,0,0,1,0,1,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,1,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,0],[1,1,0,0,0,0,0,0,1,1,0,1,1,0,0,1,1,0,1,0,0,0,0,1,1,1,0,0,1,1,1,1,0,1,1,1,0,1,1,0,0,1,1,1,0,0,0,0,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,1,0,1,0,1,0,1,1,0,1,1,1,0,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,1,1,0,0,0,1,0,1,1],[0,1,1,0,1,0,1,1,1,0,0,0,1,1,0,1,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,1,1,0,0,1,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,0,0,0,1,1,0,0,1,0,0,1],[0,0,1,0,1,1,1,0,0,0,1,0,0,1,1,1,1,0,0,1,1,0,1,0,0,0,1,1,1,0,0,1,1,1,1,0,1,1,1,0,0,1,1,1,0,1,1,0,0,0,0,0,1,0,0,0,1,1,1,0,1,1,0,1,1,1,1,1,1,0,0,1,0,0,1,1,1,0,1,1,0,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1],[1,1,1,0,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,0,1,1,1,0,0,0,1,1,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,1,1,0,1,0,1,0,0,0,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,0,1,0],[1,0,0,0,1,1,0,0,1,0,0,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,0,0,0,1,1,1,0,1,1,1,1,0,1,1,1,0,0,1,1,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,1,1,1,0,1,1,1,1,1,0,0,1,1,1,0,0,0,1,1,1,1],[1,1,1,0,0,1,1,0,1,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,0,1,1,0,1,1,0,0,0,1,1,0,1,0,0,0,1,0,1,0,0,0,0,1,0,1,1,0,0,0,1,0,1],[0,0,1,1,0,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,1,1,1,1,0,0,1,1,0,1,1,1,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,0,1,1,0,0,1,0,1,1,1,0,1,0,1,1,1,1,0,0,1,1,0,0,0,0,1],[1,1,1,0,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,0,0,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,0,0,0,1,1,1,1,0,1,1,0,1,0,1,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,0,1,1,1,0,0,1,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,1,1],[1,0,0,0,1,0,1,0,0,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,1,0,1,1,0,0,0,1,1,0,0,1,0,1,1,1,0,1,0,1,1,1,0,0,0,0,1,0,0,1],[1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,0,1,1,0,0,1,1,0,0,0,0,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,1,1,1,0,1,0,0,0,1,1,0,0,0,1,0,0,1,0,0,1,1,1,0,1,0,1,1,1,1,0,1,1],[0,1,1,1,0,0,0,1,0,0,0,1,0,1,1,1,1,0,0,1,1,0,1,1,0,0,0,0,1,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,0,0,1,0,0,1,1,0,0,1,0,1,0,1,1,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0],[0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,0,1,0,0,0,0,1,1,0,0,1,0,1,1,0,1,0,1,1,0,0,0,0,1,0,1,0,1,0,1,1,0,1,0,0,1,0,1,1,1,1,0,1,1,1,1,1,0,0,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,1,1,0,1,1,1],[1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,1,0,0,0,1,0,1,1,0,0,0,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,0,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,1,0,0,1,1,1,0,1,0,0,0,1,0,0,0,1],[1,0,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1,0,0,0,1,1,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,0,0,1,0,1,1,0,0,0,1,1,0,1,1,1,0,0,1,0,1,1,0,0,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,0,1,1,0,1,0,1,0,1,1,1,0,1,1,1,0,0],[1,0,1,0,0,1,1,0,0,0,0,1,0,1,0,1,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,1,1,1,0,1,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1,0,0,1,1,0,0,1,0,0,1,1,0,1,0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,0,1,1,1],[1,1,1,1,0,0,1,0,1,1,1,1,0,1,1,1,0,0,1,0,0,0,0,0,1,1,1,1,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,0,0,1,1,0,0,1,1,0,1,1,0,1,0,0,1,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,1,0,1,1,1,0,1,0,1],[0,1,0,1,1,0,1,0,1,0,0,0,0,0,0,1,1,0,1,1,1,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,0,1],[1,1,0,0,1,0,1,0,1,0,1,1,1,0,1,1,0,0,0,0,1,0,1,1,0,0,1,1,0,1,0,0,1,0,1,0,0,1,1,0,0,1,0,0,1,0,0,1,1,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,1,0,0,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,1,1,0,1,1,0,0,0,1,1,0,1,0,0,0,1],[1,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,1,1,1,1,0,1,0,0,0,0,1,0,0,0,1,1,0,1,1,0,0,1,0,0,1,0,0,1,0,0,0,1,0,1,1,0,0,0,0,1,1,1,0,1,1,0,0,0,1,1,0,0,1,0,0,1,0,0,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1],[1,1,0,0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,0,0,0,0,1,0,1,0,1,1,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,1,1,0,0,0,0,1,1,1,1,0,1,0,1,0,0,1,1,1,0,0,1,1,1,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0,0,0,0,1,0,1],[0,1,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,0,1,0,1,1,1,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,0,1,0,0,0,0,0,1,1,0,1,1,1,0,0,1,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,1,1,1],[0,0,1,0,1,0,0,0,1,1,1,1,1,0,1,0,1,1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,0,1,1,0,0,0,1,1,1,0,1,0,1,0,0,1,0,0,0,0,0,1,1,0,0,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,0,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0],[1,0,1,0,1,1,1,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,1,0,0,0,1,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,1,1,1,1,0,1,1,1,1,0,1,1,0,0,1,1,0,0,1,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,0,1,1,0,1,1],[1,1,1,0,0,1,0,0,1,1,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,1,1,1,0,0,0,1,0,0,1,1,0,0,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0],[1,0,1,1,0,1,1,0,1,0,0,1,1,0,0,1,0,0,0,1,1,1,1,1,1,0,1,0,1,1,1,0,1,1,0,1,0,0,0,1,1,0,1,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1,1,1,0,0,1,1,0,1,1],[1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,1,0,1,0,0,1,0,0,0,1,1,1,0,1,0,1,0,1,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,1,1,0,1,0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,1,0,0,1,1,1,1,0,0,0,1],[1,1,1,1,1,0,0,0,1,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,1,0,1,0,1,1,1,1,0,0,1,0,1,1,0,1,0,0,0,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,1,1,0,0,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1],[1,0,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,1,1,1,1,1,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,1,0,1,0,0,0,1,1,0,1,0,1,1,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,1],[1,1,1,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,0,1,1,1,0,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,1,0,1,1,0,1],[0,0,1,0,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,0,1,1,0,0,0,1,1,0,1,0,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,0],[1,1,1,0,0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,0,1,0,0,1,1,0,1,1,0,0,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,0,0,1,0,1,0,1,1,0,0,0,1,0,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0],[0,0,1,0,1,0,0,1,0,0,1,1,1,0,0,0,0,1,1,1,0,1,1,1,0,1,1,0,0,0,1,0,1,0,1,0,1,1,0,1,1,0,1,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,1,0,1,1,0,0,0,0,0,0,1,1],[0,1,1,0,1,0,0,1,1,0,1,0,1,1,1,0,1,1,0,0,0,0,0,1,0,1,0,0,0,1,1,1,1,0,1,1,1,0,0,0,1,0,1,0,1,0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,1,0,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,0,1],[1,1,0,0,1,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,1,0,1,1,0,1,0,0,1,1,0,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,0,1,0,0,0,0,0,0,1,0,1,1,1,1,0,0,1,0,0,0,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1,0,1,1,1,0,0,1,1,0,1,0,1,1,1],[1,0,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,0,0,1,1,0,1,0,0,0,1,0,0,1,1,1,1,0,0,0,1,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,0,0,0,1,1,0,1,1,1,0,1,1,1,0,0,1,0,0,1,1,1,0,1,1,1,1,1,1,0,1,0,1,1,0,1,0,0,1,0,0,0,1],[1,0,0,1,1,1,1,0,0,0,0,0,1,0,0,1,1,1,1,0,0,0,1,0,0,0,1,0,1,1,0,1,1,1,0,1,0,0,1,1,0,0,0,0,0,1,1,0,1,1,0,0,0,0,1,0,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1,1,0,1,1,1],[1,1,0,0,1,0,1,1,0,1,0,0,1,0,0,0,0,0,1,1,0,1,1,1,0,0,1,0,0,1,0,1,0,0,0,1,1,0,0,1,1,1,0,1,0,0,1,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,0,1,1,1,1,0,0,1,0,0,0,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,1],[0,1,1,0,0,0,0,1,1,1,1,0,1,1,1,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0,1,1,0,1,0,1,0,1,0,0,0,0,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,1,0,1],[0,0,1,1,0,0,1,1,0,0,1,0,1,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,1,1,0,1,1,1,0,0,1],[1,0,0,1,1,0,0,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,0,1,1,1,1,1,1,1,1,0,0,1,1,0,0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,1],[1,1,0,0,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,0,1,0,1,1,0,0,0,1,0,1,1,1,0,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,1,0,1,1,0,0,0,1,0,1,0,1,0,1,0,0,1,1,1,0,1],[1,0,0,0,0,0,1,1,1,1,0,0,0,1,0,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,1,0,0,1,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,1,1,0,0,0,1,0,1,1,0,1,1,0,1,0,1,1,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,1,0,0,1,0,0,1],[1,1,0,0,1,0,0,0,0,1,1,1,0,0,0,0,1,0,0,1,1,0,0,0,0,1,1,0,0,0,1,0,1,0,1,0,1,1,0,0,0,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,1,0,0,1,1,0,1,0,0,0,0,0,1,1,0,1,0,0,0,0,1,0,0,0,1,1,0,1,1,1,1],[0,1,1,0,1,1,1,1,0,1,0,1,1,0,0,1,1,1,0,1,0,0,1,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,0,0,1,1,0,1,1,0,0,0,1,1,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,1,1,1,0,0,1,0,1,0,0,0],[0,0,1,1,1,0,1,0,0,0,0,0,1,1,0,0,0,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,0,0,1,1,1,0,0,1,0,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,1,0],[1,1,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1,0,0,0,1,1,1,1,1,0,1,1,1,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,1,0,0,1,0,0,1,0,0,0,1,1,1,0,1,1,1,0,0,1,0,0,1,1,1,1,0,0,1,0,1,1,0,1,1,1,0,0,0,0,0,1,1,0,0,0,0,1,1],[1,0,0,0,0,1,1,0,1,1,1,0,0,0,0,1,1,0,0,0,1,0,0,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1,1,1,1,0,0,1,1,0,0,0,0,0,1,0,1,1,0,1,1,1,1,0,0,0,1,0,1,0,1,1,0,1,1,0,1,0,0,1,1,0,0,0,0,1,0,0,0,1,1,0,1,0,1,1,0,0,1,1,0,0,1],[1,0,1,1,0,1,0,0,1,0,1,1,1,0,0,0,1,1,0,1,1,1,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,1,1,0,0,1,1,1,1,0,1,1,0,1,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,0,1,0,0,0,0,0,0,1,1,0,1,0,1,1,1,0,0,1,0,1,1,1,0,0,1,1,0,0,1,1],[1,0,1,0,0,1,1,0,1,0,0,0,1,1,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,1,0,1,0,0,1,1,1,1,1,1,1,0,1,0,0,0,1,0,1,1,0,0,0,1,1,1,0,0,0,1,0,1,0,1,0,0,0,1,1,0,0,1,0,0,0,0,1,1,0,1,0],[1,0,1,0,0,0,1,0,0,0,0,1,1,0,0,1,0,1,0,0,0,1,1,1,0,0,1,1,1,1,0,1,1,0,1,0,0,0,0,1,0,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,0,0,1,1,0,0,1,1,0,1,0,0,0,1,1,1,1],[1,0,1,0,1,0,1,1,1,1,0,1,0,0,1,1,0,1,1,0,0,0,0,1,1,0,0,1,0,0,0,0,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,0,1,1,0,1,0,0,0,1,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,1,0,1,0,0,1,1,0,0,1,0,1,1,1,0,0,0],[1,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,0,0,1,1,0,1,0,0,1,0,1,1,0,1,1,1,1,0,0,1,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,0,0,1,0,1,0,1,0,1,1,0,0,1,1,0,0,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,0,0,1,1,0,1,0,0,0,1,1],[0,0,1,0,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1,1,1,1,1,0,0,1,0,0,1,1,0,0,1,1,0,0,1,0,1,1,0,1,0,0,1,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1],[1,1,1,0,0,0,1,1,0,1,0,1,1,1,1,0,1,1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,0,1,1,0,1,0,0,1,1,0,1,0,0,1,0,0,0,0,0,0,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,0,0,0,0,0,1,1,0,1,1,0,1,1,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,1],[1,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1,0,1,1,1,0,0,1,1,1,0,1,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,1,0,0,1,0,0,0,1,0,1,1],[1,0,0,1,0,1,0,0,0,1,1,1,1,0,0,1,1,1,0,1,1,0,1,0,1,1,1,1,0,0,1,1,1,0,1,0,0,1,0,1,1,0,1,0,1,1,0,0,1,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,0,1,1,0,1,0,0,0,1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,0,1,0],[1,1,1,1,0,1,1,1,1,1,0,0,1,1,0,1,0,1,0,0,1,1,1,0,1,0,0,0,0,0,1,0,1,0,1,1,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1,1,0,1,1,1,0,0,1,1],[0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,1,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,1,1,0,1,0,1,0,0,1,1,1,1,1,0,0,1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,0,0,1],[1,0,1,1,1,0,1,0,1,1,1,0,0,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,1,1,0,0,1,1,0,0,0,0,0,1,0,1,0,0,1,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1],[1,1,1,0,1,1,1,1,1,0,1,1,0,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0]];
		System.out.println(islandPerimeter(grid));
	}
	
    public static int islandPerimeter(int[][] grid) {
    	int numbers = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
            	if(grid[i][j] == 1) numbers ++;
            }
        }
        int initial = numbers * 4;
        int connected = 0;
        for(int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[i].length - 1; j++) {
        		if(grid[i][j] == 1 && grid[i][j + 1] == 1) connected++;
        	}
        }
        for(int i = 0; i < grid.length - 1; i++) {
        	for (int j = 0; j < grid[i].length; j++) {
        		if(grid[i][j] == 1 && grid[i + 1][j] == 1) connected++;
        	}
        }
        return initial - connected * 2;
    }

}