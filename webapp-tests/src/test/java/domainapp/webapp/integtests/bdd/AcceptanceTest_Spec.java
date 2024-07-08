package domainapp.webapp.integtests.bdd;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

import domainapp.webapp.integtests.WebAppIntegTestAbstract;
import domainapp.webapp.integtests.bdd.glue.ScenarioContext;
import io.cucumber.junit.platform.engine.Constants;

@SpringBootConfiguration
@EnableAutoConfiguration
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("domainapp/webapp/integtests/bdd/glue")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/java/domainapp/webapp/integtests/bdd/features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "domainapp/webapp/integtests/bdd/glue")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@main")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/cucumber.html")
@Import({
})
//@Import({
//
//    CausewayModuleCoreRuntimeServices.class,
//    CausewayModuleSecurityBypass.class,
//    CausewayModulePersistenceJdoDatanucleus.class,
//    CausewayModuleTestingFixturesApplib.class,
//    CausewayModuleTestingSpecSupportApplib.class,
//
//
//    SimpleModule.class
//
//})
//@PropertySources({
//    @PropertySource(CausewayPresets.H2InMemory_withUniqueSchema),
//    @PropertySource(CausewayPresets.DatanucleusAutocreateNoValidate),
//    @PropertySource(CausewayPresets.UseLog4j2Test),
//})
//@ActiveProfiles("test")
//@DirtiesContext
//@Transactional

public class AcceptanceTest_Spec extends WebAppIntegTestAbstract{

}
