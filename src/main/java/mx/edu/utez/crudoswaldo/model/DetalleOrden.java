package mx.edu.utez.crudoswaldo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detalles_orden")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_orden")
    private Integer idDetalleOrden;

    @ManyToOne
    @JoinColumn(name = "id_orden", nullable = false)
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_platillo", nullable = false)
    private Platillo platillo;

    private Integer cantidad;

    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    @Column(precision = 10, scale = 2)
    private BigDecimal subtotal;

    @Column(length = 150)
    private String notas;

    @Column(name = "estado_item")
    private String estadoItem;

    public DetalleOrden() {}

    public Integer getIdDetalleOrden() { return idDetalleOrden; }
    public void setIdDetalleOrden(Integer idDetalleOrden) { this.idDetalleOrden = idDetalleOrden; }
    public Orden getOrden() { return orden; }
    public void setOrden(Orden orden) { this.orden = orden; }
    public Platillo getPlatillo() { return platillo; }
    public void setPlatillo(Platillo platillo) { this.platillo = platillo; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public BigDecimal getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(BigDecimal precioUnitario) { this.precioUnitario = precioUnitario; }
    public BigDecimal getSubtotal() { return subtotal; }
    public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }
    public String getNotas() { return notas; }
    public void setNotas(String notas) { this.notas = notas; }
    public String getEstadoItem() { return estadoItem; }
    public void setEstadoItem(String estadoItem) { this.estadoItem = estadoItem; }
}
