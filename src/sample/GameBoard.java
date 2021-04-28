package sample;


import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class GameBoard extends BorderPane {
    private Scene gameScene;
    private static int turns = 0;

    public GameBoard() throws FileNotFoundException {

        // second GridPane
        GridPane testGrid = new GridPane();
        testGrid.setHgap(5);
        testGrid.setVgap(5);
        testGrid.setPadding(new Insets(5, 5, 5, 5));

        gameScene = new Scene(testGrid, 300, 275);

        //image stuff
        InputStream X = new FileInputStream("resources/X.png");
        InputStream blankStream = new FileInputStream("resources/blank.png");
        InputStream O = new FileInputStream("resources/o.png");

        Image blank = new Image(blankStream);
        Image xImage = new Image(X);
        Image oImage = new Image(O);

        //first column
        ImageView imageView = new ImageView();
        imageView.setImage(blank);
        imageView.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root = new Group(imageView);
        testGrid.add(root, 0, 0);


        ImageView imageView2 = new ImageView();
        imageView2.setImage(blank);
        imageView2.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView2.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root2 = new Group(imageView2);
        testGrid.add(root2, 0, 1);

        ImageView imageView3 = new ImageView();
        imageView3.setImage(blank);
        imageView3.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView3.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root3 = new Group(imageView3);
        testGrid.add(root3, 0, 2);


        //second column
        ImageView imageView4 = new ImageView();
        imageView4.setImage(blank);
        imageView4.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView4.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root4 = new Group(imageView4);
        testGrid.add(root4, 1, 0);


        ImageView imageView5 = new ImageView();
        imageView5.setImage(blank);
        imageView5.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView5.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root5 = new Group(imageView5);
        testGrid.add(root5, 1, 1);

        ImageView imageView6 = new ImageView();
        imageView6.setImage(blank);
        imageView6.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView6.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root6 = new Group(imageView6);
        testGrid.add(root6, 1, 2);


        //third column
        ImageView imageView7 = new ImageView();
        imageView7.setImage(blank);
        imageView7.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView7.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root7 = new Group(imageView7);
        testGrid.add(root7, 2, 0);


        ImageView imageView8 = new ImageView();
        imageView8.setImage(blank);
        imageView8.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView8.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root8 = new Group(imageView8);
        testGrid.add(root8, 2, 1);

        ImageView imageView9 = new ImageView();
        imageView9.setImage(blank);
        imageView9.fitWidthProperty().bind(gameScene.widthProperty().divide(3.3));
        imageView9.fitHeightProperty().bind(gameScene.heightProperty().divide(3.3));
        Group root9 = new Group(imageView9);
        testGrid.add(root9, 2, 2);


        root.setOnMouseClicked(event->{
            if(event.getButton() == MouseButton.PRIMARY){
                if(imageView.getImage() == blank){
                    if (turns == 0 || turns % 2 == 0){
                        imageView.setImage(xImage);
                        turns ++;
                    }else{
                        imageView.setImage(oImage);
                        turns += 1;
                    }
                    System.out.println(turns);
                }

            }
        });

        root2.setOnMouseClicked(event->{
            if(event.getButton() == MouseButton.PRIMARY) {
                if (imageView2.getImage() == blank) {
                    if (turns == 0 || turns % 2 == 0) {
                        imageView2.setImage(xImage);
                        turns++;
                    } else {
                        imageView2.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });

        root3.setOnMouseClicked(event->{
            if(event.getButton() == MouseButton.PRIMARY){
                if(imageView3.getImage() == blank){
                    if (turns == 0 || turns % 2 == 0){
                        imageView3.setImage(xImage);
                        turns ++;
                    }else{
                        imageView3.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });

        root4.setOnMouseClicked(event->{
            if(imageView4.getImage() == blank){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView4.setImage(xImage);
                        turns ++;
                    }else{
                        imageView4.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });

        root5.setOnMouseClicked(event->{
            if(imageView5.getImage() == blank){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView5.setImage(xImage);
                        turns ++;
                    }else{
                        imageView5.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });

        root6.setOnMouseClicked(event->{
            if(imageView6.getImage() == blank){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView6.setImage(xImage);
                        turns ++;
                    }else{
                        imageView6.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });

        root7.setOnMouseClicked(event->{
            if(imageView7.getImage() == blank){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView7.setImage(xImage);
                        turns ++;
                    }else{
                        imageView7.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });

        root8.setOnMouseClicked(event->{
            if(imageView8.getImage() == blank){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView8.setImage(xImage);
                        turns ++;
                    }else{
                        imageView8.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });

        root9.setOnMouseClicked(event->{
            if(imageView9.getImage() == blank){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView9.setImage(xImage);
                        turns ++;
                    }else{
                        imageView9.setImage(oImage);
                        turns += 1;
                    }
                }
            }
        });


    }

    public Scene returnScene(){
        return gameScene;
    }


}
