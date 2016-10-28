$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/cucumber/script/test.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 65271927326,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.match({
  "location": "Test.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 2839749543,
  "status": "passed"
});
formatter.after({
  "duration": 31996380,
  "status": "passed"
});
});