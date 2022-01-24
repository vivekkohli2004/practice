package interview;

import java.util.HashSet;

//https://www.youtube.com/watch?v=6CkGw6u0n9A	Codility Count Distinct Slices solution
public class DistinctSlices {

	public static void main(String[] args) {
		//int a[] = new int[] { 3, 4, 5, 5, 2 };
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int noOfSlices[] = new int[5];
		noOfSlices[0] = 1;
		noOfSlices[1] = 3; // for 2 elements, 3 distinct slices can be found. Pattern of count of slices: 2 elements will have 3 slices, 3 will have 6, 4-10, 5- 15
		int result = 0;
		HashSet<Integer> hs = new HashSet<>();

		int rptr = 0;int lptr = 0;

		for (rptr = 0; rptr < a.length; rptr++) {
			
			if(!hs.contains(a[rptr])) {
				hs.add(a[rptr]);
				result+=hs.size();
			}else {
				hs.remove(a[lptr++]);
			}
			
			
			
			
			/*
			 * // currSlices++; if (!hs.contains(a[rptr])) { hs.add(a[rptr]); if (hs.size()
			 * > 1) { noOfSlices[hs.size()] = noOfSlices[hs.size() - 1] + hs.size()+1; }
			 * currSlices = noOfSlices[hs.size()-1]; } else { hs.clear(); hs.add(a[rptr]);
			 * result += currSlices; currSlices = 0; }
			 */
		}

		System.out.println(result);

	}

}

