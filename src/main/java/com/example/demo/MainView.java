package com.example.demo;

import com.example.demo.client.BackendClient;
import com.example.demo.domain.TransactionHistory;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.Getter;


@Route("")
@Getter
@PageTitle("First-Bank-Application")
public class MainView extends VerticalLayout {

    BackendClient backendClient;
    TextField balanceTextField = new TextField();
    TextField amountToSend = new TextField();
    Button transactionButton = new Button();
    TextField destination = new TextField();
    H2 header = new H2("Welcome customer");
    HorizontalLayout layout = new HorizontalLayout(header);
    HorizontalLayout layout1 = new HorizontalLayout (balanceTextField, amountToSend, destination,transactionButton);
    Grid<TransactionHistory> grid = new Grid<>(TransactionHistory.class);

    TextField bitcoin = new TextField();
    TextField sek = new TextField();
    TextField pln = new TextField();
    TextField dol = new TextField();
    HorizontalLayout layout2 = new HorizontalLayout(bitcoin,sek,pln,dol);

    Dialog dialog = new Dialog();
    PasswordField passwordField = new PasswordField();


    public MainView(BackendClient backendClient) {
        this.backendClient = backendClient;
        layout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        layout.setWidth("100%");
        add(layout);

        layout1.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        layout1.setWidth("100%");
        add(layout1);
        transactionButton.setText("Finish Transaction");
        transactionButton.getElement().getStyle().set("margin","37px 0px 0px 18px");
        balanceTextField.setLabel("Your Balance:");
        balanceTextField.setReadOnly(true);
        amountToSend.setLabel("Set Amount");
        destination.setLabel("Recipient");

        add(grid);
        grid.setColumns("to", "value", "date");

        bitcoin.setLabel("Bitcoin");
        bitcoin.setReadOnly(true);
        //bitcoin.setValue(event-> backendClient.getBitcoinValue());
        sek.setLabel("SEK");
        sek.setReadOnly(true);
        pln.setLabel("PLN");
        pln.setReadOnly(true);
        dol.setLabel("USD");
        dol.setReadOnly(true);

        add(layout2);
        layout2.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        layout2.setWidth("100%");

        transactionButton.addClickListener(event -> backendClient.makeTransfer());
        //balanceTextField.setValue(event -> backendClient.getBalance());
        passwordField.setLabel("password");
        dialog.add(new Text("osdjnfaof"));

    }
}
