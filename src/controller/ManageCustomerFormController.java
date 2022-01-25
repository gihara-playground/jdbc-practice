package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class ManageCustomerFormController {

    public Button btnNewCustomer;
    public TextField txtId;
    public TextField txtFirstName;
    public TextField txtLastName;
    public DatePicker txtDob;
    public TextField txtPicture;
    public Button btnBrowse;
    public TextField txtTelephone;
    public Button btnAdd;
    public ListView<?> lstTelephone;
    public Button btnRemove;
    public Button btnSaveCustomer;
    public TableView<?> tblCustomers;

    public void initialize()throws IOException {
        btnAdd.setDisable(true);
        btnRemove.setDisable(true);

//        txtTelephone.textProperty().addListener((observable, oldValue, newValue) -> {
//            btnAdd.setDisable(!txtTelephone.getText().matches("\\d{3}-\\d{7}"));
//        });
        txtTelephone.textProperty().addListener((observable, oldValue, newValue) ->
                btnAdd.setDisable(!newValue.trim().matches("\\d{3}-\\d{7}"))
        );

    }

    @FXML
    void btnAdd_OnAction(ActionEvent event) {

    }


    @FXML
    void btnBrowse_OnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Images","*.jpeg", "*.jpg", "*.gif", "*.png", "*.bmp"));
        File file = fileChooser.showOpenDialog(btnBrowse.getScene().getWindow());
        txtPicture.setText(file != null ? file.getAbsolutePath() : "");
    }

    @FXML
    void btnNewCustomer_OnAction(ActionEvent event) {

    }

    @FXML
    void btnRemove_OnAction(ActionEvent event) {

    }



    @FXML
    void btnSaveCustomer_OnAction(ActionEvent event) {

    }


    @FXML
    void txtTelephone_OnAction(ActionEvent event) {

    }

}


