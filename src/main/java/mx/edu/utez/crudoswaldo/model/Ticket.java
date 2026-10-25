package mx.edu.utez.crudoswaldo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Integer idTicket;

    @ManyToOne
    @JoinColumn(name = "id_orden", nullable = false)
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_usuario_mesero", nullable = false)
    private Usuario usuarioMesero;

    @Column(name = "fecha_hora_emision")
    private LocalDateTime fechaHoraEmision;

    @Column(precision = 10, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "impuesto_iva", precision = 10, scale = 2)
    private BigDecimal impuestoIva;

    @Column(precision = 10, scale = 2)
    private BigDecimal descuento;

    @Column(precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "forma_pago")
    private String formaPago;

    @Column(name = "monto_recibido", precision = 10, scale = 2)
    private BigDecimal montoRecibido;

    @Column(precision = 10, scale = 2)
    private BigDecimal cambio;

    public Ticket() {}

    public Integer getIdTicket() { return idTicket; }
    public void setIdTicket(Integer idTicket) { this.idTicket = idTicket; }
    public Orden getOrden() { return orden; }
    public void setOrden(Orden orden) { this.orden = orden; }
    public Usuario getUsuarioMesero() { return usuarioMesero; }
    public void setUsuarioMesero(Usuario usuarioMesero) { this.usuarioMesero = usuarioMesero; }
    public LocalDateTime getFechaHoraEmision() { return fechaHoraEmision; }
    public void setFechaHoraEmision(LocalDateTime fechaHoraEmision) { this.fechaHoraEmision = fechaHoraEmision; }
    public BigDecimal getSubtotal() { return subtotal; }
    public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }
    public BigDecimal getImpuestoIva() { return impuestoIva; }
    public void setImpuestoIva(BigDecimal impuestoIva) { this.impuestoIva = impuestoIva; }
    public BigDecimal getDescuento() { return descuento; }
    public void setDescuento(BigDecimal descuento) { this.descuento = descuento; }
    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }
    public String getFormaPago() { return formaPago; }
    public void setFormaPago(String formaPago) { this.formaPago = formaPago; }
    public BigDecimal getMontoRecibido() { return montoRecibido; }
    public void setMontoRecibido(BigDecimal montoRecibido) { this.montoRecibido = montoRecibido; }
    public BigDecimal getCambio() { return cambio; }
    public void setCambio(BigDecimal cambio) { this.cambio = cambio; }
}
