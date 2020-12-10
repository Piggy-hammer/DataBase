package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class House {
    String huXing;
    int rent;
    String Pic;
    public House(String huXing,int rent,String Pic){
        this.huXing = huXing;
        this.rent = rent;
        this.Pic = Pic;
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
        return pane;
    }
}
