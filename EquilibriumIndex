package IceBreakers;

import java.util.Arrays;

/*
 Question 3
Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to
the sum of elements at higher indexes. For example, in an arrya A:
A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
6 is also an equilibrium index, because sum of zero elements is zero,
i.e., A[0] + A[1] + A[2] + A[3] + A[4] + A[5]=0
7 is not an equilibrium index, because it is not a valid index of array A.
Write a function int equilibrium(int[] arr, int n); that given a sequence arr[] of size n,
returns an equilibrium index (if any) or -1 if no equilibrium indexes exist.
 */

/*
input: [-7, 1, 5, 2, -4, 3, 0]
3
input: [-7, 1, 5, 2, -4, 3, -7]
0
input: [-7, 1, 5, 2, -4, 3, 5]
6
input: [-7, 1, 5, 2, -4, 3, 5]
6
input: [-7, 1, 5, 2, -4, 9, 6]
-1
input: []
-1
input: [1]
0
 */
public class EquilibriumIndex {
	int[] arr;
	EquilibriumIndex(int[] arr) {
		System.out.println("input: " + Arrays.toString(arr));
		this.arr = arr;
	}

	public int solve() {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int lsum, rsum;
		lsum = 0;
		rsum = sum;
		for(int i=0;i<arr.length;i++) {
			if(i != 0) {
				lsum = lsum+arr[i-1];
			}
			rsum = rsum-arr[i];
			if(lsum == rsum) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
		EquilibriumIndex e1 = new EquilibriumIndex(arr1);
		System.out.println(e1.solve());
		int[] arr2 = {-7, 1, 5, 2, -4, 3, -7};
		EquilibriumIndex e2 = new EquilibriumIndex(arr2);
		System.out.println(e2.solve());
		int[] arr3 = {-7, 1, 5, 2, -4, 3, 5};
		EquilibriumIndex e3 = new EquilibriumIndex(arr3);
		System.out.println(e3.solve());
		int[] arr4 = {-7, 1, 5, 2, -4, 3, 5};
		EquilibriumIndex e4 = new EquilibriumIndex(arr4);
		System.out.println(e4.solve());
		int[] arr5 = {-7, 1, 5, 2, -4, 9, 6};
		EquilibriumIndex e5 = new EquilibriumIndex(arr5);
		System.out.println(e5.solve());
		int[] arr6 = {};
		EquilibriumIndex e6 = new EquilibriumIndex(arr6);
		System.out.println(e6.solve());
		int[] arr7 = {1};
		EquilibriumIndex e7 = new EquilibriumIndex(arr7);
		System.out.println(e7.solve());

	}

}
