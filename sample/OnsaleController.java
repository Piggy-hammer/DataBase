package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class OnsaleController {
    public OnsaleController(){
    }
    public void init (SplitPane splitPane) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/onsale.fxml"));
        System.out.println(loader.getLocation());
        AnchorPane anchorPane = loader.load();
        splitPane.getItems().set(1,anchorPane);
    }
}
