package com.system.freshWear_ecommerce_system;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber.json"},
        features="classpath:features"

)
public class ItemRunnerTest {
}
