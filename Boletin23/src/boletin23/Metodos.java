/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
class Metodos {

    public int pedirNumeroPersonas() throws Exception_Definida {
        int edades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de personas:"));
        if (edades > 50 || edades < 0) {
            throw new Exception_Definida("Número fuera de los límites");
        }
        return edades;
    }
}
