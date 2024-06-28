package domainapp.webapp.integtests.bdd.glue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import domainapp.modules.simple.dom.so.SimpleObject;
import domainapp.modules.simple.dom.so.SimpleObjects;
import domainapp.webapp.integtests.bdd.AcceptanceTest_Spec;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import jakarta.inject.Inject;

@CucumberContextConfiguration
@SpringBootTest(classes = AcceptanceTest_Spec.class)
public class SimpleObjectsSteps extends AcceptanceTest_Spec{
	@Inject
	SimpleObjects simpleObjects;
	
	Object lastReferenced = null;
	List resultList;
@Given("There are {int} SimpleObjects")
public void there_are_simple_objects(Integer int1) {
        final SimpleObject fred = wrap(simpleObjects).create("Fred");
	for(int i = 0; i < int1; i++) {
		wrap(simpleObjects).create("object" + int1);

	}
	lastReferenced = simpleObjects;

}
@When("I List them")
public void i_list_them() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
	resultList = (List)lastReferenced.getClass().getMethod("listAll", null).invoke(lastReferenced, null);
}
@Then("I count {int} SimpleObjects")
public void i_count_simple_objects(Integer int1) {
	assertEquals(int1, resultList.size());
}

static class Dog {
	public String name;
}

Dog myDog = null;
@Given("I have a dog")
public void i_have_a_dog() {
	myDog = new Dog();

}
@When("I name my dog {string}")
public void i_name_my_dog(String string) {
	myDog.name = string;
}
@Then("my dog's name is {string}")
public void my_dog_s_name_is(String string) {
	assertEquals(myDog.name, string);
}
}