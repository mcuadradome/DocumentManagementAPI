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
@Table(name = "gd_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GdUsuario.findAll", query = "SELECT g FROM GdUsuario g")
    , @NamedQuery(name = "GdUsuario.findByDocumentoUsuario", query = "SELECT g FROM GdUsuario g WHERE g.documentoUsuario = :documentoUsuario")
    , @NamedQuery(name = "GdUsuario.findByNombreUsuario", query = "SELECT g FROM GdUsuario g WHERE g.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "GdUsuario.findByApellidoUsuario", query = "SELECT g FROM GdUsuario g WHERE g.apellidoUsuario = :apellidoUsuario")
    , @NamedQuery(name = "GdUsuario.findByCorreoUsuario", query = "SELECT g FROM GdUsuario g WHERE g.correoUsuario = :correoUsuario")
    , @NamedQuery(name = "GdUsuario.findByCelularUsuario", query = "SELECT g FROM GdUsuario g WHERE g.celularUsuario = :celularUsuario")})
public class GdUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "documento_usuario")
    private String documentoUsuario;
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Column(name = "apellido_usuario")
    private String apellidoUsuario;
    @Column(name = "correo_usuario")
    private String correoUsuario;
    @Column(name = "celular_usuario")
    private String celularUsuario;
    @JoinColumn(name = "rol_usuario", referencedColumnName = "id_roles")
    @ManyToOne
    private GdRoles rolUsuario;
    @JoinColumn(name = "area_usuario", referencedColumnName = "id_area")
    @ManyToOne
    private GdArea areaUsuario;
    @JoinColumn(name = "cidad_usuario", referencedColumnName = "id_ciudad")
    @ManyToOne
    private GdCiudad cidadUsuario;
    @JoinColumn(name = "departamento_usuario", referencedColumnName = "id_departamento")
    @ManyToOne
    private GdDepartamento departamentoUsuario;
//    @OneToMany(mappedBy = "usuarioRadicado")
//    private List<GdDocumentos> gdDocumentosList;
//    @OneToMany(mappedBy = "usuarioComentario")
//    private List<GdComentariosDoumentos> gdComentariosDoumentosList;

    public GdUsuario() {
    }

    public GdUsuario(String documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public String getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(String documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getCelularUsuario() {
        return celularUsuario;
    }

    public void setCelularUsuario(String celularUsuario) {
        this.celularUsuario = celularUsuario;
    }

    public GdRoles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(GdRoles rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public GdArea getAreaUsuario() {
        return areaUsuario;
    }

    public void setAreaUsuario(GdArea areaUsuario) {
        this.areaUsuario = areaUsuario;
    }

    public GdCiudad getCidadUsuario() {
        return cidadUsuario;
    }

    public void setCidadUsuario(GdCiudad cidadUsuario) {
        this.cidadUsuario = cidadUsuario;
    }

    public GdDepartamento getDepartamentoUsuario() {
        return departamentoUsuario;
    }

    public void setDepartamentoUsuario(GdDepartamento departamentoUsuario) {
        this.departamentoUsuario = departamentoUsuario;
    }

//    @XmlTransient
//    public List<GdDocumentos> getGdDocumentosList() {
//        return gdDocumentosList;
//    }
//
//    public void setGdDocumentosList(List<GdDocumentos> gdDocumentosList) {
//        this.gdDocumentosList = gdDocumentosList;
//    }
//
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
        hash += (documentoUsuario != null ? documentoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GdUsuario)) {
            return false;
        }
        GdUsuario other = (GdUsuario) object;
        if ((this.documentoUsuario == null && other.documentoUsuario != null) || (this.documentoUsuario != null && !this.documentoUsuario.equals(other.documentoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GdUsuario[ documentoUsuario=" + documentoUsuario + " ]";
    }
    
}
