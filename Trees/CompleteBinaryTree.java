package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {

	private TreeNode root;

	class TreeNode {

		TreeNode(int d) {
			data = d;
		}

		int data;
		TreeNode left, right;

	}

	public boolean isCompleteTree(TreeNode root) {
		
		if (root == null) {
			return false;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		boolean nullFound = false;
		TreeNode nextNode;

		while (!queue.isEmpty()) {
			nextNode = queue.poll();
			if (nextNode == null) {
				nullFound = true;
			} else {
				if (nullFound) {
					return false;
				}
				queue.add(nextNode.left);
				queue.add(nextNode.right);

			}
		}
		return true;
	}

	public static void main(String[] args) {
		CompleteBinaryTree tree = new CompleteBinaryTree();
		/*
		 * tree.root = tree.new TreeNode(1); tree.root.left = tree.new TreeNode(2);
		 * tree.root.right = tree.new TreeNode(3); tree.root.left.right = tree.new
		 * TreeNode(5); tree.root.left.left = tree.new TreeNode(4);
		 * tree.root.right.right = tree.new TreeNode(6);
		 */

		tree.root = tree.new TreeNode(20);
		tree.root.left = tree.new TreeNode(5);
		tree.root.left.left = tree.new TreeNode(2);
		tree.root.left.right = tree.new TreeNode(4);
		tree.root.right = tree.new TreeNode(40);

		System.out.println(tree.isCompleteTree(tree.root));

	}
}
