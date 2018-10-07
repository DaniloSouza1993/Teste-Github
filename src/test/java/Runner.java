import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "C:\\Users\\Danilo Soarez\\eclipse-workspace\\ProjetoSeleniumCucumber\\src\\test\\resources\\feature\\inserir_conta.feature",
				tags = {"~@ignore"},
				monochrome = true,//Não tem caracteres especiais no console
				snippets = SnippetType.CAMELCASE,// o nome dos metodos não usa _ ele separa usando sempre uma letra maiuscula na próxima palavra
				dryRun = false,//valida se os testes estão OKs o padrão é FALSE
				strict = false // Se adicionar outro passo vai falhar, o padrão é FALSE
				)

public class Runner {

}
