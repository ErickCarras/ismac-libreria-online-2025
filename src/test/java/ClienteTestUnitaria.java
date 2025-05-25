import com.distribuida.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTestUnitaria {
   private Cliente cliente;


   @BeforeEach
   public void setUp() {
      cliente = new Cliente(1, "1734658743", "Juan", "Taipe", "Av. por ahi.", "0987523467", "jtaipe@correo.com");

   }

   @Test
   public void testClienteConstructorAndGetters() {
      assertAll("validar datos de cliente",
              () -> assertEquals(1, cliente.getIdCliente()),
              () -> assertEquals("1734658743", cliente.getCedula()),
              () -> assertEquals("Juan", cliente.getNombre()),
              () -> assertEquals("Taipe", cliente.getApellido()),
              () -> assertEquals("Av. por ahi.", cliente.getDireccion()),
              () -> assertEquals("0987523467", cliente.getTelefono()),
              () -> assertEquals("jtaipe@correo.com", cliente.getCorreo())

      );
   }


   @Test
    public void testClienteSetters(){
       cliente = new Cliente();

       cliente.setIdCliente(2);
       cliente.setCedula("1734658742");
       cliente.setNombre("Juan2");
       cliente.setApellido("Taipe2");
       cliente.setDireccion("Av. por ahi.2");
       cliente.setTelefono("0987523462");
       cliente.setCorreo("jtaipe2@correo.com");

       assertAll("validar datos de cliente",
               () -> assertEquals(2,cliente.getIdCliente()),
               () -> assertEquals("1734658742",cliente.getCedula()),
               () -> assertEquals("Juan2",cliente.getNombre()),
               () -> assertEquals("Taipe2",cliente.getApellido()),
               () -> assertEquals("Av. por ahi.2",cliente.getDireccion()),
               () -> assertEquals("0987523462",cliente.getTelefono()),
               () -> assertEquals("jtaipe2@correo.com",cliente.getCorreo())

       );

}

@Test
   public void testClienteToString(){
      String str = cliente.toString();

      assertAll("Validar datos de cliente",
              () -> assertTrue(str.contains("1")),
              () -> assertTrue(str.contains("1734658743")),
              () -> assertTrue(str.contains("Juan")),
              () -> assertTrue(str.contains("Taipe")),
              () -> assertTrue(str.contains("Av. por ahi.")),
              () -> assertTrue(str.contains("0987523467")),
              () -> assertTrue(str.contains("jtaipe@correo.com"))

      );

}


}
