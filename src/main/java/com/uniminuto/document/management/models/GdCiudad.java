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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "gd_ciudad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdCiudad.findAll", query = "SELECT g FROM GdCiudad g")
    , @NamedQuery(name = "GdCiudad.findByIdCiudad", query = "SELECT g FROM GdCiudad g WHERE g.idCiudad = :idCiudad")
    , @NamedQuery(name = "GdCiudad.findByNombreCiudad", query = "SELECT g FROM GdCiudad g WHERE g.nombreCiudad = :nombreCiudad")})
public class GdCiudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ciudad")
    private Integer idCiudad;
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;
//    @OneToMany(mappedBy = "cidadUsuario")
//    private List<GdUsuario> gdUsuarioList;
    @JoinColumn(name = "departamento_ciudad", referencedColumnName = "id_departamento")
    @ManyToOne
    private GdDepartamento departamentoCiudad;
//    @OneToMany(mappedBy = "ciudadDocumento")
//    private List<GdDocumentos> gdDocumentosList;

    public GdCiudad() {
    }

    public GdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

//    @XmlTransient
//    public List<GdUsuario> getGdUsuarioList() {
//        return gdUsuarioList;
//    }
//
//    public void setGdUsuarioList(List<GdUsuario> gdUsuarioList) {
//        this.gdUsuarioList = gdUsuarioList;
//    }

    public GdDepartamento getDepartamentoCiudad() {
        return departamentoCiudad;
    }

    public void setDepartamentoCiudad(GdDepartamento departamentoCiudad) {
        this.departamentoCiudad = departamentoCiudad;
    }

//    @XmlTransient
//    public List<GdDocumentos> getGdDocumentosList() {
//        return gdDocumentosList;
//    }
//
//    public void setGdDocumentosList(List<GdDocumentos> gdDocumentosList) {
//        this.gdDocumentosList = gdDocumentosList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCiudad != null ? idCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdCiudad)) {
            return false;
        }
        GdCiudad other = (GdCiudad) object;
        if ((this.idCiudad == null && other.idCiudad != null) || (this.idCiudad != null && !this.idCiudad.equals(other.idCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdCiudad[ idCiudad=" + idCiudad + " ]";
    }
    
}
