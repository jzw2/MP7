package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BubbleSort bs = new BubbleSort(new int[] {9, 8, 7, 6, 5, 4, 3});
			bs.nextStep();
			bs.nextStep();
			
			
			System.out.println(bs.toString());
			Text t = new Text(bs.toString());
			t.setFont(new Font(45));
			t.setX(45.0);
			t.setY(150);
			
			
			Button b = new Button();
			b.setText("Next Step");
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					bs.nextStep();
					t.setText(bs.toString());
				}
				
			});
			
		
			
			Group root = new Group();
			root.getChildren().add(t);
			root.getChildren().add(b);
			
			Scene scene = new Scene(root,400,400);
	
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
