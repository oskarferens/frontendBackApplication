package com.example.demo;

import com.example.demo.client.BackendClient;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.Getter;

import java.awt.*;

@Route("")
@Getter
@PageTitle("First-Bank-Application")
public class MainView extends VerticalLayout {

    BackendClient backendClient;
    TextField welcomeCustomer = new TextField();
    TextField labelField1 = new TextField();
    TextField labelField2 = new TextField();
    TextField labelField3 = new TextField();
    Button transactionButton = new Button();
    HorizontalLayout layout1 = new HorizontalLayout (labelField1,labelField2,labelField3);
    H2 header = new H2("Welcome " + backendClient.getCustomerByName("Marek"));

    public MainView(BackendClient backendClient) {
        this.backendClient = backendClient;

        add(welcomeCustomer);
        add(labelField1);
        add(labelField2);
        add(labelField3);
        //Button transactionButton = new Button("ALL OPERATIONS", event -> {})
        add(welcomeCustomer);
        add(welcomeCustomer);


        /*welcomeCustomer.setLabel("Welcome ");
        welcomeCustomer.setValue(backendClient.getCustomerByName("Marek"));
        add(welcomeCustomer);
        welcomeCustomer.setReadOnly(true);*/
        //labelField1.setLabel("");
        //add(labelField1);
        //add(layout1); // po lini 21 trzeba dodac do konstruktora
        //labelField.setValue(new BigDecimal(0));
    }
}
/*
    public MainView(BackendClient backendClient) {
        this.backendClient = backendClient;
        labelField.setLabel("stan konta");
        //add(labelField);
        labelField.setReadOnly(true);
        labelField.setValue(backendClient.getCustomerByName("Marek"));

        labelField1.setLabel("label");
        //add(labelField1);
        add(layout1);
    }
}
*/
