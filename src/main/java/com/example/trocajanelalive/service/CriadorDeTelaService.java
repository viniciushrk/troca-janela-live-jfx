package com.example.trocajanelalive.service;

import com.example.trocajanelalive.PrincipalController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;

public class CriadorDeTelaService {
    private String nomeTela;
    public CriadorDeTelaService(String nomeTela){
        this.nomeTela = nomeTela;
    }

    public Node gerarTela(){
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalController.class.getResource(this.nomeTela + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
