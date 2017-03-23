import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public static void main(String[] args) {
		
	}
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>> ();
        if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<TreeNode> ();
        q.add(root);
        while(!q.isEmpty()) {
        	int size = q.size();
        	ArrayList<Integer> temp = new ArrayList<Integer> ();
        	for(int i = 0; i < size; i++) {
        		TreeNode poll = q.poll();
        		if(poll.left != null) q.add(poll.left);
        		if(poll.right != null) q.add(poll.right);
        		temp.add(poll.val);
        	}
        	list.add(temp);
        }
        
        return list;
    }
    
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>> ();
        addList(list, root, 0);
        return list;
    }
    
    private void addList(List<List<Integer>> list, TreeNode node, int level) {
    	if(node == null) return;
        if(list.size() == level) list.add(new ArrayList<Integer> ());
        List<Integer> temp = list.get(level);
        temp.add(node.val);
        addList(list, node.left, level + 1);
        addList(list, node.right, level + 1);
    }
    
    
}
