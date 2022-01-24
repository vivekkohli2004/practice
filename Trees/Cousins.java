package Trees;
//https://www.youtube.com/watch?v=PoT9PH8S7kc
public class Cousins {

	int xDepth = 0;
	int yDepth = 0;

	TreeNode xParent;
	TreeNode yParent;

	public boolean isCousins(TreeNode root, int x, int y) {

		findDepth(root, null, 0, x, y);
		if (xDepth == yDepth) {
			return xParent != yParent;
		}
		return false;

	}

	private void findDepth(TreeNode root, TreeNode parent, int depth, int x, int y) {

		if (root == null) {
			return;
		}

		if (root.val == x) {
			xParent = parent;
			xDepth = depth;
		}

		else if (root.val == y) {
			yParent = parent;
			yDepth = depth;

		} else {
			findDepth(root.left, root, depth + 1, x, y);
			findDepth(root.right, root, depth + 1, x, y);
		}
	}

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

	public static void main(String[] args) {
		Cousins cousins = new Cousins();
		TreeNode three = cousins.new TreeNode(3);
		TreeNode five = cousins.new TreeNode(5);
		TreeNode one = cousins.new TreeNode(1);
		TreeNode six = cousins.new TreeNode(6);
		TreeNode two = cousins.new TreeNode(2);
		TreeNode seven = cousins.new TreeNode(7);
		TreeNode four = cousins.new TreeNode(4);
		TreeNode zero = cousins.new TreeNode(0);
		TreeNode eight = cousins.new TreeNode(8);

		three.left = five;
		three.right = one;
		five.left = six;
		five.right = two;
		two.left = seven;
		two.right = four;
		one.left = zero;
		one.right = eight;
		
		System.out.println(cousins.isCousins(three, six.val, two.val));
		System.out.println(cousins.isCousins(three, two.val, zero.val));
		
		
	}
}
