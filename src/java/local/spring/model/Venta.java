package local.spring.model;
// Generated 03/07/2017 01:54:50 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private int idventa;
     private Producto producto;
     private Usuario usuario;
     private Date fecha;
     private Integer factura;
     private String lugar;
     private Detalle detalle;

    public Venta() {
    }

	
    public Venta(Producto producto, Usuario usuario) {
        this.producto = producto;
        this.usuario = usuario;
    }
    public Venta(Producto producto, Usuario usuario, Date fecha, Integer factura, String lugar, Detalle detalle) {
       this.producto = producto;
       this.usuario = usuario;
       this.fecha = fecha;
       this.factura = factura;
       this.lugar = lugar;
       this.detalle = detalle;
    }
   
    public int getIdventa() {
        return this.idventa;
    }
    
    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getFactura() {
        return this.factura;
    }
    
    public void setFactura(Integer factura) {
        this.factura = factura;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Detalle getDetalle() {
        return this.detalle;
    }
    
    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }




}


