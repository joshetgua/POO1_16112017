package ec.edu.ister.modelo;

import java.util.Date;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Persona {
    private String cedula;
    private String nombre;
    private Date fechaNaciemiento;

    public Persona() {
    }

    public Persona(String cedula, String nombre, Date fechaNaciemiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNaciemiento(Date fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    @Override
    public String toString() {
        return "Nombre:"+getNombre()+"\n"+
                "Cédula:"+getCedula()+"\n"+
                "Fecha de Nacimiento:"+getFechaNaciemiento();
    }
    
    
    

}
