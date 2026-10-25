package mx.edu.utez.crudoswaldo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "asignaciones")
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion")
    private Integer idAsignacion;

    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "id_usuario_mesero", nullable = false)
    private Usuario usuarioMesero;

    @Column(name = "num_comensales")
    private Integer numComensales;

    @Column(name = "fecha_hora_inicio")
    private LocalDateTime fechaHoraInicio;

    @Column(name = "fecha_hora_fin")
    private LocalDateTime fechaHoraFin;

    @Column(name = "estado_asignacion")
    private String estadoAsignacion;

    public Asignacion() {}

    public Integer getIdAsignacion() { return idAsignacion; }
    public void setIdAsignacion(Integer idAsignacion) { this.idAsignacion = idAsignacion; }
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
    public Usuario getUsuarioMesero() { return usuarioMesero; }
    public void setUsuarioMesero(Usuario usuarioMesero) { this.usuarioMesero = usuarioMesero; }
    public Integer getNumComensales() { return numComensales; }
    public void setNumComensales(Integer numComensales) { this.numComensales = numComensales; }
    public LocalDateTime getFechaHoraInicio() { return fechaHoraInicio; }
    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) { this.fechaHoraInicio = fechaHoraInicio; }
    public LocalDateTime getFechaHoraFin() { return fechaHoraFin; }
    public void setFechaHoraFin(LocalDateTime fechaHoraFin) { this.fechaHoraFin = fechaHoraFin; }
    public String getEstadoAsignacion() { return estadoAsignacion; }
    public void setEstadoAsignacion(String estadoAsignacion) { this.estadoAsignacion = estadoAsignacion; }
}
