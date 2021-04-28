package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StartBoard {
    private Scene startBoard;
    private Button startGame;

    public StartBoard(){

        // sets up GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        startBoard = new Scene(grid, 300, 275);

        // creates and displays scene title
        Text sceneTitle = new Text("Tic Tac Toe");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        // creates and displays button to begin new game
        startGame = new Button("New Game");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(startGame);
        grid.add(hbBtn, 1, 4);


    }

    // returns scene
    public Scene returnScene(){
        return startBoard;
    }

    // returns start button
    public Button returnStart(){
        return startGame;
    }
}
