/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Model.Personal.Empleado;

/**
 *
 * @author Wendy
 */
public class GestionEmpleado {
    private Empleado[] empleados;
    private int cantidad;

    public GestionEmpleado() {
        this.empleados = new Empleado[20];
        this.cantidad = 0;
    }
    public void registrar(Empleado emp){
        this.empleados[this.cantidad] = emp;
        cantidad++;
    }
    public void modificar(){
        
    }
    public void eliminar(String dni){
        for (int i = 0; i < cantidad; i++) {
            if (this.empleados[i].getDni().contentEquals(dni)) {
                for (int j = i; j < cantidad - 1; j++) {
                    this.empleados[j] = this.empleados[j+1];
                }this.empleados[cantidad - 1] = null;
            }
        }
    }
    
}
