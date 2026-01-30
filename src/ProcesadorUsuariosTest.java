import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ProcesadorUsuariosTest {

    @Test
    public void testProcesarLista() {
        // Crear instancia de la clase a testear
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();

        // Preparar datos de prueba
        List<String> usuarios = Arrays.asList(
            "Alice:1",   // Admin
            "Bob:2",     // Invitado
            "Charlie:1", // Admin
            "Diana:2"    // Invitado
        );

        // Resultado esperado según la lógica actual
        String esperado = "Admins: Alice,Charlie, | Invitados: Bob,Diana,";
        
        // Ejecutar método
        String resultado = procesador.procesarLista(usuarios);

        // Verificar que el resultado coincide con lo esperado
        assertEquals(esperado, resultado);
    }
}
