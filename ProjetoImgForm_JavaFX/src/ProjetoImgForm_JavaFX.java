import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ProjetoImgForm_JavaFX extends Application {
    private String img_url = "/img/Wired.png";

    public static void main(String[] args) {
        launch();
    }
    
    @Override
    public void start(Stage primaryStage) {
        Image imagem = new Image(img_url);
        ImageView foto = new ImageView(imagem);
        foto.fitHeightProperty().set(350);
        foto.fitWidthProperty().set(350);
        
        StackPane root = new StackPane();
        root.getChildren().add(foto);
        
        Scene scene = new Scene(root, 600, 600);
        primaryStage.centerOnScreen(); 
        primaryStage.setHeight(Screen.getPrimary().getVisualBounds().getHeight()); 
        primaryStage.setWidth(Screen.getPrimary().getVisualBounds().getWidth()); 
        
        primaryStage.setTitle("Wired");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
