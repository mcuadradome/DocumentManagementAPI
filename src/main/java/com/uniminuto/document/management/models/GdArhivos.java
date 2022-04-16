/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.document.management.models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "gd_arhivos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdArhivos.findAll", query = "SELECT g FROM GdArhivos g")
    , @NamedQuery(name = "GdArhivos.findByIdArhiivo", query = "SELECT g FROM GdArhivos g WHERE g.idArhiivo = :idArhiivo")
    , @NamedQuery(name = "GdArhivos.findByPahtArhivo", query = "SELECT g FROM GdArhivos g WHERE g.pahtArhivo = :pahtArhivo")
    , @NamedQuery(name = "GdArhivos.findByFechaArhivo", query = "SELECT g FROM GdArhivos g WHERE g.fechaArhivo = :fechaArhivo")})
public class GdArhivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_arhiivo")
    private Integer idArhiivo;
    @Column(name = "paht_arhivo")
    private String pahtArhivo;
    @Basic(optional = false)
    @Column(name = "fecha_arhivo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaArhivo;
    @JoinColumn(name = "documento_radicado", referencedColumnName = "id_document")
    @ManyToOne
    private GdDocumentos documentoRadicado;

    public GdArhivos() {
    }

    public GdArhivos(Integer idArhiivo) {
        this.idArhiivo = idArhiivo;
    }

    public GdArhivos(Integer idArhiivo, Date fechaArhivo) {
        this.idArhiivo = idArhiivo;
        this.fechaArhivo = fechaArhivo;
    }

    public Integer getIdArhiivo() {
        return idArhiivo;
    }

    public void setIdArhiivo(Integer idArhiivo) {
        this.idArhiivo = idArhiivo;
    }

    public String getPahtArhivo() {
        return pahtArhivo;
    }

    public void setPahtArhivo(String pahtArhivo) {
        this.pahtArhivo = pahtArhivo;
    }

    public Date getFechaArhivo() {
        return fechaArhivo;
    }

    public void setFechaArhivo(Date fechaArhivo) {
        this.fechaArhivo = fechaArhivo;
    }

    public GdDocumentos getDocumentoRadicado() {
        return documentoRadicado;
    }

    public void setDocumentoRadicado(GdDocumentos documentoRadicado) {
        this.documentoRadicado = documentoRadicado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArhiivo != null ? idArhiivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdArhivos)) {
            return false;
        }
        GdArhivos other = (GdArhivos) object;
        if ((this.idArhiivo == null && other.idArhiivo != null) || (this.idArhiivo != null && !this.idArhiivo.equals(other.idArhiivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdArhivos[ idArhiivo=" + idArhiivo + " ]";
    }
    
}
