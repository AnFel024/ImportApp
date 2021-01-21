/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Controlador.Controlador;
import java.io.IOException;

/**
 *
 * @author Andrés Morales Anaya
 * 
 */
public class ProyImportacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        Controlador ObjC = new Controlador();
        ObjC.Iniciar(true);
        
    }
    
}
