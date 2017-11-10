/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

import paquete_personal.Trabajador;

/**
 *
 * @author Karla
 */
public class Empresa {

    private String nombre;
    private String siglas;
    private String ciudad;
    private  Trabajador [] lista_Trabajadores;

    public Empresa(String n, String s, String c, Trabajador[] lt) {
        setNombre(n);
        setSiglas(s);
        setCiudad(c);
        setLista_Trabajadores(lt);
    }


    public void setNombre(String n) {
        nombre = n;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setSiglas(String s) {
        siglas = s;
    }
    
    public String getSiglas() {
        return siglas;
    }

    public void setCiudad(String c) {
        ciudad = c;
    }
    
    public String getCiudad() {
        return ciudad;
    }

    public void setLista_Trabajadores(Trabajador[] lt) {
        lista_Trabajadores = lt;
    }
    
    public Trabajador[] getLista_Trabajadores() {
        return lista_Trabajadores;
    }
    
    public String obtener_lista_trabajadores() {
        String cadena = "";

        Trabajador[] arrayTrabajador = getLista_Trabajadores();

        for ( int i = 0; i < arrayTrabajador.length; i++) {
            cadena += "\n\n\t"+ (i+1) + ")" + String.format("%s"
       
            ,arrayTrabajador[i].toString());
            
        }
           return cadena;
    }
    
    @Override
    public String toString() {
        return String.format("Empresa:%s \n Siglas:%s\n Ciudad:%s\n Lista Trabajadores:%s"
                ,getNombre(),getSiglas(),getCiudad(),obtener_lista_trabajadores());
    } 
    
    
    
}


