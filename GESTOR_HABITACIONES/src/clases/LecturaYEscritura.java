/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.lista;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author odmon
 */
public class LecturaYEscritura extends lista {

    
    public LecturaYEscritura() {
    }

    
    private String ruta, contenido;
    private int edad;

    public LecturaYEscritura(String ruta, String contenido) {
        this.ruta = ruta;
        this.contenido = contenido;
    }

    public LecturaYEscritura(String ruta) {
        this.ruta = ruta;
    }

    public String leer() throws FileNotFoundException, IOException {

        String cadena, lectura = "";
        FileReader f = new FileReader(ruta);
        BufferedReader br = new BufferedReader(f);

        while ((cadena = br.readLine()) != null) {
            lectura += cadena + "\n";
        }
        br.close();
        return lectura;

    }

    public void escribir() throws IOException {
        FileWriter fw = new FileWriter(ruta, true);
        PrintWriter pw = new PrintWriter(fw);

        if (!"".equals(contenido)) {
            pw.println(contenido);

        }

        fw.close();

    }

    public void editar() throws IOException {

        FileWriter fw = new FileWriter(ruta);
        PrintWriter pw = new PrintWriter(fw);

        if (!"".equals(contenido)) {
            pw.println(contenido);
        }

        fw.close();

    }

    public void borrar() throws IOException {

        FileWriter fw = new FileWriter(ruta);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("");

        fw.close();

    }

    public String Datos() {

        String resp = toString();

        return resp;
    }

}
