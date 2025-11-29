/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Model.Clinica.Cita;

/**
 *
 * @author Wendy
 */
public class GestionCita {
    private Cita[] citas;
    private int cantidad;

    public GestionCita() {
        this.citas = new Cita[50];
        this.cantidad = 0;
    }
    public void registrar(Cita cita){
        cita.setCodigo(cantidad+1);
        this.citas[this.cantidad] = cita;
        cantidad++;
    }
    public void modificar(){
        
    }
    public void eliminar(int codigo){
        for (int i = 0; i < cantidad; i++) {
            if (this.citas[i].getCodigo() == codigo) {
                for (int j = i; j < cantidad - 1; j++) {
                    this.citas[j] = this.citas[j+1];
                }this.citas[cantidad - 1] = null;
            }
        }
    }
    
    
}
