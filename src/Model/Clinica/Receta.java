/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clinica;

/**
 *
 * @author Wendy
 */
public class Receta {
    private Medicamento[] medicamentos;
    private int cantidad;

    public Receta() {
        this.medicamentos = new Medicamento[5];
        this.cantidad = 0;
    }
    public void registrar(Medicamento med){
        this.medicamentos[this.cantidad] = med;
        cantidad++;
    }
    
}
