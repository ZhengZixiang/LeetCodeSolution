
public class BalancedBinaryTree {
	
	public static void main(String [] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		System.out.println(isBalanced(root));
	}
	
    public static boolean isBalanced(TreeNode root) {
        if(judge(root, 0) < 0) return false;
        else return true;
    }
    
    public static int judge(TreeNode node, int depth) {
        if(node == null) {
            return depth - 1;
        }
        int left = judge(node.left, depth + 1);
        int right = judge(node.right, depth + 1);
        if(left != -1 && right != -1 && Math.abs(left - right) < 2) {
        	return Math.max(left, right);
        } else {
        	return -1;
        }
    }
}