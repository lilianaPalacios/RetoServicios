package in.swagger.petstore.certification.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/PlaceAnOrder.feature",
        glue = "in.swagger.petstore.certification.stepdefinition",
        snippets = SnippetType.CAMELCASE
)

public class PlaceAnOrderRunner {
}
