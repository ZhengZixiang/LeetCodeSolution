
public class ClimbingStairs {
	public static void mian(String [] args) {
		System.out.println(climbStairs(0));
	}
	
	public static int climbStairs(int n) {
		if(n < 2) return 1;

		int [] dp = new int[3];
		dp[0] = 1;
		dp[1] = 1;
		
		//动态规划等式：dp[n] = dp[n-1] + dp[n-2]
		//初始状态：dp[0] = 1, dp [1] = 1
		for(int i = 2; i <= n; i++) {
			dp[i % 3] = dp[(i - 1) % 3] + dp[(i - 2) % 3];
		}
		
		return dp[n % 3];
	}
}
