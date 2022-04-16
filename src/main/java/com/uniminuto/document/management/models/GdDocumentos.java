/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.document.management.models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "gd_documentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdDocumentos.findAll", query = "SELECT g FROM GdDocumentos g")
    , @NamedQuery(name = "GdDocumentos.findByIdDocument", query = "SELECT g FROM GdDocumentos g WHERE g.idDocument = :idDocument")
    , @NamedQuery(name = "GdDocumentos.findByNombreDocumento", query = "SELECT g FROM GdDocumentos g WHERE g.nombreDocumento = :nombreDocumento")
    , @NamedQuery(name = "GdDocumentos.findByFechaDocumento", query = "SELECT g FROM GdDocumentos g WHERE g.fechaDocumento = :fechaDocumento")})
public class GdDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_document")
    private Integer idDocument;
    @Column(name = "nombre_documento")
    private String nombreDocumento;
    @Basic(optional = false)
    @Column(name = "fecha_documento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDocumento;
//    @OneToMany(mappedBy = "documentoRadicado")
//    private List<GdArhivos> gdArhivosList;
    @JoinColumn(name = "ciudad_documento", referencedColumnName = "id_ciudad")
    @ManyToOne
    private GdCiudad ciudadDocumento;
    @JoinColumn(name = "departamento_docuento", referencedColumnName = "id_departamento")
    @ManyToOne
    private GdDepartamento departamentoDocuento;
    @JoinColumn(name = "usuario_radicado", referencedColumnName = "rol_usuario")
    @ManyToOne
    private GdUsuario usuarioRadicado;
    @JoinColumn(name = "estado_doumento", referencedColumnName = "id_estado")
    @ManyToOne
    private GdEstado estadoDoumento;
//    @OneToMany(mappedBy = "documentoComentario")
//    private List<GdComentariosDoumentos> gdComentariosDoumentosList;

    public GdDocumentos() {
    }

    public GdDocumentos(Integer idDocument) {
        this.idDocument = idDocument;
    }

    public GdDocumentos(Integer idDocument, Date fechaDocumento) {
        this.idDocument = idDocument;
        this.fechaDocumento = fechaDocumento;
    }

    public Integer getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Integer idDocument) {
        this.idDocument = idDocument;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

//    @XmlTransient
//    public List<GdArhivos> getGdArhivosList() {
//        return gdArhivosList;
//    }
//
//    public void setGdArhivosList(List<GdArhivos> gdArhivosList) {
//        this.gdArhivosList = gdArhivosList;
//    }

    public GdCiudad getCiudadDocumento() {
        return ciudadDocumento;
    }

    public void setCiudadDocumento(GdCiudad ciudadDocumento) {
        this.ciudadDocumento = ciudadDocumento;
    }

    public GdDepartamento getDepartamentoDocuento() {
        return departamentoDocuento;
    }

    public void setDepartamentoDocuento(GdDepartamento departamentoDocuento) {
        this.departamentoDocuento = departamentoDocuento;
    }

    public GdUsuario getUsuarioRadicado() {
        return usuarioRadicado;
    }

    public void setUsuarioRadicado(GdUsuario usuarioRadicado) {
        this.usuarioRadicado = usuarioRadicado;
    }

    public GdEstado getEstadoDoumento() {
        return estadoDoumento;
    }

    public void setEstadoDoumento(GdEstado estadoDoumento) {
        this.estadoDoumento = estadoDoumento;
    }

//    @XmlTransient
//    public List<GdComentariosDoumentos> getGdComentariosDoumentosList() {
//        return gdComentariosDoumentosList;
//    }
//
//    public void setGdComentariosDoumentosList(List<GdComentariosDoumentos> gdComentariosDoumentosList) {
//        this.gdComentariosDoumentosList = gdComentariosDoumentosList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocument != null ? idDocument.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdDocumentos)) {
            return false;
        }
        GdDocumentos other = (GdDocumentos) object;
        if ((this.idDocument == null && other.idDocument != null) || (this.idDocument != null && !this.idDocument.equals(other.idDocument))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdDocumentos[ idDocument=" + idDocument + " ]";
    }
    
}
