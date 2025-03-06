package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Customer;

public class CustomerRegisterFormController {

    @FXML
    private TextField txtLoyaityPoints;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String name = txtName.getText();
        String phoneNumber = txtPhoneNumber.getText();
        Double lotailtyPoint = Double.parseDouble(txtLoyaityPoints.getText());
        Customer customer = new Customer(name, phoneNumber, lotailtyPoint);
    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {

    }

}
