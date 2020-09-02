/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.Componentes;
import udemy.poo.codigo.TiroParabolico;

/**
 *
 * @author luisangelcuriel
 */
public class Inicio {
    public static void main(String[] args) {
        String datoUno = JOptionPane.showInputDialog(null, "Dame la velocidad inicial: ");
        float numUno = Float.parseFloat(datoUno);
        String datoDos = JOptionPane.showInputDialog(null, "Dame el grado: ");
        int numDos = Integer.parseInt(datoDos);
        
        TiroParabolico objetoUno = new TiroParabolico(numUno, numDos);
        
        JOptionPane.showMessageDialog(null, "La altura máxima es: " + objetoUno.alturaMaxima() + "\n" 
                + "El alcance es: " + objetoUno.alcance(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
        // Cálculo de componentes
        String datoTres = JOptionPane.showInputDialog(null, "Dame el tiempo: ");
        int numTres = Integer.parseInt(datoTres);
        String y = null;
        
        Componentes[] datos = objetoUno.calculoComponentes(numTres);
        
        for (Componentes objeto : datos) {
            y += objeto.getTiempo() + " ; " + objeto.getX() + " ; " + objeto.getY() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, y, "Componentes", JOptionPane.INFORMATION_MESSAGE);
    }
}
