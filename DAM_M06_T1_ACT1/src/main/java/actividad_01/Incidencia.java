package actividad_01;

/**
 *
 * @author jshev
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "incidencia")
@XmlType(propOrder = {"fechahora", "origen", "destino", "detalle", "tipo"})
public class Incidencia {
    private String fechahora;
    private String origen;
    private String destino;
    private String detalle;
    private String tipo;

    // Constructor vacío requerido por JAXB
    public Incidencia() {}

    // Getters y setters
    @XmlElement(name = "fechahora")
    public String getFechahora() { return fechahora; }
    public void setFechahora(String fechahora) { this.fechahora = fechahora; }

    @XmlElement(name = "origen")
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    @XmlElement(name = "destino")
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    @XmlElement(name = "detalle")
    public String getDetalle() { return detalle; }
    public void setDetalle(String detalle) { this.detalle = detalle; }

    @XmlElement(name = "tipo")
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}

