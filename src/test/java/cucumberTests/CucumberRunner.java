package cucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "cucumberTests",
        tags = "@smoke"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
