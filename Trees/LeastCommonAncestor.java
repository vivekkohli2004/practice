package Trees;

// https://www.youtube.com/watch?v=13m9ZCB8gjw
//LCA of a BST: https://www.youtube.com/watch?v=kulWKd3BUcI
public class LeastCommonAncestor { // of a binary tree

	boolean flag = false;

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		public String toString() {
			return Integer.toString(val);
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null) {
			return null;
		}
		if (root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null) {
			return root;
		}
		
		if (left == null && right == null) {
			return null;
		}
		return left != null ? left : right;

	}

	public static void main(String[] args) {
		LeastCommonAncestor lca = new LeastCommonAncestor();

		TreeNode three = lca.new TreeNode(3);
		TreeNode five = lca.new TreeNode(5);
		TreeNode one = lca.new TreeNode(1);
		TreeNode six = lca.new TreeNode(6);
		TreeNode two = lca.new TreeNode(2);
		TreeNode seven = lca.new TreeNode(7);
		TreeNode four = lca.new TreeNode(4);
		TreeNode zero = lca.new TreeNode(0);
		TreeNode eight = lca.new TreeNode(8);

		three.left = five;
		three.right = one;
		five.left = six;
		five.right = two;
		two.left = seven;
		two.right = four;
		one.left = zero;
		one.right = eight;

		TreeNode node = lca.lowestCommonAncestor(three, seven, six);
		System.out.println(node.val);
	}
}
