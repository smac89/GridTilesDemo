package demo;

import eu.hansolo.tilesfx.Tile;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ResourceBundle;

/**
 * Created by smac89 on 05/03/17.
 */

public class GridTilesDemoPresenter {

    @FXML // fx:id="mRoot"
    private GridPane mRoot; // Value injected by FXMLLoader

    @FXML // fx:id="mFish1View"
    private Tile mFish1View; // Value injected by FXMLLoader

    @FXML // fx:id="mFish2View"
    private Tile mFish2View; // Value injected by FXMLLoader

    @FXML // fx:id="mFish3View"
    private Tile mFish3View; // Value injected by FXMLLoader

    @FXML // fx:id="mFishGroupView"
    private Tile mFishGroupView; // Value injected by FXMLLoader

    @FXML
    private ResourceBundle resources;

    public void initialize() {
        setImageTile(mFish1View, "/fish1.png");
        setImageTile(mFish2View, "/fish2.png");
        setImageTile(mFish3View, "/fish3.png");
        setImageTile(mFishGroupView, "/fishgroup.jpg");
    }

    private void setImageTile(Tile tile, String imgPath) {
        ImageView view = new ImageView(getClass().getResource(imgPath).toExternalForm());
        view.setPreserveRatio(true);
        view.setFitHeight(200);
        view.setFitWidth(340);
        tile.setGraphic(view);
        tile.prefWidthProperty().bind(view.fitWidthProperty());
        tile.prefHeightProperty().bind(view.fitHeightProperty());
        tile.setBackgroundColor(Color.web("#2196F3"));
        tile.setTitleColor(Color.WHITE);
    }
}
