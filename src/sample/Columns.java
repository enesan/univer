package sample;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Columns {

    private int taWidth = 120;
    private int taHeight = 200;
    private int taY = 20;
    private int showArrayY = taWidth + taY + 10;
    private int comparesY = showArrayY + 20;
    private Label initName = new Label();
    private Label compares = new Label("com. =  ");
    private Label swaps = new Label("sw. =  ");
    private Label seconds = new Label("sec. =  ");
    private TextArea textArea = new TextArea();
    private Button showArray = new Button("Show array");

    public Columns(String name) {
        initName.setText(name + " sort:");
        textArea.setPrefSize(taWidth, taHeight);
        textArea.setLayoutY(taY);
        showArray.setLayoutY(showArrayY);
        compares.setLayoutY(comparesY);
        swaps.setLayoutY(comparesY + 15);
        seconds.setLayoutY(swaps.getLayoutY() + 15);
    }

    public Group column() {
        return new Group(initName, textArea, showArray, compares, swaps, seconds);
    }

    public int getTaWidth() {
        return taWidth;
    }
    public void setTaWidth(int taWidth) {
        this.taWidth = taWidth;
    }
    public Label getCompares() {
        return compares;
    }
    public void setCompares(Label compares) {
        this.compares = compares;
    }
    public Label getSwaps() {
        return swaps;
    }
    public void setSwaps(Label swaps) {
        this.swaps = swaps;
    }
    public Label getSeconds() {
        return seconds;
    }
    public void setSeconds(Label seconds) {
        this.seconds = seconds;
    }
}
