/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Gestores.GestionCita;
import Gestores.GestionConsulta;
import Gestores.GestionConsultorio;
import Gestores.GestionEmpleado;
import Gestores.GestionFactura;
import Gestores.GestionPaciente;

/**
 *
 * @author Wendy
 */
public class Repositorio {
    public static GestionEmpleado repEmpleado;
    public static GestionCita repCita;
    public static GestionConsulta repConsulta;
    public static GestionConsultorio repConsultorio;
    public static GestionPaciente repPaciente;
    public static GestionFactura repFactura;

    public GestionEmpleado getRepEmpleado() {
        return repEmpleado;
    }

    public void setRepEmpleado(GestionEmpleado repEmpleado) {
        this.repEmpleado = repEmpleado;
    }

    public GestionCita getRepCita() {
        return repCita;
    }

    public void setRepCita(GestionCita repCita) {
        this.repCita = repCita;
    }

    public GestionConsulta getRepConsulta() {
        return repConsulta;
    }

    public void setRepConsulta(GestionConsulta repConsulta) {
        this.repConsulta = repConsulta;
    }

    public GestionConsultorio getRepConsultorio() {
        return repConsultorio;
    }

    public void setRepConsultorio(GestionConsultorio repConsultorio) {
        this.repConsultorio = repConsultorio;
    }

    public GestionPaciente getRepPaciente() {
        return repPaciente;
    }

    public void setRepPaciente(GestionPaciente repPaciente) {
        this.repPaciente = repPaciente;
    }

    public GestionFactura getRepFactura() {
        return repFactura;
    }

    public void setRepFactura(GestionFactura repFactura) {
        this.repFactura = repFactura;
    }
    
    
}
