package Trees;

public class MergeBinaryTrees {

	public static void main(String[] args) {
		MergeBinaryTrees obj = new MergeBinaryTrees();

		Node root1 = obj.new Node(1);
		root1.left = obj.new Node(2);
		root1.right = obj.new Node(3);
		root1.left.left = obj.new Node(4);
		root1.left.right = obj.new Node(5);
		root1.right.right = obj.new Node(6);

		Node root2 = obj.new Node(4);
		root2.left = obj.new Node(1);
		root2.right = obj.new Node(7);
		root2.left.left = obj.new Node(3);
		root2.right.left = obj.new Node(2);
		root2.right.right = obj.new Node(6);
		Node root3 = mergeTrees(root1, root2);
		System.out.printf("The Merged Binary Tree is:\n");
		inorder(root3);

	}

	static void inorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		inorder(node.left);

		/* then print the data of node */
		System.out.printf("%d ", node.data);

		/* now recur on right child */
		inorder(node.right);
	}

	static Node mergeTrees(Node root1, Node root2) {
		if (root1 != null && root2 != null) {
			root1.data += root2.data;
		} else {

			if (root1 == null) { // adding '&& root2!=null' will cause NPE

				return root2;

			} else if (root2 == null) { // adding '&& root1!=null' will cause NPE

				return root1;

			}
		}
		root1.left = mergeTrees(root1.left, root2.left);
		root1.right = mergeTrees(root1.right, root2.right);
		return root1;
	}

	class Node {

		Node(int d) {
			data = d;
		}

		int data;
		Node left, right;

	}

}
