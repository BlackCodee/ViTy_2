
package com.misiontic.proyectovity.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
@Table(name="citas")

public class Citas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCitas")
    private Integer idCitas;   
    
    @ManyToOne
    @JoinColumn(name="idEspecialista")
    private Especialista idEspecialista;
    
    @Column(name="nombre_Paciente")
    private String nombre_Paciente;
    
    @Column(name="fecha_hora")
    private String fecha_hora;
    
    @Column(name="estado")
    private String estado;
    
    @Column(name="detalle")
    private String detalle;

    /**
     * @return the idCitas
     */
    public Integer getIdCitas() {
        return idCitas;
    }

    /**
     * @param idCitas the idCitas to set
     */
    public void setIdCitas(Integer idCitas) {
        this.idCitas = idCitas;
    }

    /**
     * @return the idEspecialista
     */
    public Especialista getIdEspecialista() {
        return idEspecialista;
    }

    /**
     * @param idEspecialista the idEspecialista to set
     */
    public void setIdEspecialista(Especialista idEspecialista) {
        this.idEspecialista = idEspecialista;
    }

    /**
     * @return the nombre_Paciente
     */
    public String getNombre_Paciente() {
        return nombre_Paciente;
    }

    /**
     * @param nombre_Paciente the nombre_Paciente to set
     */
    public void setNombre_Paciente(String nombre_Paciente) {
        this.nombre_Paciente = nombre_Paciente;
    }

    /**
     * @return the fecha_hora
     */
    public String getFecha_hora() {
        return fecha_hora;
    }

    /**
     * @param fecha_hora the fecha_hora to set
     */
    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
