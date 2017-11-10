/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author Karla
 */
public class Persona {

    private String nombres;
    private String apellidos;
    private int edad;
    private String cedula;

    public Persona(String n, String ap, int ed, String cd) {
        setNombres(n);
        setApellidos(ap);
        setEdad(ed);
        setCedula(cd);
    }
    
    

    public void setNombres(String n) {
        nombres = n;
    }

    public String getNombres() {
        return nombres;
    }

    public void setApellidos(String ap) {
        apellidos = ap;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int ed) {
        edad = ed;
    }

    public int getEdad() {
        return edad;
    }

    public void setCedula(String cd) {
        cedula = cd;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return String.format("\n\t\t%s %s\n\t\t%d años de edad\n\t\tCI: %s\n"
                ,getNombres(),getApellidos(),getEdad(),getCedula());
    } 

}
