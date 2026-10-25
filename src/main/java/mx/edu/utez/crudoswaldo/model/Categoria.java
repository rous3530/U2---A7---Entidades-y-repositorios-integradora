package mx.edu.utez.crudoswaldo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(length = 50)
    private String nombre;

    @Column(length = 200)
    private String descripcion;

    private Boolean activa;

    @OneToMany(mappedBy = "categoria")
    private List<Platillo> platillos;

    public Categoria() {}

    public Integer getIdCategoria() { return idCategoria; }
    public void setIdCategoria(Integer idCategoria) { this.idCategoria = idCategoria; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Boolean getActiva() { return activa; }
    public void setActiva(Boolean activa) { this.activa = activa; }
    public List<Platillo> getPlatillos() { return platillos; }
    public void setPlatillos(List<Platillo> platillos) { this.platillos = platillos; }
}
