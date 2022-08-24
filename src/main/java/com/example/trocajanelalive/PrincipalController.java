package com.example.trocajanelalive;

import com.example.trocajanelalive.service.CriadorDeTelaService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.io.IOException;

public class PrincipalController {
    @FXML
    private FlowPane menu;
    @FXML
    private FlowPane conteudo;
    FXMLLoader fxmlLoader = new FXMLLoader(PrincipalController.class.getResource("menu.fxml"));
    public Void trocarJanela(String nomeTela) {
        try {
            Node principal = new CriadorDeTelaService(nomeTela).gerarTela();

            conteudo.getChildren().removeAll(conteudo.getChildren());
            conteudo.getChildren().add(principal);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @FXML
    private void initialize() throws IOException {
        try{
            Node menuCarregado = fxmlLoader.load();
            menu.getChildren().add(menuCarregado);
            Object variavelMenuControle = fxmlLoader.getController();
            if(variavelMenuControle instanceof MenuController) {
                ((MenuController) variavelMenuControle).callBack = this::trocarJanela;
            }
        }catch (Exception t){
            t.printStackTrace();
        }

    }

}