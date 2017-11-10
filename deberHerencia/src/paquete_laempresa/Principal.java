/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

import paquete_personal.Persona;
import paquete_personal.Trabajador;

/**
 *
 * @author Karla
 */
public class Principal {
    
    public static void main(String[] args) {
        
      Trabajador t = new Trabajador("Ana Luisa","Velez Alcivar", 30, "12903939", 100, 40, 10);
        
      Trabajador t2 = new Trabajador("Mario Anibal", "Velez Alcivar", 35, "212889", 100, 50, 10);
       
        
      Trabajador [] lista_Trabajadores = new Trabajador[2];
      lista_Trabajadores [0]=t;
      lista_Trabajadores [1]=t2;
      
      Empresa e = new Empresa("Soluciones Software", "SS's", "Loja", lista_Trabajadores);
       
      
      EmpresaPrivada ep = new EmpresaPrivada("Soluciones Software", "SS's", "Loja", 200000, 12, lista_Trabajadores);
       System.out.println(ep);
    }
    
}
