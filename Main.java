package packageName;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException{
			
			//Loads fxml
			FXMLLoader loader=new FXMLLoader (getClass().getResource("Main.fxml"));
			Parent root=loader.load();
			//Creates scene from fxml
			Scene scene =new Scene(root);
			scene.getStylesheets.add(this.getClass().getResource("application.css").toExternalForm());
			
			//sets title of window
			primaryStage.setTitle("TITLE");
			//stops maximise and minimise buttons, optional for static 1 size application, change if dynamic
			primaryStage.setResizable(false);
			//assign the stage a scene
			primaryStage.setScene(scene);
			//Show the stage
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
