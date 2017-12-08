package application;

public class BubbleSort extends SortAlgorithm {
	
	
	private int currentIndex = 0;
	private boolean hasSwapped = false;
	public BubbleSort(int[] arr) {
		super(arr);
	}
	public void nextStep() {
		if (currentIndex < array.length - 1) {
			if (array[currentIndex] > array[currentIndex + 1]) {
				swap(currentIndex, currentIndex + 1);
				hasSwapped = true;
				
			}
			currentIndex++;
		} else { 
			//at the end right now
			if (!hasSwapped) {
				isSorted = true;
			}
			currentIndex = 0;
			nextStep();
			hasSwapped = false;
		}
		
	}
	
}
