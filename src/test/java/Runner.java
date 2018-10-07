import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "C:\\Users\\Danilo Soarez\\eclipse-workspace\\ProjetoSeleniumCucumber\\src\\test\\resources\\feature\\inserir_conta.feature",
				tags = {"~@ignore"},
				monochrome = true,//N�o tem caracteres especiais no console
				snippets = SnippetType.CAMELCASE,// o nome dos metodos n�o usa _ ele separa usando sempre uma letra maiuscula na pr�xima palavra
				dryRun = false,//valida se os testes est�o OKs o padr�o � FALSE
				strict = false // Se adicionar outro passo vai falhar, o padr�o � FALSE
				)

public class Runner {

}
