/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Personal;

import Gestores.GestionCita;
import Gestores.GestionConsulta;
import Gestores.GestionPaciente;
import Model.Clinica.Cita;
import Model.Clinica.Paciente;

/**
 *
 * @author Wendy
 */
public class Recepcionista extends Empleado{

    public Recepcionista(String dni, String nombres, String apellidos, String telefono, String correo) {
        super(dni, nombres, apellidos, telefono, correo);
        this.rol = "Recepcionista";

    }
    
}
