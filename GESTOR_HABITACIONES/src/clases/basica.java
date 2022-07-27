/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author odmon
 */
public class basica {
    
    
    //Se declaran variables.
    static ArrayList<lista> lista = new ArrayList();
    String nombre, cedula, correo, fecha1, fecha2;
    int piso, habitacion;
    lista aux;
    
    private String resp = "", msg;
    private int est, tmp;
    
    
    
    
    
    //Método de Registro.
    public String Registro(String nombre, String cedula, String correo) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        
        aux = new lista();
        
        aux.setNombre(this.nombre);
        aux.setCedula(this.cedula);
        aux.setCorreo(this.correo);

        
        lista.add(aux);
      
        
        // Bucle para enviar mensaje final de registro.
       
            msg = "¡Has sido registrado " + nombre + "!" + "\n";

        

        
        return msg; // Returna el mensaje final en una variable.
            

    }
    
    
    
    //Método de Reserva.
    public String Reservar(String cedula, String fecha1, String fecha2, int piso, int habitacion) {
        tmp=0;
        String nombrex = "";
        for(int i=0;i<lista.size();i++){
            
            if(lista.get(i).getCedula().equalsIgnoreCase(cedula)){
                
                 this.fecha1 = fecha1;
                 this.fecha2 = fecha2;
                 this.piso = piso;
                 this.habitacion = habitacion;
                
                lista.get(i).setFecha1(this.fecha1);
                lista.get(i).setFecha2(this.fecha2);
                lista.get(i).setPiso(this.piso);
                lista.get(i).setHabitacion(this.habitacion);
                
                nombrex = lista.get(i).getNombre();
                 
                tmp=1;
                
                
                
                break;
                
            }else{
                
                tmp=0;
                
            }
        }
    

        // Bucle para enviar mensaje final de registro.
       
            msg = "¡Reserva exitosa Mr. " + nombrex + "!" + "\n";

        

        
        return msg; // Returna el mensaje final en una variable.
            

    }
    
    
    //Método de Reserva.
    public String Reserve(int piso, int habitacion) {
        
        resp = "<html>";
        
        for(int i=0;i<lista.size();i++){
            
            if(lista.get(i).getPiso() == piso && lista.get(i).getHabitación() == habitacion){
                
                 this.piso = piso;
                 this.habitacion = habitacion;
                
                lista.get(i).setPiso(this.piso);
                lista.get(i).setHabitacion(this.habitacion);


                resp += lista.get(i) + "<p>";
                break;
                
            }
        }
        
        resp += "</html>";     
   
        return resp; // Returna el mensaje final en una variable.
            
    }
    
    
    
    //Método repeticiones de habitaciones y piso.
     public int validar_no_double(int piso, int habitacion){
        tmp=0;
        for(int i=0;i<lista.size();i++){
            
            if(lista.get(i).getPiso() == piso && lista.get(i).getHabitación() == habitacion){
                
                tmp=1;
                
                break;
                
            }else{
                
                tmp=0;
                
            }
        }
        return tmp;
    }
     
    
     //Método antirepeticiones.
     public int validar_double(String nombre, String cedula){
        tmp=0;
        for(int i=0;i<lista.size();i++){
            
            if(lista.get(i).getCedula().equalsIgnoreCase(cedula)){
                
                tmp=1;
                
                break;
                
            }else{
                
                tmp=0;
                
            }
        }
        return tmp;
    }
     
     
     
     //Método antirepeticiones.
     public int validar_cedula(String cedula){
        tmp=0;
        for(int i=0;i<lista.size();i++){
            
            if(lista.get(i).getCedula().equalsIgnoreCase(cedula)){
                
                tmp=1;
                
                break;
                
            }else{
                
                tmp=0;
                
            }
        }
        return tmp;
    }
     
    
    //Método para mostrar todas las reservas.
    public String mostrar_reservas(){
           
        resp = "<html>";
        
        //Bucle para recorrer y encontrar su marca.
        //Size = lenght al ser un arreglo de objetos.
        for(int i = 0; i < lista.size(); i++ ){
                
                //Almacenar en una variable temporal.
               resp += lista.get(i)+ "<p>";
                 
        }
        
        resp += "</html>";
        
        return resp;
        
    }
}
