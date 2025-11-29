/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Model.Clinica.Consulta;

/**
 *
 * @author Wendy
 */
public class GestionConsulta {
    private Consulta[] consultas;
    private int cantidad;

    public GestionConsulta() {
        this.consultas = new Consulta[50];
        this.cantidad = 0;
    }
     public void registrar(Consulta consulta){
        consulta.setCodigo(cantidad+1);
        this.consultas[this.cantidad] = consulta;
        cantidad++;
    }
    public void modificar(){
        
    }
    public void eliminar(int codigo){
        for (int i = 0; i < cantidad; i++) {
            if (this.consultas[i].getCodigo() == codigo) {
                for (int j = i; j < cantidad - 1; j++) {
                    this.consultas[j] = this.consultas[j+1];
                }this.consultas[cantidad - 1] = null;
            }
        }
    }
    
    
}
