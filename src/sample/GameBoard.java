package sample;



import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class GameBoard {
    private Scene gameScene;
    private static int turns = 0;
    private static char board[][] = new char[3][3];
    private static boolean gameWon = false;
    private EndBoard endBoard;


    public GameBoard() throws FileNotFoundException {

        // sets up GridPane
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));

        gameScene = new Scene(grid, 300, 275);

        // sets up images
        InputStream X = new FileInputStream("resources/X.png");
        InputStream blankStream = new FileInputStream("resources/blank.png");
        InputStream O = new FileInputStream("resources/o.png");

        Image blank = new Image(blankStream);
        Image xImage = new Image(X);
        Image oImage = new Image(O);


        // creates 3 by 3 board
        // first column
        ImageView imageView = new ImageView();
        imageView.setImage(blank);
        imageView.fitWidthProperty().bind(gameScene.widthProperty().divide(3));
        imageView.fitHeightProperty().bind(gameScene.heightProperty().divide(3));
        Group root = new Group(imageView);
        grid.add(root, 0, 0);


        ImageView imageView2 = new ImageView();
        imageView2.setImage(blank);
        imageView2.fitWidthProperty().bind(gameScene.widthProperty().divide(3));
        imageView2.fitHeightProperty().bind(gameScene.heightProperty().divide(3));
        Group root2 = new Group(imageView2);
        grid.add(root2, 0, 1);

        ImageView imageView3 = new ImageView();
        imageView3.setImage(blank);
        imageView3.fitWidthProperty().bind(gameScene.widthProperty().divide(3));
        imageView3.fitHeightProperty().bind(gameScene.heightProperty().divide(3));
        Group root3 = new Group(imageView3);
        grid.add(root3, 0, 2);


        //second column
        ImageView imageView4 = new ImageView();
        imageView4.setImage(blank);
        imageView4.fitWidthProperty().bind(gameScene.widthProperty().divide(3));
        imageView4.fitHeightProperty().bind(gameScene.heightProperty().divide(3));
        Group root4 = new Group(imageView4);
        grid.add(root4, 1, 0);


        ImageView imageView5 = new ImageView();
        imageView5.setImage(blank);
        imageView5.fitWidthProperty().bind(gameScene.widthProperty().divide(3));
        imageView5.fitHeightProperty().bind(gameScene.heightProperty().divide(3));
        Group root5 = new Group(imageView5);
        grid.add(root5, 1, 1);

        ImageView imageView6 = new ImageView();
        imageView6.setImage(blank);
        imageView6.fitWidthProperty().bind(gameScene.widthProperty().divide(3));
        imageView6.fitHeightProperty().bind(gameScene.heightProperty().divide(3));
        Group root6 = new Group(imageView6);
        grid.add(root6, 1, 2);


        //third column
        ImageView imageView7 = new ImageView();
        imageView7.setImage(blank);
        imageView7.fitWidthProperty().bind(gameScene.widthProperty().divide(3));
        imageView7.fitHeightProperty().bind(gameScene.heightProperty().divide(3));
        Group root7 = new Group(imageView7);
        grid.add(root7, 2, 0);


        ImageView imageView8 = new ImageView();
        imageView8.setImage(blank);
        imageView8.fitWidthProperty().bind(gameScene.widthProperty().divide(3.));
        imageView8.fitHeightProperty().bind(gameScene.heightProperty().divide(3.));
        Group root8 = new Group(imageView8);
        grid.add(root8, 2, 1);

        ImageView imageView9 = new ImageView();
        imageView9.setImage(blank);
        imageView9.fitWidthProperty().bind(gameScene.widthProperty().divide(3.));
        imageView9.fitHeightProperty().bind(gameScene.heightProperty().divide(3.));
        Group root9 = new Group(imageView9);
        grid.add(root9, 2, 2);


        // puts appropriate characters on squares clicked
        root.setOnMouseClicked(event->{
            if(event.getButton() == MouseButton.PRIMARY && gameWon == false){
                if(imageView.getImage() == blank){
                    if (turns == 0 || turns % 2 == 0){
                        imageView.setImage(xImage);
                        board[0][0] = 'x';
                    }else{
                        imageView.setImage(oImage);
                        board[0][0] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                    }

                }
        });

        root2.setOnMouseClicked(event->{
            if(event.getButton() == MouseButton.PRIMARY && gameWon == false) {
                if (imageView2.getImage() == blank) {
                    if (turns == 0 || turns % 2 == 0) {
                        imageView2.setImage(xImage);
                        board[0][1] = 'x';
                    }else {
                        imageView2.setImage(oImage);
                        board[0][1] = 'o';
                    }
                    checkWinStatus();
                    turns++;
                }
            }
        });

        root3.setOnMouseClicked(event->{
            if(event.getButton() == MouseButton.PRIMARY && gameWon == false){
                if(imageView3.getImage() == blank){
                    if (turns == 0 || turns % 2 == 0){
                        imageView3.setImage(xImage);
                        board[0][2] = 'x';
                    }else{
                        imageView3.setImage(oImage);
                        board[0][2] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                }
            }
        });

        root4.setOnMouseClicked(event->{
            if(imageView4.getImage() == blank && gameWon == false) {
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView4.setImage(xImage);
                        board[1][0] = 'x';
                    }else{
                        imageView4.setImage(oImage);
                        board[1][0] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                }
            }
        });

        root5.setOnMouseClicked(event->{
            if(imageView5.getImage() == blank && gameWon == false){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView5.setImage(xImage);
                        board[1][1] = 'x';
                    }else{
                        imageView5.setImage(oImage);
                        board[1][1] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                }
            }
        });

        root6.setOnMouseClicked(event->{
            if(imageView6.getImage() == blank && gameWon == false){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView6.setImage(xImage);
                        board[1][2] = 'x';
                    }else{
                        imageView6.setImage(oImage);
                        board[1][2] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                }
            }
        });

        root7.setOnMouseClicked(event->{
            if(imageView7.getImage() == blank && gameWon == false){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView7.setImage(xImage);
                        board[2][0] = 'x';
                    }else{
                        imageView7.setImage(oImage);
                        board[2][0] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                }
            }
        });

        root8.setOnMouseClicked(event->{
            if(imageView8.getImage() == blank && gameWon == false){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView8.setImage(xImage);
                        board[2][1] = 'x';
                    }else{
                        imageView8.setImage(oImage);
                        board[2][1] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                }
            }
        });

        root9.setOnMouseClicked(event->{
            if(imageView9.getImage() == blank && gameWon == false){
                if(event.getButton() == MouseButton.PRIMARY){
                    if (turns == 0 || turns % 2 == 0){
                        imageView9.setImage(xImage);
                        board[2][2] = 'x';
                    }else{
                        imageView9.setImage(oImage);
                        board[2][2] = 'o';
                    }
                    checkWinStatus();
                    turns ++;
                }
            }
        });

    }

    //returns scene
    public Scene returnScene(){
        return gameScene;
    }

    //returns scene
    public Boolean getWin(){
        return gameWon;
    }

    //checks if either player has gotten 3 characters in a row
    public static void checkWinStatus(){
        // x wins
        if(board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x'){
            gameWon = true;
        }else if(board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x'){
            gameWon = true;
        }else if(board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x'){
            gameWon = true;
        }else if(board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x'){
            gameWon = true;
        }else if(board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x'){
        gameWon = true;
        }else if(board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x'){
            gameWon = true;
        }else if(board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x'){
            gameWon = true;
        }else if(board[2][0] == 'x' && board[1][1] == 'x' && board[0][2] == 'x'){
            gameWon = true;
        }

        // o wins
        if(board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o'){
            gameWon = true;
        }else if(board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o'){
            gameWon = true;
        }else if(board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o'){
            gameWon = true;
        }else if(board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o'){
            gameWon = true;
        }else if(board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o'){
            gameWon = true;
        }else if(board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o'){
            gameWon = true;
        }else if(board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o'){
            gameWon = true;
        }else if(board[2][0] == 'o' && board[1][1] == 'o' && board[0][2] == 'o'){
            gameWon = true;
        }
    }
}



