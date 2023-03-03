package Exam_Runer;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/JQAAcademy/JavaAutomation/src/features",
        glue = {"Exam_HookTest", "Exam_Helper", "Exam_PageObject"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true)
//features = "C:/JQAAcademy/JavaAutomation/src/features
public class RunnerExam {
}
/*
След като вече имате написан тест сценарий от Homework 11 реализиран с помоща на Gherkin,
 започнете с автоматизирането му с всичко научено до тук в модула.
  Използвайте Java, Selenium, JUnit, Cucumber, OOP концепциите,
  Page Object Model, Assert class, Action class, Waits and Webelements interface in Selenium (get text(),
  isEnabled()) методите при реализиране на задачата.
  Поставете вашия тест в feature file (в папка resources/features) и измислете таг,
  който ще стартира теста и ще стои до вашия сценарий.
  Оформете вашия pom.xml файл спрямо нужните технологии описани в картите.
  Създайте Cucumber Runner class и необходимите конфигурации с всичко необходимо,
  така че да можете да рънвате своите тестове чрез този клас.
  Да се направи клас за StepDefinition, в който да се създават/имплементират всички стъпки,
  може да имате и помощен Util клас, в който се изчисляват проверки ,калкиулации, и всички помощни методи,
  които не са директни стъпки, целта е кода за стъпките да бъде максимално изчистен и прегледен.
  Да се генерира index.html репорт от теста,
 */
