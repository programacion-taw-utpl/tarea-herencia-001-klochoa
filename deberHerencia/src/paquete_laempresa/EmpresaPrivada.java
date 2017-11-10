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
public class EmpresaPrivada extends Empresa {

    private int ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(String n, String s, String c, int vmf, int ns, Trabajador[] lt) {
        super(n, s, c, lt);
        setVentas_mensual_fijo(vmf);
        setNumero_sucursales(ns);
    }

    public void setVentas_mensual_fijo(int vmf) {
        ventas_mensual_fijo = vmf;
    }

    public int getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setNumero_sucursales(int ns) {
        numero_sucursales = ns;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }
    
    @Override
    public String toString() {
        return String.format("Empresa: %s\nSiglas: %s\nCiudad: %s\n"
                + "Ventas: %d\nSucursales: %d\nLista de trabajadores:%s"
                
                
                
                ,super.getNombre(),super.getSiglas(),super.getCiudad()
                ,getVentas_mensual_fijo(),getNumero_sucursales(),super.obtener_lista_trabajadores());
    }

}
