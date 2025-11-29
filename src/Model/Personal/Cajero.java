/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Personal;

import Gestores.GestionConsulta;
import Gestores.GestionFactura;

/**
 *
 * @author Wendy
 */
public class Cajero extends Empleado{
    private GestionFactura gestionFactura;
    private GestionConsulta gestionConsulta;

    public Cajero(GestionFactura gestionFactura, GestionConsulta gestionConsulta, String dni, String nombres, String apellidos, String telefono, String correo) {
        super(dni, nombres, apellidos, telefono, correo);
        this.gestionFactura = gestionFactura;
        this.gestionConsulta = gestionConsulta;
    }
    
    
}
