import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage Stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
		Scene scene = new Scene(root);
		Stage.setTitle("Calculator");
		Stage.setScene(scene);
		Stage.show();
		Stage.setResizable(false);
	}

}
