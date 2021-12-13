package com.amazontv.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before
public void beforescenario() {
System.out.println("before");
}
@After
public void afterScenario() {

System.out.println("after");

}


}
