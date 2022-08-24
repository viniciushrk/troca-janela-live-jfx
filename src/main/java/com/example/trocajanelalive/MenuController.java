package com.example.trocajanelalive;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;
import java.util.function.Function;

public class MenuController {

    Function<String,Void> callBack;
    public void janela1() throws IOException {
        if(callBack != null){
            callBack.apply("inicio");
        }
    }

    public void janela2(){
        if(callBack != null){
            callBack.apply("janela2");
        }
    }
}
