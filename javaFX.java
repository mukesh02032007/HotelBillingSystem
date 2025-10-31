package Miniproject;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class HotelBillingFx extends Application {
    @Override
    public void start(Stage primaryStage) {
        // --- Input Fields ---
        TextField nameField = new TextField();
        TextField phoneField = new TextField();
        TextField daysField = new TextField();
        ComboBox<String> roomBox = new ComboBox<>();
        roomBox.getItems().addAll("Standard", "Deluxe", "Suite");
        roomBox.setValue("Standard");
        CheckBox foodBox = new CheckBox("Food Service (₹500)");
        CheckBox laundryBox = new CheckBox("Laundry (₹300)");
        CheckBox wifiBox = new CheckBox("WiFi (₹200)");
        Button billButton = new Button("Generate Bill");
        TextArea billArea = new TextArea();
        billArea.setEditable(false);
        billArea.setPrefHeight(250);
        // --- Layout ---
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.getChildren().addAll(
            new Label("Customer Name:"), nameField,
            new Label("Phone Number:"), phoneField,
            new Label("Days of Stay:"), daysField,
            new Label("Room Type:"), roomBox,
            new Label("Additional Services:"),
            foodBox, laundryBox, wifiBox,
            billButton, billArea
        );
        // --- Button Action ---
        billButton.setOnAction(e -> {
            try {
                String name = nameField.getText();
                String phone = phoneField.getText();
                int days = Integer.parseInt(daysField.getText());
                String roomType = roomBox.getValue();
                Room room;
                switch(roomType) {
                    case "Deluxe": room = new DeluxeRoom(); break;
                    case "Suite": room = new SuiteRoom(); break;
                    default: room = new StandardRoom();
                }
                Services services = new Services(
                    foodBox.isSelected(),
                    laundryBox.isSelected(),
                    wifiBox.isSelected()
                );
                Customer customer = new Customer(name, 0, days, room, services);
                double total = customer.generateBill();
                String billText = "------ Hotel Bill ------\n"
                        + "Customer: " + name + "\n"
                        + "Phone: " + phone + "\n"
                        + "Room Type: " + room.getRoomType() + "\n"
                        + "Days Stayed: " + days + "\n"
                        + "Room Charges: ₹" + room.calculateCharge(days) + "\n"
                        + "Service Charges: ₹" + services.totalServiceCost() + "\n"
                        + "Total Bill: ₹" + total + "\n"
                        + "------------------------";
                billArea.setText(billText);
            } catch (NumberFormatException ex) {
                billArea.setText("Error: Please enter valid number for Days.");
            } catch (Exception ex) {
                billArea.setText("Error: " + ex.getMessage());
            }
        });
        // --- Stage Setup ---
        Scene scene = new Scene(root, 400, 550);
        primaryStage.setTitle("Hotel Billing and Checkout System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

