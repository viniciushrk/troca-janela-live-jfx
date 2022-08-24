package com.example.trocajanelalive;

import java.util.function.Function;

public class Janela2Controller {

    Function<String,Void> callBack;
    public void janela1(){
        if(callBack != null){
            callBack.apply("\n tabela");
        }
    }

    public void janela2(){
        if(callBack != null){
            callBack.apply("olaMundo");
        }
    }
}
