package com.generation;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Perro lomito = new Perro();
    lomito.nombre ="Cheems";
    lomito.edad = 1;
    lomito.raza = "mestizo";
    lomito.tamanio = "wrande";
    lomito.caracteristicas();
    lomito.comer();

    Perro lomito2 = new Perro();
    lomito2.nombre = "Firulais";
    lomito2.edad = 2;
    lomito2.raza = "pug";
    lomito2.tamanio = "chico";
    lomito2.caracteristicas();
    lomito2.dormir();

    Perro lomito3 = new Perro("Milaneso");
    Perro lomito4= new Perro("Sr kawamura", "Husky", 4, "Grande");
    lomito4.caracteristicas();
    }
}
