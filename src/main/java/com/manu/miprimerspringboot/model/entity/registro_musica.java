package com.manu.miprimerspringboot.model.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "registroMusica")

public class registro_musica implements Serializable{
	
	@Id
	@Column(name = "idArtista")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idArtista;
	@Column(name = "nombreCompleto")
	private String nombreCompleto;
	@Column(name = "tituloCancion")
	private String tituloCancion;
	@Column(name = "generoMusical")
	private String generoMusical;
	@Column(name = "album")
	private String album;
	@Column(name = "fechaEstreno")
	private Date fechaEstreno;
	@Column(name = "duracionSeg")
	private Integer duracionSeg;
	public Integer getIdArtista() {
		return idArtista;
	}
	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getTituloCancion() {
		return tituloCancion;
	}
	public void setTituloCancion(String tituloCancion) {
		this.tituloCancion = tituloCancion;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public Integer getDuracionSeg() {
		return duracionSeg;
	}
	public void setDuracionSeg(Integer duracionSeg) {
		this.duracionSeg = duracionSeg;
	}
}
