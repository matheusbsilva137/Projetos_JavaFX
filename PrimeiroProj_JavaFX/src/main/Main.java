package main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main (String[] args){
        launch();
    }
    
    @Override
    public void start(Stage palco) throws Exception{
        StackPane raiz = new StackPane();
        Label lblMsg = new Label();
        
        lblMsg.setText("Este é o JavaFX!");
        raiz.getChildren().add(lblMsg);
        
        Scene cena = new Scene(raiz, 250,100);
        palco.setTitle("JavaFX - Primeiro Software");
        palco.setScene(cena);
        palco.show();
    }
}
