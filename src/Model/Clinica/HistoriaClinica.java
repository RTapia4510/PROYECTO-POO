/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clinica;

/**
 *
 * @author Wendy
 */
public class HistoriaClinica {
    private Consulta[] consultas;
    private int cantidad;
    private Paciente paciente;

    public HistoriaClinica(Paciente paciente) {
        this.paciente = paciente;
        this.consultas = new Consulta[10];
        this.cantidad = 0;
    }
    public void registrar(Consulta consulta){
        consulta.setCodigo(cantidad+1);
        this.consultas[this.cantidad] = consulta;
        cantidad++;
    }
    public void modificar(){
        
    }
    public void eliminar(int codigo){
        for (int i = 0; i < cantidad; i++) {
            if (this.consultas[i].getCodigo() == codigo) {
                for (int j = i; j < cantidad - 1; j++) {
                    this.consultas[j] = this.consultas[j+1];
                }this.consultas[cantidad - 1] = null;
            }
        }
    }
    
    
}
