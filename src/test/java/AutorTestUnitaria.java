import com.distribuida.entities.Autor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutorTestUnitaria {

    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = new Autor(1, "Isabel", "Allende", "Chile", "Santiago", "987654321", "isabel@example.com");
    }

    @Test
    public void testAutorConstructorAndGetters() {
        assertAll("validar datos de cliente",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Isabel", autor.getNombre()),
                () -> assertEquals("Allende", autor.getApellido()),
                () -> assertEquals("Chile", autor.getPais()),
                () -> assertEquals("Santiago", autor.getDireccion()),
                () -> assertEquals("987654321", autor.getTelefono()),
                () -> assertEquals("isabel@example.com", autor.getCorreo())

        );
    }

    @Test
    public void testAutorSetters(){
        autor = new Autor();

        autor.setIdAutor(2);
        autor.setNombre("Anita");
        autor.setApellido("Caza");
        autor.setPais("México");
        autor.setDireccion("Ciudad de México");
        autor.setTelefono("0987523563");
        autor.setCorreo("ana@correo.com");

        assertAll("validar datos de autor",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Anita", autor.getNombre()),
                () -> assertEquals("Caza", autor.getApellido()),
                () -> assertEquals("México", autor.getPais()),
                () -> assertEquals("Ciudad de México", autor.getDireccion()),
                () -> assertEquals("0987523563", autor.getTelefono()),
                () -> assertEquals("ana@correo.com", autor.getCorreo())

        );

        }

    @Test
    public void testAutorToString(){
        String str = autor.toString();

        assertAll("Validar datos de autor",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Isabel")),
                () -> assertTrue(str.contains("Allende")),
                () -> assertTrue(str.contains("Chile")),
                () -> assertTrue(str.contains("Santiago")),
                () -> assertTrue(str.contains("987654321")),
                () -> assertTrue(str.contains("isabel@example.com"))

        );

    }

    }