package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try { 
		Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); //if having only one scene otherwise see below
		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css); //several scene now possible
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}