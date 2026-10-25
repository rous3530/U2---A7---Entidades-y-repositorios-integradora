package mx.edu.utez.crudoswaldo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private Integer idOrden;

    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "id_usuario_mesero", nullable = false)
    private Usuario usuarioMesero;

    @ManyToOne
    @JoinColumn(name = "id_asignacion")
    private Asignacion asignacion;

    @ManyToOne
    @JoinColumn(name = "id_reservacion")
    private Reservacion reservacion;

    @Column(name = "fecha_hora_apertura")
    private LocalDateTime fechaHoraApertura;

    @Column(name = "fecha_hora_cierre")
    private LocalDateTime fechaHoraCierre;

    @Column(name = "estado_orden")
    private String estadoOrden;

    @Column(name = "notas_generales", length = 255)
    private String notasGenerales;

    public Orden() {}

    public Integer getIdOrden() { return idOrden; }
    public void setIdOrden(Integer idOrden) { this.idOrden = idOrden; }
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
    public Usuario getUsuarioMesero() { return usuarioMesero; }
    public void setUsuarioMesero(Usuario usuarioMesero) { this.usuarioMesero = usuarioMesero; }
    public Asignacion getAsignacion() { return asignacion; }
    public void setAsignacion(Asignacion asignacion) { this.asignacion = asignacion; }
    public Reservacion getReservacion() { return reservacion; }
    public void setReservacion(Reservacion reservacion) { this.reservacion = reservacion; }
    public LocalDateTime getFechaHoraApertura() { return fechaHoraApertura; }
    public void setFechaHoraApertura(LocalDateTime fechaHoraApertura) { this.fechaHoraApertura = fechaHoraApertura; }
    public LocalDateTime getFechaHoraCierre() { return fechaHoraCierre; }
    public void setFechaHoraCierre(LocalDateTime fechaHoraCierre) { this.fechaHoraCierre = fechaHoraCierre; }
    public String getEstadoOrden() { return estadoOrden; }
    public void setEstadoOrden(String estadoOrden) { this.estadoOrden = estadoOrden; }
    public String getNotasGenerales() { return notasGenerales; }
    public void setNotasGenerales(String notasGenerales) { this.notasGenerales = notasGenerales; }
}
