package ec.edu.ister.vista;

import ec.edu.ister.modelo.Estudiante;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {
    public static void main(String[] args) {
      Estudiante es= new Estudiante();  
      es.setNombre("Enrique");
      es.setCedula("1234567890");
      es.setIdEstudiante("E001");
        for (int i = 0; i < 6; i++) {
            es.setNotas(i);
            
        }
        JOptionPane.showMessageDialog(null,es.toString());
    }
    
    

}
