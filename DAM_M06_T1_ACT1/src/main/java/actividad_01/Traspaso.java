package actividad_01;

/**
 *
 * @author jshev
 */
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;

public class Traspaso {
    public static void main(String[] args) {
        List<Incidencia> listaIncidencias = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("incidencias.txt"), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("%")) {
                    String[] parts = line.substring(1).trim().split(" ");
                    Incidencia inc = new Incidencia();
                    inc.setFechahora(parts[0] + " " + parts[1]);
                    inc.setOrigen(parts[2]);
                    inc.setDestino(parts[3]);
                    inc.setDetalle(reader.readLine().trim());
                    inc.setTipo(reader.readLine().trim());
                    listaIncidencias.add(inc);
                }
            }
        } catch (Exception e) { 
            // Imprime el stack trace para diagnóstico
            System.out.println("Error al leer el archivo de incidencias.");
            return; // Sale del método main para evitar intentar trabajar con datos potencialmente incompletos
        }

        try {
            Incidencias incidencias = new Incidencias();
            incidencias.setIncidencias(listaIncidencias);

            // Crear el contexto JAXB y el marshaller
            JAXBContext context = JAXBContext.newInstance(Incidencias.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

            // Escribir en el archivo XML
            marshaller.marshal(incidencias, new File("incidencias.xml"));

            // Mensaje de confirmación
            System.out.println("Archivo XML 'incidencias.xml' creado exitosamente.");
        } catch (JAXBException e) {
            // Imprime el stack trace para diagnóstico
            System.out.println("Error al crear el archivo XML.");
        }
    }
}
