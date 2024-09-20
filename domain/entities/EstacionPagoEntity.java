package  com.example.demo.domain.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "estacion_pago")
public class EstacionPagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_estacionpago")
    private int idEstacionPago;

    @Column(name = "numero_estacion", nullable = false)
    private int numeroEstacion;

    @Column(name = "ID_movcaja", nullable = false)
    private int idMovCaja;

    // Constructores
    public EstacionPagoEntity() {}

    public EstacionPagoEntity(int numeroEstacion, int idMovCaja) {
        this.numeroEstacion = numeroEstacion;
        this.idMovCaja = idMovCaja;
    }

    // Getters y Setters
    public int getIdEstacionPago() {
        return idEstacionPago;
    }

    public void setIdEstacionPago(int idEstacionPago) {
        this.idEstacionPago = idEstacionPago;
    }

    public int getNumeroEstacion() {
        return numeroEstacion;
    }

    public void setNumeroEstacion(int numeroEstacion) {
        this.numeroEstacion = numeroEstacion;
    }

    public int getIdMovCaja() {
        return idMovCaja;
    }

    public void setIdMovCaja(int idMovCaja) {
        this.idMovCaja = idMovCaja;
    }
}
