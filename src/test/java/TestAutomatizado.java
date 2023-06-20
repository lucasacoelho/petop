import com.mycompany.petshop.Animal;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import static org.junit.Assert.*;

public class TestAutomatizado {

    private Animal animal;

    @Dado("que estou na página de adição de animais")
    public void irParaPaginaAdicaoAnimais() {
        // Implemente o código para navegar até a página de adição de animais
    }

    @Quando("eu preencho o formulário com as informações do animal")
    public void preencherFormularioAnimal() {
        // Simulando o preenchimento do formulário com as informações do animal
        String nome = "Rex";
        String especie = "Cachorro";
        String raca = "Labrador";
        int idade = 3;
        double peso = 15.5;
        String historicoSaude = "Nenhum histórico de doenças";
        animal = new Animal(nome, especie, raca, idade, peso, historicoSaude);
    }

    @Quando("eu clico no botão {string}")
    public void clicarBotao(String botao) {
        // Implemente o código para clicar no botão específico
    }

    @Entao("o animal é adicionado com sucesso")
    public void verificarAnimalAdicionado() {
        // Implemente o código para verificar se o animal foi adicionado com sucesso
        assertNotNull(animal);
        assertEquals("Rex", animal.getNome());
        assertEquals("Cachorro", animal.getEspecie());
        assertEquals("Labrador", animal.getRaca());
        assertEquals(3, animal.getIdade());
        assertEquals(15.5, animal.getPeso(), 0.01);
        assertEquals("Nenhum histórico de doenças", animal.getHistoricoSaude());
    }
}