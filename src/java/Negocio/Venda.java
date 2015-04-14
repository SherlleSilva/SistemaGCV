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
public class Venda {
    private long id;
    private double valor;
    private Date date;
    private double valorTotal;

    public Venda(double valor, Date date, double valorTotal, long id) {
        this.valor = valor;
        this.date = date;
        this.valorTotal = valorTotal;
        this.id = id;
    }

    public Venda() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
}
