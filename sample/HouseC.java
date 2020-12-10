package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HouseC {
    @FXML
    Label Rent;
    @FXML
    Label Loc;
    @FXML
    ImageView Image;
    @FXML
    javafx.scene.control.Button Button;
    House house;
    AnchorPane pane;
    static FXMLLoader loader = new FXMLLoader(Main.class.getResource("/house.fxml"));

    public HouseC(House house) throws IOException {
            System.out.println(loader.getLocation().toString());
            this.pane = loader.load();
    }
    public AnchorPane a (){
        return pane;
    }

}
