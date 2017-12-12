package application;

public class SelectionSort extends SortAlgorithm {
	
	private int nextSwap = 0;
	private int lookingIndex = 1;
	private int currentMinIndex;
	public SelectionSort(int[] arr) {
		super(arr);
		currentMinIndex = 0;
	}
	
	@Override
	public void nextStep() {
		if (isSorted) {
			return;
		}
		if (nextSwap == array.length - 1) {
			isSorted = true;
			return;
		}
		if (lookingIndex == array.length) {
			swap(currentMinIndex, nextSwap);
			nextSwap++;
			lookingIndex = nextSwap + 1;
			currentMinIndex = nextSwap;
					
		} else {
			if (array[lookingIndex] < array[currentMinIndex]) {
		
				currentMinIndex = lookingIndex;
				
			
			}
			lookingIndex++;
		}
	}
	
	@Override
	public String description() {
		if (isSorted) 
			return "Done";
		return "Minimum value: " + array[currentMinIndex] + " Looking at index " + lookingIndex;
	}
	
	@Override
	public void setArray(int[] arr) {
		super.setArray(arr);
		nextSwap = 0;
		lookingIndex = 1;
		currentMinIndex = 0;
	}
}
