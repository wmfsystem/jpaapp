package com.fafidev.jpaapp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author willian
 */
@Entity
@Table(name = "contas")
public class Conta implements Serializable {

    @Id
    private Long ID;
    @Column(unique = true, nullable = false)
    private String numero;
    @Column(name = "digitoverificador")
    private String digitoVerificador;
    @Column(precision = 5, scale = 5)
    private BigDecimal saldo;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar(BigDecimal valor) {

    }

    public void sacar(BigDecimal valor) {

    }

    public void transferir(Conta contaDestino, BigDecimal valor) {

    }

    @Override
    public String toString() {
        return "Conta{" + "ID=" + ID + ", numero=" + numero + ", digitoVerificador=" + digitoVerificador + ", saldo=" + saldo + '}';
    }

}
