package mx.edu.utez.crudoswaldo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservaciones")
public class Reservacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion")
    private Integer idReservacion;

    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "id_usuario_registro", nullable = false)
    private Usuario usuarioRegistro;

    @Column(name = "nombre_cliente", length = 100)
    private String nombreCliente;

    @Column(name = "telefono_cliente", length = 20)
    private String telefonoCliente;

    @Column(name = "num_comensales")
    private Integer numComensales;

    @Column(name = "fecha_hora_reservacion")
    private LocalDateTime fechaHoraReservacion;

    @Column(name = "estado_reservacion")
    private String estadoReservacion;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    public Reservacion() {}

    public Integer getIdReservacion() { return idReservacion; }
    public void setIdReservacion(Integer idReservacion) { this.idReservacion = idReservacion; }
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
    public Usuario getUsuarioRegistro() { return usuarioRegistro; }
    public void setUsuarioRegistro(Usuario usuarioRegistro) { this.usuarioRegistro = usuarioRegistro; }
    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }
    public String getTelefonoCliente() { return telefonoCliente; }
    public void setTelefonoCliente(String telefonoCliente) { this.telefonoCliente = telefonoCliente; }
    public Integer getNumComensales() { return numComensales; }
    public void setNumComensales(Integer numComensales) { this.numComensales = numComensales; }
    public LocalDateTime getFechaHoraReservacion() { return fechaHoraReservacion; }
    public void setFechaHoraReservacion(LocalDateTime fechaHoraReservacion) { this.fechaHoraReservacion = fechaHoraReservacion; }
    public String getEstadoReservacion() { return estadoReservacion; }
    public void setEstadoReservacion(String estadoReservacion) { this.estadoReservacion = estadoReservacion; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(LocalDateTime fechaCreacion) { this.fechaCreacion = fechaCreacion; }
}
