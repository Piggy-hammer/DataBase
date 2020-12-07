package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Manager manager;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("登录界面");
        FXMLLoader loader = new FXMLLoader((Main.class.getResource("/log.fxml")));
        System.out.println((Main.class.getResource("/log.fxml")));
        AnchorPane Loglayout = loader.load();
        Scene scenelog = new Scene(Loglayout);
        primaryStage.setScene(scenelog);
        LogController logController = loader.getController();
        Manager manager = new Manager();
        manager.init();
        logController.init(primaryStage,manager);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
