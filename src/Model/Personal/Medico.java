/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Personal;

import Gestores.GestionConsulta;
import Model.Clinica.Consulta;

/**
 *
 * @author Wendy
 */
public class Medico extends Empleado{
    private GestionConsulta gestionConsulta;
    private String especialidad;
    private String estado;

    public Medico(GestionConsulta gestionConsulta, String especialidad, String estado, String dni, String nombres, String apellidos, String telefono, String correo) {
        super(dni, nombres, apellidos, telefono, correo);
        this.gestionConsulta = gestionConsulta;
        this.especialidad = especialidad;
        this.estado = estado;
    }
    public void crearConsulta(Consulta consulta){
        gestionConsulta.registrar(consulta);
    }
    public void buscarConsulta(){
        
    }
}
