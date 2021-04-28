package sample;

import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class GameBoard extends BorderPane {
    private Scene gameScene;

    public GameBoard() throws FileNotFoundException {

        // second GridPane
        GridPane testGrid = new GridPane();
        testGrid.setHgap(5);
        testGrid.setVgap(5);
        testGrid.setPadding(new Insets(5, 5, 5, 5));

        gameScene = new Scene(testGrid, 300, 275);

        // First column of boxes
        Rectangle r1 = new Rectangle();
        r1.setFill(null);
        r1.setStroke(Color.BLACK);
        r1.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r1.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        Rectangle r2 = new Rectangle();
        r2.setFill(null);
        r2.setStroke(Color.BLACK);
        r2.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r2.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        Rectangle r3 = new Rectangle();
        r3.setFill(null);
        r3.setStroke(Color.BLACK);
        r3.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r3.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        // second column of boxes
        Rectangle r4 = new Rectangle();
        r4.setFill(null);
        r4.setStroke(Color.BLACK);
        r4.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r4.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        Rectangle r5 = new Rectangle();
        r5.setFill(null);
        r5.setStroke(Color.BLACK);
        r5.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r5.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        Rectangle r6 = new Rectangle();
        r6.setFill(null);
        r6.setStroke(Color.BLACK);
        r6.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r6.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        // third column of boxes
        Rectangle r7 = new Rectangle();
        r7.setFill(null);
        r7.setStroke(Color.BLACK);
        r7.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r7.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        Rectangle r8 = new Rectangle();
        r8.setFill(null);
        r8.setStroke(Color.BLACK);
        r8.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r8.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        Rectangle r9 = new Rectangle();
        r9.setFill(null);
        r9.setStroke(Color.BLACK);
        r9.heightProperty().bind(gameScene.heightProperty().divide(3.3));
        r9.widthProperty().bind(gameScene.widthProperty().divide(3.3));

        testGrid.add(r1, 0,0);
        testGrid.add(r2, 0,1);
        testGrid.add(r3, 0,2);
        testGrid.add(r4, 1,0);
        testGrid.add(r5, 1,1);
        testGrid.add(r6, 1,2);
        testGrid.add(r7, 2,0);
        testGrid.add(r8, 2,1);
        testGrid.add(r9, 2,2);


        //image stuff
        InputStream X = new FileInputStream("resources/X.png");
        Image xImage = new Image(X);
        ImageView imageView = new ImageView();
        imageView.setImage(xImage);
        imageView.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root = new Group(imageView);
        testGrid.add(root, 0, 0);

        InputStream O = new FileInputStream("resources/o.png");
        Image oImage = new Image(O);
        ImageView imageView2 = new ImageView();
        imageView2.setImage(oImage);
        imageView2.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView2.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root2 = new Group(imageView2);
        testGrid.add(root2, 1, 2);


        Button b1 = new Button();
        b1.setStyle("-fx-border-color: transparent ");




    }

    public Scene returnScene(){
        return gameScene;
    }

}
