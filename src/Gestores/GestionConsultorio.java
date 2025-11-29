/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Model.Clinica.Consultorio;

/**
 *
 * @author Wendy
 */
public class GestionConsultorio {
    private Consultorio[] consultorios;
    private int cantidad;

    public GestionConsultorio() {
        this.consultorios = new Consultorio[20];
        this.cantidad = 0;
    }
    public void registrar(Consultorio con){
        con.setCodigo(cantidad+1);
        this.consultorios[this.cantidad] = con;
        cantidad++;
    }
    public void modificar(){
        
    }
    public void eliminar(int codigo){
        for (int i = 0; i < cantidad; i++) {
            if (this.consultorios[i].getCodigo() == codigo) {
                for (int j = i; j < cantidad - 1; j++) {
                    this.consultorios[j] = this.consultorios[j+1];
                }this.consultorios[cantidad - 1] = null;
            }
        }
    }
    
}
