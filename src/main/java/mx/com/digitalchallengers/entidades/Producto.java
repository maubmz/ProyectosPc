package mx.com.digitalchallengers.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id_producto", unique = true, nullable = false)
    private Long productoId;
    @Column(name = "nom_producto")
    private String nombreProducto;
    private Integer precio;

//    @ManyToMany(
//            mappedBy = "factura"
//    )
//    private List<Factura> facturas;
}
