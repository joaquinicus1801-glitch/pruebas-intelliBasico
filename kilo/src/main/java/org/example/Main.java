package org.example;

import com.google.gson.Gson; //importamos para poder convertir objeto java a json
public class Main {
    public static void main(String[] args){
         Persona persona1 = new Persona("Carlos", 22);
        Gson gson = new Gson(); //con esto creamos un objeto Gson
        String json = gson.toJson(persona1); //usamos creamos una variable
        //string llamada json, el objeto gson llamamos la metodo toJson con
        //parametro persona 1
        System.out.println(json);

    }
}
