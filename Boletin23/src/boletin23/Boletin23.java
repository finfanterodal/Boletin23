package boletin23;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        int numPersoas = 0;
        double total = 0;
        try {
            numPersoas = obx.pedirNumeroPersonas();
        } catch (Exception_Definida ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Queue<Integer> idades = new LinkedList<>();
        for (int i = 0; i < numPersoas; i++) {
            int random = (int) (Math.random() * 56 + 5);
            if (random <= 10) {
                total = total + 1;
            } else if (random <= 17) {
                total = total + 2.5;
            } else {
                total = total + 3.5;
            }
            idades.add(random);
        }
        System.out.println(total);
        for (int i : idades) {
            System.out.print(i + " ");
        }

    }

}
