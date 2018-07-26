package main;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Main extends Application {
    
    private String video_url = getClass().getResource("/video/video.mp4").toString();

    public static void main(String[] args) {
        launch();
    }
    
    @Override
    public void start(Stage primaryStage) {
        VBox raiz = new VBox(20);
        raiz.setAlignment(Pos.CENTER);
        raiz.setTranslateY(5);
         
        Media media = new Media(video_url);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        
        raiz.getChildren().add(mediaView);       
        Scene cena = new Scene(raiz, 600, 450);
        
        primaryStage.setTitle("Reprodução de vídeos");
        primaryStage.setScene(cena);
        primaryStage.show();
        
        mediaPlayer.play();
        
        Button pause = new Button("PAUSE");
        pause.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                mediaPlayer.pause();
            }
        });
        
        Button play = new Button("PLAY");
        play.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                mediaPlayer.play();
            }
        });

        raiz.getChildren().addAll(pause, play);
    }
}