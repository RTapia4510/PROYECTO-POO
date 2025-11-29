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
    private String especialidad;

    public Medico(String especialidad, String dni, String nombres, String apellidos, String telefono, String correo) {
        super(dni, nombres, apellidos, telefono, correo);
        this.especialidad = especialidad;
        this.rol = "Medico";
    }
    
}
