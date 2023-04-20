
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
private String seleccionado;
    private char vocalIncompleta;
    public String user;
    private Component frame;
    
    public void jugar() {
    System.out.println("¡Mini_1!");
    
    String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, porfavor");
    user=Nombre_usuario;
    System.out.println("Hola "+ Nombre_usuario);
    
    System.out.println("Tu reto es completar la pablabra *-* ");
    Scanner scanner = new Scanner(System.in);
    boolean continuarJugando = true;
    
    while (continuarJugando) {
        seleccionarPalabra();
        mostrarPalabraIncompleta();
        solicitarVocal();
        

        System.out.print("¿Quieres seguir jugando? (s/n) ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("n")) {
            continuarJugando = false;
        }
    }
     mostrarResultados();       
}

    private String[] seleccionarPalabra() {
    Random random = new Random();
    //Scanner tematica = new Scanner(System.in);
    String[] themes = {"ANIMALES", "FRUTAS", "COLORES", "INSTRUMENTOS"};
    int opcion = JOptionPane.showOptionDialog(frame,"Seleccione una temática:",
                "Seleccionar temática",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                themes,
                themes[0]);    
    }