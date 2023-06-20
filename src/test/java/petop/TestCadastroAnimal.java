package petop;

import com.mycompany.petshop.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCadastroAnimal {

    @Test
    public void testGetSetNome() {
        // Arrange (Preparação)
        String nome = "Rex";
        Animal animal = new Animal("", "", "", 0, 0.0, "");

        // Act (Ação)
        animal.setNome(nome);
        String resultado = animal.getNome();

        // Assert (Verificação)
        assertEquals(nome, resultado);
    }
}
