package com.example.carrinhodefrutajava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
public static class main{

    public static void main(String[] args){
        //Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
        //da entrada dos 5 itens, exiba a lista completa. Exemplo:
        //Insira a sua lista de compras:
        //banana, maçã, abacaxi, melão, mamão



          String[]frutas = {"banana", "maca", "abacaxi", "melao", "mamao"};
             for (int i = 0; i< frutas.length;i++)
                 System.out.print(frutas[i]+" ");


    }



    }

}