/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoo.ticket;

import com.zoo.ticket.config.AbstractJavaFxApplicationSupport;
import static javafx.application.Application.launch;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author HEMACHANDRA
 */
@SpringBootApplication
@SuppressWarnings("restriction")
public class LoginRun extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launchApp(LoginRun.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        notifyPreloader(new Preloader.StateChangeNotification(Preloader.StateChangeNotification.Type.BEFORE_START));

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginFXML.fxml"));

        stage.setTitle("Welcome : Zoo Ticketing System");
        stage.setScene(new Scene(root, 400, 500));
        stage.show();
    }
}
