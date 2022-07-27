/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author odmon
 */
public class lista {
    private String nombre,cedula, correo, fecha1, fecha2;
    private int piso, habitacion;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public String getFecha1() {
        return fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }
    
    public int getPiso() {
        return piso;
    }
    
    public int getHabitación() {
        return habitacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

   
    
    @Override
    public String toString(){
        
        StringBuilder sb= new StringBuilder();
        sb.append("\nNombre: ");
        sb.append("\t"+ nombre);
        sb.append(" - Cedula: ");
        sb.append("\t" + cedula);
        sb.append("\n - Correo: ");
        sb.append("\t" + correo);
        sb.append("\n - Llegada: ");
        sb.append("\t" + fecha1);
        sb.append("\n - Salida: ");
        sb.append("\t" + fecha2);
        sb.append("\n - Piso: ");
        sb.append("\t" + piso);
        sb.append("\n - habitación: ");
        sb.append("\t" + habitacion);
        
        return sb.toString();
        
    }
    
}
