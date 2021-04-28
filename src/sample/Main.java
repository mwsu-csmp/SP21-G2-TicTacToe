package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.input.MouseButton;


public class Main extends Application {

    private static GameBoard gameBoard;
    private static StartBoard startBoard;
    private static EndBoard endBoard;


    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // sets title
        primaryStage.setTitle("Tic Tac Toe");

        // sets up first board
        startBoard = new StartBoard();
        primaryStage.setScene(startBoard.returnScene());

        Button btn = startBoard.returnStart();

        // sets up gameBoard
        gameBoard = new GameBoard();

        // changes from startBoard to gameBoard
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(gameBoard.returnScene());

            }
        });


        primaryStage.show();
    }



}
