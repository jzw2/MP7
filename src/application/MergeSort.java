package application;

import java.util.ArrayDeque;
import java.util.Deque;

public class MergeSort extends SortAlgorithm{
	
	private Deque<Range> stack;
	
	public MergeSort(int[] arr) {
		super(arr);
		setArray(arr);
		
	}

	public void nextStep() {
		
	}
	
	@Override
	public void setArray(int[] arr) {
		super.setArray(arr);
		stack = new ArrayDeque<Range>();
		
		
	}
	
	private void addInstructions(Range r) {
		if (r.start == r.end) {
			addInstructions(r);
			return;
		}
		stack.push(r);
		int mid = (r.start + r.end ) / 2;
		addInstructions(new Range(mid + 1, r.end));
		addInstructions(new Range(r.start, mid));
		
	}
}

class Range {
	int start;
	int end;
	
	public Range(int s, int e) {
		start = s;
		end = e;
	}
}
