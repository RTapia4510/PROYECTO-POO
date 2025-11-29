/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Model.Clinica.Paciente;

/**
 *
 * @author Wendy
 */
public class GestionPaciente {
    private Paciente[] pacientes;
    private int cantidad;

    public GestionPaciente() {
        this.pacientes = new Paciente[50];
        this.cantidad = 0;
    }
    public void registrar(Paciente pac){
        this.pacientes[this.cantidad] = pac;
        cantidad++;
    }
    public void modificar(){
        
    }
    public void eliminar(String dni){
        for (int i = 0; i < cantidad; i++) {
            if (this.pacientes[i].getDni() == dni) {
                for (int j = i; j < cantidad - 1; j++) {
                    this.pacientes[j] = this.pacientes[j+1];
                }this.pacientes[cantidad - 1] = null;
            }
        }
    }
    
}
