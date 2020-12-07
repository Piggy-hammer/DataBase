package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private Stage stage;
    private Manager manager;

    public void init(Stage stageIn, Manager managerIn, int authority) throws IOException {
        stage = stageIn;
        manager = managerIn;
        FXMLLoader loader;
        if (authority == 2) {
             loader = new FXMLLoader((Main.class.getResource("/manager.fxml")));

        }else {
             loader = new FXMLLoader((Main.class.getResource("/guest.fxml")));

        }
        SplitPane splitPane = loader.load();
        Scene sceneMain = new Scene(splitPane);
        stage.setScene(sceneMain);
        stage.centerOnScreen();
    }
}
