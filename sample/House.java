package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


import java.io.IOException;

public class House {

    @FXML
    Label Rent;
    @FXML
    Label Loc;
    @FXML
    ImageView Image;
    @FXML
    Button Button;

    String huXing;
    int rent;
    String Pic;
    String Loca;

    public House(String huXing,int rent,String Pic,String Loc){
        this.huXing = huXing;
        this.rent = rent;
        this.Pic = Pic;
        this.Loca = Loc;
    }

    public String getHuXing() {
        return huXing;
    }

    public String getPic() {
        return Pic;
    }

    public int getRent() {
        return rent;
    }

    public AnchorPane getHouse() throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/house.fxml"));
        AnchorPane pane = loader.load();
        Rent.setText(rent + "");
        Loc.setText(Loca);
        Image.setImage(new Image(Pic));
        return pane;
    }
}
