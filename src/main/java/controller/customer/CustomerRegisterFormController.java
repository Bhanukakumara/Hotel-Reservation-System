package controller.customer;

import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRegisterFormController {

    @FXML
    private TextField txtLoyaityPoints;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String SQL = "INSERT INTO customers (name,contact_details,loyalty_points) VALUES(?,?,?)";
        Customer customer = new Customer(
                txtName.getText(),
                txtPhoneNumber.getText(),
                Double.parseDouble(txtLoyaityPoints.getText())
        );
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getPhoneNumber());
            preparedStatement.setDouble(3,customer.getLotailtyPoint());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {

    }

}
