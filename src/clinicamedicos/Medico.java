/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicamedicos;

/**
 *
 * @author Admin
 */
import java.io.Serializable;
public class Medico implements Serializable{
    // Atributos o propiedades
    private String id;
    private String nombre;
    private String email;
    private String clave;
    private String tipos_medicos;

    public Medico(String id, String nombre, String email, String clave, String tipos_medicos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.tipos_medicos = tipos_medicos;
    }
    
    //=== metodos para recuperar la informacion
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

    public String getTipos_medicos() {
        return tipos_medicos;
    }
    
    //==== metodos para grabar la informacion 
    
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setTipos_medicos(String tipos_medicos) {
        this.tipos_medicos = tipos_medicos;
    }
    
    
}
