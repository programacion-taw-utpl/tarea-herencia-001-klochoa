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
public class Trabajador extends Persona{

    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;

    public Trabajador(String n, String ap, int ed, String cd,int cs, int ht, int cph) {
        super(n, ap, ed, cd);
        setCosto_seguro(cs);
        setHoras_trabajadas(ht);
        setCosto_por_hora(cph);
    }

    public void setCosto_seguro(int cs) {
        costo_seguro = cs;
    }
    
    public int getCosto_seguro() {
        return costo_seguro;
    }

    public void setHoras_trabajadas(int ht) {
        horas_trabajadas = ht;
    }
    
    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setCosto_por_hora(int cph) {
        costo_por_hora = cph;
    }
    
    public int getCosto_por_hora() {
        return costo_por_hora;
    }
    
    public double obtener_sueldo(){
    
    double sueldo = 0.0;
    
    sueldo += ((getHoras_trabajadas() * getCosto_por_hora())+getCosto_seguro());
        
     return sueldo;   
    }
    
    @Override
    public String toString() {
        return String.format("%s"
                             + "\t\tSeguro: %d\n\t\tHoras trabajadas: %d\n\t\tValor por hora: %d\n\t\tSueldo: %.1f"
                ,super.toString(),getCosto_seguro(),getHoras_trabajadas(),getCosto_por_hora(),obtener_sueldo());
    } 
    
    
    
}
