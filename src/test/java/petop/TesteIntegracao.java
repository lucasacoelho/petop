package petop;

import com.mycompany.petshop.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteIntegracao {

    @Test
    public void testCriarAnimal() {
        // Arrange (Preparação)
        String nome = "Rex";
        String especie = "Cachorro";
        String raca = "Labrador";
        int idade = 3;
        double peso = 15.5;
        String historicoSaude = "Nenhum histórico de doenças";

        // Act (Ação)
        Animal animal = new Animal(nome, especie, raca, idade, peso, historicoSaude);

        // Assert (Verificação)
        assertEquals(nome, animal.getNome());
        assertEquals(especie, animal.getEspecie());
        assertEquals(raca, animal.getRaca());
        assertEquals(idade, animal.getIdade());
        assertEquals(peso, animal.getPeso(), 0.01);
        assertEquals(historicoSaude, animal.getHistoricoSaude());
    }
}