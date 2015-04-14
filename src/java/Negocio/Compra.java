/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author Rackell
 */
public class Compra {

    private long id;
    private Date data;
    private double quantidadeKg;
    private double valorKg;
    private double mediaKg;

    public Compra() {
    }

    public Compra(long id, Date data, double quantidadeKg, double valorKg, double mediaKg) {
        this.id = id;
        this.data = data;
        this.quantidadeKg = quantidadeKg;
        this.valorKg = valorKg;
        this.mediaKg = mediaKg;
    }

    private double valorTotal(double quantidadeKg, double valorKg) {
        double valorTotal = 0;
        valorTotal = quantidadeKg * valorKg;
        return valorTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getQuantidadeKg() {
        return quantidadeKg;
    }

    public void setQuantidadeKg(double quantidadeKg) {
        this.quantidadeKg = quantidadeKg;
    }

    public double getValorKg() {
        return valorKg;
    }

    public void setValorKg(double valorKg) {
        this.valorKg = valorKg;
    }

    public double getMediaKg() {
        return mediaKg;
    }

    public void setMediaKg(double mediaKg) {
        this.mediaKg = mediaKg;
    }

}
