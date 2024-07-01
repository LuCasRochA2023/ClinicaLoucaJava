package entidades;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 */

@Entity(name = "pessoa")
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String cpf;
    private String rg;
    private String rua;
    private double numero;
    private String sexo;

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getRua() {
        return rua;
    }

    public double getNumero() {
        return numero;
    }

    public String getSexo() {
        return sexo;
    }
    // ...

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa() {
    }
}
