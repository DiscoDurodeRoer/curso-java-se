package com.mycompany.objectoutputstream;

import java.io.Serializable;

// Si queremos que se pueda escribir en un fichero, debe ser serializable
public class Usuario implements Serializable {

    // Control de versiones
    // Permite mantenter compatibilidad con versiones anteriores
    private static final long serialVersionUID = 1L;

    private int id;
    private String email;
    private String password;

    public Usuario() {
    }

    public Usuario(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", password=" + password + '}';
    }

}
