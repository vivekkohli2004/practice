package friends;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DFS {

	private Map<Integer, LinkedList<Integer>> graph;
	private boolean[] visited;

	public DFS(int n) {
		visited = new boolean[n];
		graph = new HashMap<>();
	}

	public void addEdge(Integer source, Integer dest) {
		graph.putIfAbsent(source, new LinkedList<>());
		List<Integer> listForSource = graph.get(source);
		listForSource.add(dest);
	}

	public void traverseDfs(Integer node) {
		Integer next;
		visited[node] = true;
		System.out.println(node);
		LinkedList<Integer> l = graph.get(node);
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			next = it.next();
			if (!visited[next]) {
				traverseDfs(next);
			}
		}
	}

	public static void main(String[] args) {
		DFS obj = new DFS(4);// no of vertices.
		// for an undirected graph we need to add the opposite leg as well.
		obj.addEdge(0, 1);
		obj.addEdge(0, 2);
		obj.addEdge(1, 2);
		obj.addEdge(2, 0);
		obj.addEdge(2, 3);
		obj.addEdge(3, 3);
		obj.traverseDfs(2);
	}
}
