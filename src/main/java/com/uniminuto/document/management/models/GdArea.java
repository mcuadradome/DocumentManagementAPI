/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.document.management.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "gd_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdArea.findAll", query = "SELECT g FROM GdArea g")
    , @NamedQuery(name = "GdArea.findByIdArea", query = "SELECT g FROM GdArea g WHERE g.idArea = :idArea")
    , @NamedQuery(name = "GdArea.findByNombreArea", query = "SELECT g FROM GdArea g WHERE g.nombreArea = :nombreArea")
    , @NamedQuery(name = "GdArea.findByUsuario", query = "SELECT g FROM GdArea g WHERE g.usuario = :usuario")})
public class GdArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_area")
    private Integer idArea;
    @Column(name = "nombre_area")
    private String nombreArea;
    @Column(name = "usuario")
    private Integer usuario;
//    @OneToMany(mappedBy = "areaUsuario")
//    private List<GdUsuario> gdUsuarioList;

    public GdArea() {
    }

    public GdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

//    @XmlTransient
//    public List<GdUsuario> getGdUsuarioList() {
//        return gdUsuarioList;
//    }
//
//    public void setGdUsuarioList(List<GdUsuario> gdUsuarioList) {
//        this.gdUsuarioList = gdUsuarioList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdArea)) {
            return false;
        }
        GdArea other = (GdArea) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdArea[ idArea=" + idArea + " ]";
    }
    
}
