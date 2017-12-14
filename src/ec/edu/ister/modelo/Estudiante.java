package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Estudiante extends Persona{

    private String idEstudiante;
    ArrayList<Double> notas=new ArrayList<Double>();

    public Estudiante() {
    }

    public Estudiante(String ci,String nom, Date fecNac,String idEstudiante) {
        super(ci,nom,fecNac);
        this.idEstudiante = idEstudiante;
        
    }

    
    /**
     * @return the idEstudiante
     */
    public String getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    /**
     * @return the notas
     */
    public String getNotas() {
        
        return Arrays.toString(notas.toArray());
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double notas) {
        this.notas.add(notas);
    }
     
    public double promedio(){
        double pr=0,sum=0;
        for (Double nota : notas) {
         sum += nota;   
        }
        pr=sum/notas.size();
        return pr;
    }
    @Override
    public String toString(){
        return super.toString()+"\nCodigo estudiante:"+
                getIdEstudiante()+"\nnotas:"+getNotas()+
                "\nPromedio: "+promedio();
    }
}
