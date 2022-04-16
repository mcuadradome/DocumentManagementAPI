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
@Table(name = "gd_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdRoles.findAll", query = "SELECT g FROM GdRoles g")
    , @NamedQuery(name = "GdRoles.findByIdRoles", query = "SELECT g FROM GdRoles g WHERE g.idRoles = :idRoles")
    , @NamedQuery(name = "GdRoles.findByNombreRol", query = "SELECT g FROM GdRoles g WHERE g.nombreRol = :nombreRol")})
public class GdRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_roles")
    private Integer idRoles;
    @Column(name = "nombre_rol")
    private String nombreRol;
//    @OneToMany(mappedBy = "rolUsuario")
//    private List<GdUsuario> gdUsuarioList;

    public GdRoles() {
    }

    public GdRoles(Integer idRoles) {
        this.idRoles = idRoles;
    }

    public Integer getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Integer idRoles) {
        this.idRoles = idRoles;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
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
        hash += (idRoles != null ? idRoles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdRoles)) {
            return false;
        }
        GdRoles other = (GdRoles) object;
        if ((this.idRoles == null && other.idRoles != null) || (this.idRoles != null && !this.idRoles.equals(other.idRoles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdRoles[ idRoles=" + idRoles + " ]";
    }
    
}
