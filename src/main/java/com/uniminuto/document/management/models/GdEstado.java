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
@Table(name = "gd_estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdEstado.findAll", query = "SELECT g FROM GdEstado g")
    , @NamedQuery(name = "GdEstado.findByIdEstado", query = "SELECT g FROM GdEstado g WHERE g.idEstado = :idEstado")
    , @NamedQuery(name = "GdEstado.findByNombreEstado", query = "SELECT g FROM GdEstado g WHERE g.nombreEstado = :nombreEstado")})
public class GdEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "nombre_estado")
    private String nombreEstado;
//    @OneToMany(mappedBy = "estadoDoumento")
//    private List<GdDocumentos> gdDocumentosList;

    public GdEstado() {
    }

    public GdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
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
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdEstado)) {
            return false;
        }
        GdEstado other = (GdEstado) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdEstado[ idEstado=" + idEstado + " ]";
    }
    
}
