package domainapp.webapp.integtests.bdd.glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.ScenarioScope;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.Map;

import org.apache.causeway.applib.services.iactnlayer.InteractionService;

import org.springframework.stereotype.Service;

@ScenarioScope
public class ScenarioContext {

    private final Map<String, Object> senarioData = new HashMap<>();

    public ScenarioContext() {
    }

    @Inject InteractionService interactionService;

    @Before
    public void init() {
        interactionService.openInteraction();
    }

    @After
    public void destroy() {
        interactionService.closeInteractionLayers();
    }

    public void setData(String key, Object value) {
        senarioData.put(key, value);
    }

    public <T> T getData(String key, Class<T> clazz) {
        return clazz.cast(senarioData.get(key));
    }
}