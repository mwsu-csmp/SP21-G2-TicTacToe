package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {

    private static GameBoard gameBoard;
    private static StartBoard startBoard;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Tic Tac Toe");


        startBoard = new StartBoard();
        primaryStage.setScene(startBoard.returnScene());

        Button btn = startBoard.returnStart();


        gameBoard = new GameBoard();


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(gameBoard.returnScene());

            }
        });




        primaryStage.show();
    }



}
