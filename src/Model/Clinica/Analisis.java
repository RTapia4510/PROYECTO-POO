/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clinica;

/**
 *
 * @author Wendy
 */
public class Analisis {
    private Orden[] ordenes;
    private int cantidad;

    public Analisis() {
        this.ordenes = new Orden[5];
        this.cantidad = 0;
    }
    public void registrar(Orden orden){
        this.ordenes[cantidad] = orden;
        cantidad++;
    }
    
}
