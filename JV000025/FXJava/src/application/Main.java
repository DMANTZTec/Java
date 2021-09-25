package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application { //main class extends application
	public static void main(String[] args) throws Exception {
		launch(args); //to start start() method 
	}

	@Override
	public void start(Stage stage) throws Exception { 
		// TODO Auto-generated method stub
		Image icon=new Image("C:\\Users\\admin\\Downloads\\mahi.jpeg");  // creating image icon
		stage.getIcons().add(icon); //adding image to the stage
		Group root=new Group(); //creating root for the window
		Scene scene=new Scene(root,Color.ALICEBLUE); //adding color to the scene
		stage.setScene(scene); //adding scene to the stage
		stage.setTitle("fx demo"); //adding title to the stage
		stage.setResizable(false); //to prevent size of the window
		stage.setHeight(420); //setting height for the window
		stage.setWidth(420);//setting width for he window
		stage.show(); //to appear on the output 
		 
	}

	
	}
	


