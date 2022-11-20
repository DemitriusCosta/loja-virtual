package br.com.aideia.lojavirtual.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String cpf;

	@Temporal(TemporalType.DATE)
	private Date dataNascimneto;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimneto() {
		return dataNascimneto;
	}

	public void setDataNascimneto(Date dataNascimneto) {
		this.dataNascimneto = dataNascimneto;
	}

}
