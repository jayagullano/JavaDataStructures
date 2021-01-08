package com.Sorting;

public class MergeSort implements IntSorter{

	@Override
	public void sort(int [] arr, int low, int high) {
		if(low < high) {
			int middle = (low + high) / 2;
			sort(arr, low, middle);
			sort(arr, middle + 1, high);
			merge(arr, low, middle, high);
		}
		
	}

	@Override
	public void sort(int [] arr) {
		// TODO Auto-generated method stub
		
	}
	
	private void merge(int [] arr, int low, int middle, int high) {
		int leftLength = middle - low + 1;
		int rightLength = high - middle;
		
		int [] left = new int[leftLength];
		int [] right = new int[rightLength];
		
		for(int i = 0; i < leftLength; ++i) {
			left[i] = arr[low + i];
		}
	}
}
