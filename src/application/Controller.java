package application;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javax.annotation.Resources;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

public class Controller  {

	  @FXML private Label array;
	  @FXML private Label description;
	  @FXML private Button next;
	  @FXML private Button random;
	  @FXML private RadioButton bubbleSort;
	  
	  private  SortAlgorithm currentSort;
	  private int[] arr = {5, 4, 6, 2, 3, 1};
	  
	
	  public void initialize() {

	        // do initialization and configuration work...

	        // trivial example, could also be done directly in the fxml:
		  currentSort = new SelectionSort(arr);
		  bubbleSort.setSelected(true);
		  
	       array.setText(currentSort.toString());
	       description.setText(currentSort.description());
	       
	       
	 }
	  
	 private void displayInfo() {
		
		 array.setText(currentSort.toString());
		 description.setText(currentSort.description());
		 
	 }
	  
	 @FXML protected void generate() {
		 for(int i = 0; i < arr.length; i++) {
			 arr[i] = (new Random()).nextInt(10);
		 }
		 currentSort.setArray(arr);
		 displayInfo();
	 }
	 
	 @FXML protected void onNext() {
		 currentSort.nextStep();
		 displayInfo();
	 }
	 
	 @FXML protected void selectBubble() {
		 currentSort = new BubbleSort(arr);
		 displayInfo();
	 }
	 
	 @FXML protected void selectSelection() {
		 currentSort = new SelectionSort(arr);
		 displayInfo();
	 }
	
}
