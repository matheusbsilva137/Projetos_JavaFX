import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesAvancados_JavaFX extends Application {
    Label lblTitulo;
    RadioButton rbJava, rbC, rbPython;
    CheckBox chkFrequencia, chkGosto;
    TextField txtNome;
    Button btnSubmeter;
    ToggleButton tbLinux, tbWindows, tbMac;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        VBox raiz = new VBox(10);
        raiz.setTranslateX(10);
        raiz.setTranslateY(20);
        
        lblTitulo = new Label("Pesquisa sobre Programação");
        lblTitulo.setUnderline(true);
        
        txtNome = new TextField();
        HBox hbnome = new HBox(10);
        hbnome.getChildren().addAll(new Label("Nome"), txtNome);
        
        HBox hbSo = new HBox(20);
        tbLinux = new ToggleButton("Linux");
        tbWindows = new ToggleButton("Windows");
        tbMac = new ToggleButton("Mac");
        ToggleGroup tgSo = new ToggleGroup();
        tgSo.getToggles().addAll(tbLinux, tbWindows, tbMac); // 5
        hbSo.getChildren().addAll(new Label("Sistema Operacional Utilizado"), tbLinux, tbWindows, tbMac);
        
        ToggleGroup tgLinguagem = new ToggleGroup();
        HBox hbLinguagens = new HBox(20);
        rbJava = new RadioButton("Java");
        rbJava.setSelected(true);
        rbC = new RadioButton("C");
        rbPython = new RadioButton("Python");
        tgLinguagem.getToggles().addAll(rbJava, rbC, rbPython);
        hbLinguagens.getChildren().addAll(new Label("Linguagem de programação predileta: "), rbJava, rbC, rbPython);
        
        chkFrequencia = new CheckBox("Programa todo dia?");
        chkGosto = new CheckBox("Gosta de programação?");
        chkGosto.setAllowIndeterminate(true);
        chkGosto.setIndeterminate(true);
        
        btnSubmeter = new Button("Submeter pesquisa");
        
        raiz.getChildren().addAll(lblTitulo, hbnome, hbSo, hbLinguagens, chkFrequencia, chkGosto, btnSubmeter);
        
        Scene scene = new Scene(raiz, 450, 250);
        
        primaryStage.setTitle("Tratando eventos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
