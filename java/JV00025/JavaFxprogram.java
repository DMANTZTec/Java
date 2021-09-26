package application;
import javafx.application.Application;//importing Application class
import javafx.scene.Group;// importing group
import javafx.scene.Scene;// import Scene 
import javafx.scene.image.Image;//Import image
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;// import paint
import javafx.stage.Stage;// import Stage
public class JavaFxprogram extends Application{ //creating a class inherits with Application class

	public static void main(String[] args) {
		
      launch(args);// to start start() method 
	}
	@Override
	public void start(Stage stage) throws Exception { //to override the application start method
		//Stage stage=new Stage();
		Group root=new Group();// set Group
		Scene scene=new Scene(root,Color.BLACK);// set scene and setting block color to the scene
		Image icon=new Image("C:\\Users\\ADMIN_2\\eclipse-workspace\\HelloFx\\src\\application\\img.jpeg");//creating image icon 
		stage.show();//display the stage 
		stage.setScene(scene);//set the scene to the stage
		stage.getIcons().add(icon);//inserting image to the stage
		stage.setTitle("JAVAFX WINDOW");//set title to the stage
		stage.setWidth(420);//set width 
		stage.setHeight(420);//set height
		//stage.setX(50);
		//stage.setY(50);
		stage.setResizable(false);//we can't resize the window
		stage.setFullScreen(false);//set fullscreen to stage
		stage.setFullScreenExitHint("YOU CAN'T ESCAPE UNLESS YOU PRESS q");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));            
	}

}
