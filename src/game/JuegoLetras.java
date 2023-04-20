
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
    switch (opcion){
            
            case 0:
                    seleccionado = ANIMALES[random.nextInt(ANIMALES.length)];    

                
                break;
                
            
            case 1:
                
                     seleccionado = FRUTAS[random.nextInt(FRUTAS.length)];
                
                break;
                
                
            case 2:
                
                     seleccionado = COLORES[random.nextInt(COLORES.length)];
                
                break;   
            
            case 3:
                
                    seleccionado = INSTRUMENTOS[random.nextInt(INSTRUMENTOS.length)];
                
                break;
            
             
            default:
                return new String[]{};
           
        }
    
    
    int vocalIndex = -1;
    while (vocalIndex == -1) { // buscar una vocal aleatoria que no haya sido eliminada
        vocalIndex = random.nextInt(seleccionado.length()); // seleccionar índice de vocal aleatorio
        char vocal = seleccionado.charAt(vocalIndex);
        if (esVocal(vocal)) { // si la letra seleccionada es una vocal, eliminarla
            seleccionado = seleccionado.substring(0, vocalIndex)+ "_"  + seleccionado.substring(vocalIndex + 1);
            vocalIncompleta = vocal; // guardar vocal eliminada
        } else {
            vocalIndex = -1; // si no es vocal, seguir buscando
        }
    }
        return null;
        
       
}