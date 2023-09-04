import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeGameJavaFX extends Application {
    private static final int TILE_SIZE = 20;
    private static final int BOARD_WIDTH = 30;
    private static final int BOARD_HEIGHT = 30;
    private List<java.awt.Rectangle> snakeBody = new ArrayList<>();
    private int foodX, foodY;
    private int snakeX = 5, snakeY = 5;
    private int velocityX = 0, velocityY = 0;
    private boolean gameOver = false;
    private int score = 0;
    private void updateFoodPosition() {
        Random rand = new Random();
        foodX = rand.nextInt(BOARD_WIDTH);
        foodY = rand.nextInt(BOARD_HEIGHT);
    }

    private void handleGameOver() {
        gameOver = true;
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText(null);
        alert.setContentText("Game Over! Your score: " + score);
        alert.showAndWait();
        resetGame();
    }

    private void resetGame() {
        snakeBody.clear();
        snakeX = 5;
        snakeY = 5;
        velocityX = 0;
        velocityY = 0;
        score = 0;
        gameOver = false;
        updateFoodPosition();
    }

    private void initGame() {
        if (gameOver) {
            handleGameOver();
            return;
        }

        if (snakeX == foodX && snakeY == foodY) {
            updateFoodPosition();
            score++;
        }

        snakeX += velocityX;
        snakeY += velocityY;

        if (snakeX < 0 || snakeX >= BOARD_WIDTH || snakeY < 0 || snakeY >= BOARD_HEIGHT) {
            handleGameOver();
            return;
        }

        for (init i = snakeBody.size() - 1; i >= 1; i--) {
            snakeBody.get(i).setX(snakeBody.get(i - 1).getX());
            snakeBody.get(i).setY(snakeBody.get(i - 1).getY());
        }
        ((Rectangle) snakeBody.get(0)).setX(snakeX * TILE_SIZE);
        ((Rectangle) snakeBody.get(0)).setY(snakeY * TILE_SIZE);

        for (int i = 1; i < snakeBody.size(); i++) {
            if (snakeBody.get(0).getX() == snakeBody.get(i).getX() && snakeBody.get(0).getY() == snakeBody.get(i).getY()) {
                handleGameOver();
                return;
            }
        }
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, BOARD_WIDTH * TILE_SIZE, BOARD_HEIGHT * TILE_SIZE);
        primaryStage.setTitle("Snake Game JavaFX");
        primaryStage.setScene(scene);

        Rectangle food = new Rectangle(TILE_SIZE, TILE_SIZE, Color.RED);
        foodX = 10;
        foodY = 10;
        food.relocate(foodX * TILE_SIZE, foodY * TILE_SIZE);
        root.getChildren().add(food);

        for (int i = 0; i < 3; i++) {
            Rectangle segment = new Rectangle(TILE_SIZE, TILE_SIZE, java.awt.Color.GREEN);
            snakeBody.add(segment);
            root.getChildren().add(segment);
        }

        Timeline timeline = new Timeline(new KeyFrame(java.time.Duration.millis(100), e -> {
            initGame();
            if (!gameOver) {
                food.relocate(foodX * TILE_SIZE, foodY * TILE_SIZE);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        scene.setOnKeyPressed(event -> {
            KeyCode key = event.getCode();
            if (key == KeyCode.UP && velocityY != 1) {
                velocityX = 0;
                velocityY = -1;
            } else if (key == KeyCode.DOWN && velocityY != -1) {
                velocityX = 0;
                velocityY = 1;
            } else if (key == KeyCode.LEFT && velocityX != 1) {
                velocityX = -1;
                velocityY = 0;
            } else if (key == KeyCode.RIGHT && velocityX != -1) {
                velocityX = 1;
                velocityY = 0;
            }
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}