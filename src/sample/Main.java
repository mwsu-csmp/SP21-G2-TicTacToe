package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {

    private Scene startScene;
    private Scene gameScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");

        // sets up GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // second GridPane
        GridPane testGrid = new GridPane();
        testGrid.setAlignment(Pos.CENTER);
        testGrid.setHgap(10);
        testGrid.setVgap(10);
        testGrid.setPadding(new Insets(25, 25, 25, 25));

        startScene = new Scene(grid, 300, 275);
        gameScene = new Scene(testGrid, 300, 275);
        primaryStage.setScene(startScene);

        // creates and displays scene title
        Text sceneTitle = new Text("Tic Tac Toe");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        // creates and displays button to begin new game
        Button btn = new Button("New Game");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actionTarget = new Text();
        testGrid.add(actionTarget, 1, 6);

        // Event handler for New Game button
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(gameScene);
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("New Scene loaded");
            }
        });


        primaryStage.show();
    }



}
