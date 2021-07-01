$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/White.feature");
formatter.feature({
  "line": 2,
  "name": "Validate White Functionality",
  "description": "",
  "id": "validate-white-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@White"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "\"white\" button exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "white",
      "offset": 1
    }
  ],
  "location": "BackgroundColorStepDef.button_exists(String)"
});
formatter.result({
  "duration": 3604242200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "1 User should be able to change background color to white",
  "description": "",
  "id": "validate-white-functionality;1-user-should-be-able-to-change-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User clicks on the white button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Background will change to \"white\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDef.user_clicks_on_the_white_button()"
});
formatter.result({
  "duration": 108035600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "white",
      "offset": 27
    }
  ],
  "location": "BackgroundColorStepDef.background_will_change_to_sky_blue(String)"
});
formatter.result({
  "duration": 3478201700,
  "status": "passed"
});
});