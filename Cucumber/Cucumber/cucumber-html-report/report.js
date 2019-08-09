$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "\r\n I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Test addition",
  "description": "",
  "id": "title-of-your-feature;test-addition",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@BDD1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "i have two numbers as 6 and 5",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i add these numbers",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "result should be 11",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 22
    },
    {
      "val": "5",
      "offset": 28
    }
  ],
  "location": "StepDefinition.iHaveTwoNumbers(int,int)"
});
formatter.result({
  "duration": 186443800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iAddTheseNumbers()"
});
formatter.result({
  "duration": 32800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 17
    }
  ],
  "location": "StepDefinition.resultShouldBe(int)"
});
formatter.result({
  "duration": 2161000,
  "status": "passed"
});
});