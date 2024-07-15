
package actividad_01;

/**
 *
 * @author jshev
 */
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "incidencias")
public class Incidencias {
    private List<Incidencia> incidencias;

    @XmlElement(name = "incidencia")
    public List<Incidencia> getIncidencias() { return incidencias; }
    public void setIncidencias(List<Incidencia> incidencias) { this.incidencias = incidencias; }
}


