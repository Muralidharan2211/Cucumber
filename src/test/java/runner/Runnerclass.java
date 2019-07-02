package runner;
import java.util.*;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/resources/sample26.feature"},glue= "Stepdef",
plugin="json:target/cucumber.json")
//plugin="junit:target/xmlreport.xml",tags={"@smoke,@regression"})
public class Runnerclass {

}
