package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:src/test/resources/relatorios",
        "json:src/test/resources/relatorios/cucumber.json",
        "junit:src/test/resources/relatorios/cucumber.xml" },
        features = "src/test/resources/features/buscarHundaCity.feature",
        // tags = {“@smoke”},
        monochrome = true,
        glue = { "steps" },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false)

public class RunBuscaHondaCity {

}