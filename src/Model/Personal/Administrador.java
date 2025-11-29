/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Personal;

import Gestores.GestionConsulta;
import Gestores.GestionConsultorio;
import Gestores.GestionEmpleado;
import Model.Clinica.Consultorio;

/**
 *
 * @author Wendy
 */
public class Administrador extends Empleado{
    private GestionEmpleado gestionEmpleado;
    private GestionConsultorio gestionConsultorio;
    private GestionConsulta gestionConsulta;

    public Administrador(GestionEmpleado gestionEmpleado, GestionConsultorio gestionConsultorio, GestionConsulta gestionConsulta, String dni, String nombres, String apellidos, String telefono, String correo) {
        super(dni, nombres, apellidos, telefono, correo);
        this.gestionEmpleado = gestionEmpleado;
        this.gestionConsultorio = gestionConsultorio;
        this.gestionConsulta = gestionConsulta;
    }
}
