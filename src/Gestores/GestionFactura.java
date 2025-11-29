/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Model.Clinica.Factura;

/**
 *
 * @author Wendy
 */
public class GestionFactura {
    private Factura[] facturas;
    private int cantidad;

    public GestionFactura() {
        this.facturas = new Factura[50];
        this.cantidad = 0;
    }
    public void registrar(Factura fac){
        fac.setCodigo(cantidad+1);
        this.facturas[this.cantidad] = fac;
        cantidad++;
    }
    public void modificar(){
        
    }
    public void eliminar(int codigo){
        for (int i = 0; i < cantidad; i++) {
            if (this.facturas[i].getCodigo() == codigo) {
                for (int j = i; j < cantidad - 1; j++) {
                    this.facturas[j] = this.facturas[j+1];
                }this.facturas[cantidad - 1] = null;
            }
        }
    }
    
}
