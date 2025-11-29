/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clinica;

/**
 *
 * @author Wendy
 */
public class Consulta {
    private int codigo;
    private String motivo;
    private String antecedentes;
    private String signosVitales;
    private String examenFisico;
    private String diagnostico;
    private String plan;
    private Receta receta;
    private Analisis analisis;
    private double precio;
    private Cita cita;

    public Consulta(String motivo, String antecedentes, String signosVitales, String examenFisico, String diagnostico, String plan, Receta receta, Analisis analisis, Cita cita) {
        this.motivo = motivo;
        this.antecedentes = antecedentes;
        this.signosVitales = signosVitales;
        this.examenFisico = examenFisico;
        this.diagnostico = diagnostico;
        this.plan = plan;
        this.receta = receta;
        this.analisis = analisis;
        this.cita = cita;
    }
    public void precioPlan(int num){
        switch(num){
            case 1:setPrecio(50);break;
            case 2:setPrecio(150);break; 
    }}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(String signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Analisis getAnalisis() {
        return analisis;
    }

    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
}
