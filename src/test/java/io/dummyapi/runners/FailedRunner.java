package io.dummyapi.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
       features ="target/rerun.txt",
        glue="io/dummyapi/step_defs"

)
public class FailedRunner {
}
