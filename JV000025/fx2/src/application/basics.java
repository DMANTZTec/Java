package application;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class basics extends Application{ //basics extends Application
	public static void main(String[] args)
	{
		launch(args); //to start start() method
	}
	public void start(Stage stage) throws Exception{ 
		Group root=new Group(); //creating root for the window
		Scene scene=new Scene(root,600,600,Color.DARKSEAGREEN); //creating scene
		
		Text text=new Text(); //creating text
		text.setText("hello dude"); //adding text
		text.setX(50); //setting x position for the text
		text.setY(50); //setting y position for the text
		
		Line line=new Line(); //creating line
		line.setStartX(200); //setting x position to start line
		line.setStartY(200); //setting x position to start line
		line.setEndX(300); //setting x position to end line
		line.setEndY(300);//setting y position to end line
		
		Rectangle rectangle=new Rectangle(); //creating rectangle
		rectangle.setX(400); //setting x position to start rectangle
		rectangle.setY(400); //setting y position to start rectangle
		rectangle.setHeight(80); //setting height for the rectangle
		rectangle.setWidth(90); //setting width for the rectangle
		rectangle.setFill(Color.ALICEBLUE); //filling rectangle with colour
		 
		Image image=new Image("C:/Users/admin/Downloads/mahi.jpeg"); //creating image
		ImageView view=new ImageView(image); //creating image view
		view.setX(100); //to set x position for image
		view.setY(300); //to set y position for image
		
		Circle circle=new Circle(); //creating circle
		circle.setCenterX(100); //to set x position for circle
		circle.setCenterY(300); //to set y position for circle
		circle.setRadius(60); //to set radius for the circle
		
		root.getChildren().add(circle); //adding circle to the stage
		root.getChildren().add(view); //adding view to the stage
		root.getChildren().add(rectangle); //adding rectangle to the stage
		root.getChildren().add(line); //adding line to the stage
		root.getChildren().add(text); //adding text to the stage
		stage.setScene(scene); //adding scene to the stage
		stage.show(); //to appear the window
		stage.setTitle("basics"); //to set title for the window
		
	}

}
