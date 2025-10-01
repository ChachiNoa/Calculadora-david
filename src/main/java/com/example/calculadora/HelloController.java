package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelloController {
    double num1, num2, result;
    String text1="";
    String text2="";
    String textTotal="";
    int op=-1;

    @FXML
    private TextArea pantalla;

    public void asignaciones(String num){
        if (op==-1){
            text1=text1+num;
            textTotal=text1;
        }else{
            text2=text2+num;
        }
        pantalla.setText(textTotal+text2);
    }
    @FXML
    public void Boton0() { asignaciones("0");}

    @FXML
    public void Boton1() { asignaciones("1");}

    @FXML
    public void Boton2() {asignaciones("2");}

    @FXML
    public void Boton3() {asignaciones("3");}

    @FXML
    public void Boton4() { asignaciones("4");}

    @FXML
    public void Boton5() { asignaciones("5");}

    @FXML
    public void Boton6() { asignaciones ("6");}

    @FXML
    public void Boton7() { asignaciones ("7");}

    @FXML
    public void Boton8() { asignaciones ("8");}

    @FXML
    public void Boton9() { asignaciones ("9");}

    @FXML
    public void BotonComa() {
        if (op==-1 && !text1.isEmpty() && !text1.contains(".")){
            text1=text1+".";
            textTotal=text1;
        }else if (!text2.isEmpty()&& !text2.contains(".")){
            text2=text2+".";
        }
        pantalla.setText(textTotal+text2);
    }

    @FXML
    public void BotonSuma() {
        if(!text1.isEmpty() && op==-1){
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" + ";
            op=1;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonResta() {
        if(!text1.isEmpty() && op==-1) {
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" - ";
            op=2;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonMulti() {
        if(!text1.isEmpty() && op==-1) {
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" x ";
            op=3;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonDivi() {
        if(!text1.isEmpty() && op==-1) {
            num1=Double.parseDouble(text1);
            textTotal=textTotal+" / ";
            op=4;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonResto() {
        if(!text1.isEmpty() && op==-1) {
            num1 = Double.parseDouble(text1);
            textTotal = textTotal + " % ";
            op = 5;
            pantalla.setText(textTotal);
        }
    }

    @FXML
    public void BotonBorra() {
        if (!text2.isEmpty()) {
            text2 = text2.substring(0, text2.length() - 1);
        } else if (op != -1) {
            textTotal = text1;
            op = -1;
        } else if (!text1.isEmpty()) {
            text1 = text1.substring(0, text1.length() - 1);
            textTotal = text1;
        }
        pantalla.setText(textTotal + text2);
    }

    @FXML
    public void BotonBorrarTodo() {
        num1=0;
        num2=0;
        op=-1;
        result=0;
        textTotal="";
        text1="";
        text2="";
        pantalla.setText(textTotal);
    }

    @FXML
    public void BotonIgual() {
        if(!text2.isEmpty()){
            num2 = Double.parseDouble(text2);
            switch (op){
                case 1 -> {
                    result=num1+num2;
                    esEnter();
                }
                case 2 -> {
                    result=num1-num2;
                    esEnter();
                }
                case 3 -> {
                    result=num1*num2;
                    esEnter();
                }
                case 4 -> {
                    if (num2!=0) {
                        result = num1 / num2;
                        esEnter();
                    }else {
                        textTotal = "No se puede dividir entre 0";
                        pantalla.setText(textTotal);
                        num1=0;
                        num2=0;
                        op=-1;
                        result=0;
                        text2="";
                        text1="";
                    }
                }
                case 5 -> {
                    result=num1%num2;
                    esEnter();
                }
            }
        }
    }
    public void esEnter(){
        if (result%1==0)
            textTotal=String.valueOf((int)result);
        else
            textTotal=String.valueOf(result);
        pantalla.setText(textTotal);
        text1=String.valueOf(result);
        num2=0;
        op=-1;
        result=0;
        text2="";
    }
}
