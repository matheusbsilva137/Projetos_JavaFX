import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
        
public class ControlesApp_JavaFX extends Application {
    
    public static void main(String[] args) {
        launch();
    }
    
    @Override
    public void start(Stage palco) throws Exception {
        VBox raiz = new VBox(10);
        raiz.setAlignment(Pos.CENTER);
        
        Label rotulo = new Label("Exemplo de Texto!");
        rotulo.setTooltip(new Tooltip("Dica para o usuário!"));
        
        TextField campoTexto = new TextField("Escreva aqui");
        
        TextArea areaTexto = new TextArea("Escreva várias linhas aqui");
        
        Separator separadorHorizontal = new Separator();
        Separator separadorVertical = new Separator(Orientation.VERTICAL);
        
        Slider deslizante = new Slider();
        deslizante.setShowTickLabels(true);
        deslizante.setShowTickMarks(true);
        
        raiz.getChildren().addAll(rotulo, campoTexto, areaTexto, separadorVertical, separadorHorizontal, deslizante);
               
        Scene cena = new Scene(raiz, 300, 400);         
        palco.setTitle("Controles Básicos");
        palco.setScene(cena);
        palco.show();
    }
}
