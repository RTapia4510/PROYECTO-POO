/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clinica;

/**
 *
 * @author Wendy
 */
public class Factura {
    private int codigo;
    private double costeConsulta;
    private double costeServicios;
    private String metodoPago;

    public Factura(double costeConsulta, double costeServicios, String metodoPago) {
        this.costeConsulta = costeConsulta;
        this.costeServicios = costeServicios;
        this.metodoPago = metodoPago;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCosteConsulta() {
        return costeConsulta;
    }

    public void setCosteConsulta(double costeConsulta) {
        this.costeConsulta = costeConsulta;
    }

    public double getCosteServicios() {
        return costeServicios;
    }

    public void setCosteServicios(double costeServicios) {
        this.costeServicios = costeServicios;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
}
