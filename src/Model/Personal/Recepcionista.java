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
    private GestionPaciente gestionPaciente;
    private GestionCita gestionCita;
    private GestionConsulta gestionConsulta;

    public Recepcionista(GestionPaciente gestionPaciente, GestionCita gestionCita, GestionConsulta gestionConsulta, String dni, String nombres, String apellidos, String telefono, String correo) {
        super(dni, nombres, apellidos, telefono, correo);
        this.gestionPaciente = gestionPaciente;
        this.gestionCita = gestionCita;
        this.gestionConsulta = gestionConsulta;
    }
    public void admitir(){
        
    }
    public void darAlta(){
        
    }
    public void generarFactura(){
        
    }
    public void crearPaciente(Paciente pac){
        gestionPaciente.registrar(pac);
    }
    public void modificarPaciente(){
        
    }
    public void eliminarPaciente(String dni){
        gestionPaciente.eliminar(dni);
    }
    public void crearCita(Cita cita){
        gestionCita.registrar(cita);
    }
    public void modificarCita(){
        
    }
    public void eliminarCita(int codigo){
        gestionCita.eliminar(codigo);
    }
    public void validarMedico(){
        
    }
    public void validarAmbiente(){
        
    }
    public void buscarCita(){
        
    }
}
