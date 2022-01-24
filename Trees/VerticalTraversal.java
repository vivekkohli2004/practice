package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
public class VerticalTraversal {

	List<List<Integer>> result = new ArrayList<>();
	Map<Integer, List<Pair>> map = new TreeMap<>();

	public static void main(String[] args) {
		 VerticalTraversal obj= new VerticalTraversal();
		 
			Node root1 = obj.new Node(3);
			root1.left = obj.new Node(9);
			root1.right = obj.new Node(20);
			root1.right.left=obj.new Node(15);
			root1.right.right=obj.new Node(7);
			
			
		 System.out.println(obj.verticalTraversal(root1)); //NOT working fully for some use cases.
	}

	public List<List<Integer>> verticalTraversal(Node root) {

		List<Pair> list;
		List<Integer> intList;
		verticalTraversalHelper(root, 0, 0);
		for (Integer key : map.keySet()) {
			list = map.get(key);
			intList = new ArrayList<Integer>();
			for (Pair p : list) {
				intList.add(p.getValue());
			}
			result.add(intList);

		}

		return result;
	}

	public void verticalTraversalHelper(Node root, int row, int col) {
		if (root == null) {
			return;
		}
		map.putIfAbsent(col, new ArrayList<Pair>());
		map.get(col).add(new Pair(root, row, col));
		verticalTraversalHelper(root.left, row + 1, col - 1);
		verticalTraversalHelper(root.right, row + 1, col + 1);

	}

	class Node {

		Node(int d) {
			data = d;
		}

		int data;
		Node left, right;

	}

	class Pair implements Comparable<Pair> {
		Node node;
		int col;
		int row;

		Pair(Node node, int row, int col) {
			this.node = node;
			this.row = row;
			this.col = col;
		}

		public int compareTo(Pair p) {
			// if(col!=p.col) return col-p.col;
			// if(row!=p.row) return row-p.row;
			// if(row==p.row && col==p.col)
			return node.data - p.node.data;
		}

		public int getValue() {
			return node.data;
		}
	}
}
