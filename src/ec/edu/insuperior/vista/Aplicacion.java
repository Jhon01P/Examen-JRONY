/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.insuperior.vista;

import ec.edu.insuperior.controlador.Conexion;
import ec.edu.insuperior.controlador.Controlador;

/**
 *
 * @author Administrador
 */
public class Aplicacion {
     public static void main(String[] args) {
         Controlador c=new Controlador();
         c.mostrarFrmLoggin();
        
          Conexion.getConexion();
}
}