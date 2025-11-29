/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clinica;

/**
 *
 * @author Wendy
 */
public class Consultorio {
    private int codigo;
    private String especialidad;
    private String estado;
    private Cita[] citas;

    public Consultorio(int codigo, String especialidad, String estado) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
        this.citas = new Cita[50];
    }
    public void cambiarEstado(String a){
        this.estado = a;
    }
    
}
