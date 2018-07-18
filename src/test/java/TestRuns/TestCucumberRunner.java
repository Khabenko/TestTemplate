package TestRuns;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@Ignore
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Feature",
        glue={"StepsDefenition"},
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE
)
public class TestCucumberRunner {
}
