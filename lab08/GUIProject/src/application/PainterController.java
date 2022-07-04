package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

	@FXML
	private Pane drawingAreaPane;
	
	@FXML
	public void clearButtonPressed(ActionEvent e) {
		drawingAreaPane.getChildren().clear();
	}
	
	@FXML
	private RadioButton pen, eraser;
	
	@FXML
	public void drawingAreaMouseDragged(MouseEvent e) {
		Circle newCircle = new Circle(e.getX(),
				e.getY(), 4, Color.BLACK);
		drawingAreaPane.getChildren().add(newCircle);
	}
	
	public void getTool(MouseEvent me) {
		if(pen.isSelected()) {
			Circle newCircle = new Circle(me.getX(),
					me.getY(), 4, Color.BLACK);
			drawingAreaPane.getChildren().add(newCircle);
		}
		
		else if(eraser.isSelected()) {
			Circle newCircle2 = new Circle(me.getX(),
					me.getY(), 5, Color.WHITE);
			drawingAreaPane.getChildren().add(newCircle2);
		}
		
		
		
	}
}
