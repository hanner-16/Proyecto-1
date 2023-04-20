
package game;

import java.awt.Component;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;

public class JuegoLetras {
    
    private int intentos = 0;
    private int aciertos = 0;
    private int fallos = 0;


    private static final String[] ANIMALES = {"Perro", "Gato", "Mono", "Tigre", "Leon",
        "Tortuga", "Caballo", "Serpiente"};
    private static final String[] FRUTAS = {"Manzana", "Naranja", "Pera", "Banano", "Mango",
        "uva", "Melocoton", "Sandia", "Fresa"};
    private static final String[] COLORES = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja",
        "Morado", "Rosa", "Blanco", "Negro"};    
    private static final String[] INSTRUMENTOS = {"Guitarra", "Piano", "Batería", "Saxofon",
        "Violin", "Trompeta", "Flauta", "Bajo", "arpa"};

    private static final char[] VOCALES = {'a', 'e', 'i', 'o', 'u'};

}