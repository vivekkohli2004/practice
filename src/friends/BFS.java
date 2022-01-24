package friends;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {

	private Map<Integer, LinkedList<Integer>> graph; // adjacency list representation
	private boolean[] visited;
	private Queue<Integer> queue;

	public BFS(int n) {
		visited = new boolean[n];
		graph = new HashMap<>();
		queue = new LinkedList<Integer>();
	}

	public void addEdge(Integer source, Integer dest) {
		graph.putIfAbsent(source, new LinkedList<>());
		List<Integer> listForSource = graph.get(source);
		listForSource.add(dest);
	}

	public void traverseBfs(Integer node) {
		Integer nextNode;
		/*
		 * visited[node] = true; System.out.println(node);
		 */
		LinkedList<Integer> l;
		Iterator<Integer> it;
		queue.add(node);
		visited[node] = true;
		while (!queue.isEmpty()) {
			nextNode = queue.poll();
			System.out.println(nextNode);
			l = graph.get(nextNode);
			it = l.iterator();
			while (it.hasNext()) {
				nextNode = it.next();
				if (!visited[nextNode]) {
					queue.add(nextNode);
					visited[nextNode] = true;
				}
			}
		}

	}
	
	
	//THIS ALSO WORKED:
	
	/**
	 * 
	queue.add(node);
	LinkedList<Integer> nodes;

	Iterator<Integer> it;
	Integer next;
	while (!queue.isEmpty()) {
		node = queue.poll();
		visited[node] = true;
		System.out.println(node + " ");
		it = graph.get(node).iterator();
		while (it.hasNext()) {
			next = it.next();
			if (!visited[next]) {
				queue.add(next);
			}

		}

	}**/

	public static void main(String[] args) {
		BFS obj = new BFS(4);// no of vertices.
		// for an undirected graph we need to add the opposite leg as well.
		obj.addEdge(0, 1);
		obj.addEdge(0, 2);
		obj.addEdge(1, 2);
		obj.addEdge(2, 0);
		obj.addEdge(2, 3);
		obj.addEdge(3, 3);
		obj.traverseBfs(2);
	}
}
