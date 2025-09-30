package com.example.calculadora;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    double num1, num2, result;
    String text1="";
    String text2="";
    String textTotal="";
    int op=-1;
    boolean siguiente = false;
    @FXML
    private Button bt3;
    @FXML
    private Button btResto;
    @FXML
    private Button bt2;
    @FXML
    private Button bt5;
    @FXML
    private Button bt4;
    @FXML
    private Button bt7;
    @FXML
    private Button bt6;
    @FXML
    private Button bt9;
    @FXML
    private Button btBorrar;
    @FXML
    private Button bt8;
    @FXML
    private Button btBorrarTodo;
    @FXML
    private Button btSuma;
    @FXML
    private Button btMulti;
    @FXML
    private Button btComa;
    @FXML
    private Button btResta;
    @FXML
    private Button btDivi;
    @FXML
    private Button btIgual;
    @FXML
    private Button bt1;
    @FXML
    private Button bt0;
    @FXML
    private TextArea pantalla;

    @FXML
    public void Boton8(Event event) {
        if (op==-1){
            textTotal=text1+"8";
            text1=text1+"8";
        }else{
            text2=text2+"8";
        }
        pantalla.setText(text1+text2);
    }

    @FXML
    public void Boton9(Event event) {
        if (op==-1){
            textTotal=text1+"9";
            text1=text1+"9";
        }else{
            text2=text2+"9";
        }
        pantalla.setText(text1+text2);
    }

    @FXML
    public void Boton6(Event event) {
        if (op==-1){
            textTotal=text1+"6";
            text1=text1+"6";
        }else{
            text2=text2+"6";
        }
        pantalla.setText(text1+text2);
    }

    @FXML
    public void Boton7(Event event) {
        if (op==-1){
            textTotal=text1+"7";
            text1=text1+7;
        }else{
            text2=text2+7;
        }
        pantalla.setText(text1+text2);
    }

    @FXML
    public void BotonSuma(Event event) {
        if(!text1.isEmpty()){
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" + ";
            op=1;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonBorrarTodo(Event event) {
        num1=0;
        num2=0;
        result=0;
        op=-1;
        textTotal="";
        text1="";
        text2="";
        pantalla.setText(textTotal);
    }

    @FXML
    public void BotonResto(Event event) {
        if(!text1.isEmpty()) {
            num1 = Double.parseDouble(text1);
            textTotal = textTotal + " % ";
            op = 5;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonDivi(Event event) {
        if(!text1.isEmpty()){
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" / ";
            op=4;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonBorra(Event event) {
        //poner un if texto 2 y despues texto total.
        if (!textTotal.isEmpty()) {
            textTotal = textTotal.substring(0, textTotal.length() - 1);
            if(op!=-1) {
                if (text2.length() <= 1) {
                    text2 = "";
                    op = -1;
                } else
                    text2 = text2.substring(0, text2.length() - 1);
            }else{
                if(text1.length() == 1) {
                    text1 = "";
                }else {
                    text1 = text1.substring(0, text1.length() - 1);
                }
            }
            pantalla.setText(text1+text2);
        }
    }

    @FXML
    public void BotonMulti(Event event) {
        if(!text1.isEmpty()){
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" x ";
            op=3;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonComa(Event event) {

    }

    @FXML
    public void Boton0(Event event) {

    }

    @FXML
    public void BotonResta(Event event) {
        if(!text1.isEmpty()){
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" - ";
            op=2;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void Boton1(Event event) {

    }

    @FXML
    public void Boton4(Event event) {
    }

    @FXML
    public void BotonIgual(Event event) {
        if(!text2.isEmpty()){
            num2=Double.parseDouble(text2);
            result=num1+num2;
            pantalla.setText(String.valueOf(result));
        }
    }

    @FXML
    public void Boton5(Event event) {
    }

    @FXML
    public void Boton2(Event event) {
    }

    @FXML
    public void Boton3(Event event) {
    }
}
