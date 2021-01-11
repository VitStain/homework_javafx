package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;

    @FXML
    private TextArea textArea;


    private final ObservableList<String> wordList = FXCollections.observableArrayList("Диана",
            "Василиса", "Милана", "Любава");

    @FXML
    void initialize() {
        listView.setItems(wordList);
        textArea.setEditable(false);
    }

    @FXML
    void sendMessage() {
        String message = inputField.getText().trim();
        if (message.length() != 0) {
            addMessageTextArea(message);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Ошибка ввода сообщения");
            alert.setContentText("Нельзя отправлять пустое сообщение");
            alert.show();
        }
        inputField.clear();
    }

    private void addMessageTextArea(String message) {
        textArea.appendText(message + "\n");

    }

    @FXML
    void showAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Homework lesson 4");
        alert.setContentText("I love JavaFX!");
        alert.show();

    }

    @FXML
    void exit() {
        System.exit(0);
    }
}
