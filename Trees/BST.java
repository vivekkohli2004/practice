package Trees;

public class BST {

	public Node root;

	public static void main(String[] args) {
		BST bst = new BST();
		// call the method insert
		bst.insert(2);
		bst.insert(4);
		bst.insert(1);
		bst.insert(3);
		bst.insert(5);
		bst.preorder();
	}

	public void preorder() {
		preorder(root);

	}

	private void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		preorder(root.left);
		preorder(root.right);

	}

	void insert(int data) {
		root=insert(root, data);
	}

	private Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		}

		else if (data < root.data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}

	class Node {

		Node(int d) {
			data = d;
		}

		int data;
		Node left, right;

	}
}
