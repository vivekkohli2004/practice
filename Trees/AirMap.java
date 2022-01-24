package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given the following routes, print all possible routes between the airport C and D:
public class AirMap {

	private static Map<String, List<String>> graph; // adjacency list representation
	private static boolean[] visited;

	public AirMap(int n) {
		visited = new boolean[n];
		graph = new HashMap<>();
	}

	public void add_Route(String start, String destination) {
		graph.putIfAbsent(start, new ArrayList<>());
		graph.get(start).add(destination);

	}

	public void print_All_Routes(String start, String destination) {

		ArrayList<String> pathList = new ArrayList<>();
		pathList.add(start);

		printAllRoutesUtil(start, destination, pathList);

	}

	private void printAllRoutesUtil(String start, String destination, ArrayList<String> pathList) {

		if (start.equals(destination)) {
			System.out.println(pathList);
			return;
		}
		visited[getArrayIndex(start)] = true;
		for (String next : graph.get(start)) {
			if (!visited[getArrayIndex(next)]) {
				pathList.add(next);
				printAllRoutesUtil(next, destination, pathList);
				pathList.remove(next);
				//visited[getArrayIndex(next)] = false; //--this also works
			}
		}
		visited[getArrayIndex(start)] = false;

	}

	private int getArrayIndex(String str) {
		Map<String, Integer> m = new HashMap<>();
		m.put("A", 0);
		m.put("B", 1);
		m.put("C", 2);
		m.put("D", 3);

		return m.get(str);
	}

	public static void main(String[] args) {

		AirMap obj = new AirMap(4);
		obj.add_Route("A", "B");
		obj.add_Route("A", "C");
		obj.add_Route("A", "D");

		obj.add_Route("B", "A");
		obj.add_Route("B", "C");
		obj.add_Route("B", "D");

		obj.add_Route("C", "A");
		obj.add_Route("C", "B");

		obj.add_Route("D", "A");
		obj.add_Route("D", "B");

		obj.print_All_Routes("C", "D");
		/*
		 * List<String> aList= new ArrayList<>(); aList.add("B"); aList.add("C");
		 * aList.add("D"); List<String> bList= new ArrayList<>(); aList.add("A");
		 * aList.add("C"); aList.add("D"); List<String> cList= new ArrayList<>();
		 * aList.add("A"); aList.add("B"); List<String> dList= new ArrayList<>();
		 * aList.add("A"); aList.add("B");
		 */

		// graph.put("A", aList);graph.put("B", bList); graph.put("C", cList);
		// graph.put("D", dList);

	}

}
