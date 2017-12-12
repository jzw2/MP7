package application;

import java.util.Arrays;

public abstract class SortAlgorithm {
	protected int[] array;
	protected boolean isSorted;
	
	public SortAlgorithm(int[] array) {
		this.array = array;
	}
	
	public abstract void nextStep();
	
	protected void swap(int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
	public String description() {
		return "";
	}
	
	public void setArray(int[] arr) {
		this.array = arr;
		isSorted = false;
	}
	
	public int[] getArray() { 
		return array;
	}
}
