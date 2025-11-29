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
    
    
    
}
