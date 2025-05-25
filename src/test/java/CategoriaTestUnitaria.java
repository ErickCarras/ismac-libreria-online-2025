import com.distribuida.entities.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoriaTestUnitaria {
    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(1, "Novela", "Libros de narrativa extensa, generalmente ficticios.");
    }

    @Test
    public void testCategoriaConstructorAndGetters() {
        assertAll("validar datos de categoria",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Novela", categoria.getCategoria()),
                () -> assertEquals("Libros de narrativa extensa, generalmente ficticios.", categoria.getDescripcion())
        );
    }

    @Test
    public void testCategoriaSetters(){
        categoria = new Categoria();

        categoria.setIdCategoria(2);
        categoria.setCategoria("Poesia");
        categoria.setDescripcion("Drama");

        assertAll("validar datos de categoria",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Poesia", categoria.getCategoria()),
                () -> assertEquals("Drama", categoria.getDescripcion())
        );

    }

    @Test
    public void testCategoriaToString(){
        String str = categoria.toString();

        assertAll("Validar datos de categoria",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Novela")),
                () -> assertTrue(str.contains("Libros de narrativa extensa, generalmente ficticios."))

        );
}

}