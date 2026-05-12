import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



    @Test
    void testProcesarAdmin() {
    ProcesadorUsuarios pu = new ProcesadorUsuarios();
    // Aquí asumes que el método devuelve algo o imprime algo que puedas verificar
    assertTrue(pu.ejecutarProceso("Admin", 1));

}