/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestores;

import Model.Personal.Usuario;

/**
 *
 * @author Wendy
 */
public class GestorUsuario {
    private Usuario[] usuarios;
    private int cantidad;

    public GestorUsuario() {
        this.usuarios = new Usuario[10];
        this.cantidad = 0;
        
    }
    public void registrar(Usuario user){
        this.usuarios[this.cantidad] = user;
        cantidad++;
        
    }
    public Usuario validar(String user,String pass){
        for (int i = 0; i < cantidad; i++) {
            if (this.usuarios[i].getUsername().equals(user) && this.usuarios[i].getContrasena().equals(pass)) {
                return this.usuarios[i];
            }
        }return null;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
