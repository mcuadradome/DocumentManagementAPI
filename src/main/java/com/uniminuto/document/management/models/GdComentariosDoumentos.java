/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.document.management.models;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "gd_comentarios_doumentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdComentariosDoumentos.findAll", query = "SELECT g FROM GdComentariosDoumentos g")
    , @NamedQuery(name = "GdComentariosDoumentos.findByIdComentario", query = "SELECT g FROM GdComentariosDoumentos g WHERE g.idComentario = :idComentario")
    , @NamedQuery(name = "GdComentariosDoumentos.findByComentarioDocumento", query = "SELECT g FROM GdComentariosDoumentos g WHERE g.comentarioDocumento = :comentarioDocumento")})
public class GdComentariosDoumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_comentario")
    private Integer idComentario;
    @Column(name = "comentario_documento")
    private String comentarioDocumento;
    @JoinColumn(name = "documento_comentario", referencedColumnName = "id_document")
    @ManyToOne
    private GdDocumentos documentoComentario;
    @JoinColumn(name = "usuario_comentario", referencedColumnName = "rol_usuario")
    @ManyToOne
    private GdUsuario usuarioComentario;

    public GdComentariosDoumentos() {
    }

    public GdComentariosDoumentos(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentarioDocumento() {
        return comentarioDocumento;
    }

    public void setComentarioDocumento(String comentarioDocumento) {
        this.comentarioDocumento = comentarioDocumento;
    }

    public GdDocumentos getDocumentoComentario() {
        return documentoComentario;
    }

    public void setDocumentoComentario(GdDocumentos documentoComentario) {
        this.documentoComentario = documentoComentario;
    }

    public GdUsuario getUsuarioComentario() {
        return usuarioComentario;
    }

    public void setUsuarioComentario(GdUsuario usuarioComentario) {
        this.usuarioComentario = usuarioComentario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComentario != null ? idComentario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdComentariosDoumentos)) {
            return false;
        }
        GdComentariosDoumentos other = (GdComentariosDoumentos) object;
        if ((this.idComentario == null && other.idComentario != null) || (this.idComentario != null && !this.idComentario.equals(other.idComentario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdComentariosDoumentos[ idComentario=" + idComentario + " ]";
    }
    
}
