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
public class HorariosMedico implements Serializable{
    
    private String id;
    private String horario;
    
    public HorariosMedico(String id, String horario) {
        this.id = id;
        this.horario = horario;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }
    
}
