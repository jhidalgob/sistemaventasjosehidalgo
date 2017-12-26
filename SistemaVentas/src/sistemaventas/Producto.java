/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

/**
 *
 * @author USUARIO
 */
public class Producto {
    
    private String codigo;
    private String descripcion;
    private int precio;
    private int stockminimo;
    private int stockactual;

    public Producto() {
    }

    public Producto(String codigo, String descripcion, int precio, int stockminimo, int stockactual) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockminimo = stockminimo;
        this.stockactual = stockactual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStockminimo() {
        return stockminimo;
    }

    public void setStockminimo(int stockminimo) {
        this.stockminimo = stockminimo;
    }

    public int getStockactual() {
        return stockactual;
    }

    public void setStockactual(int stockactual) {
        this.stockactual = stockactual;
    }
    
    
    
    
    
}
