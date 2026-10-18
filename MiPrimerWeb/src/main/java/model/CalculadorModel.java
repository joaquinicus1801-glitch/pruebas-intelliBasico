package model;

public class CalculadorModel {
    public int num1;
    public int num2;
    public CalculadorModel(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;

    }
    public int sumar(){

        return num1+num2;
    }

}
