$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Search.feature");
formatter.feature({
  "name": "Search box and filter option tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search by product name anf filter by price range",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewCase"
    }
  ]
});
formatter.step({
  "name": "user search by \"\u003cproduct name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "filter by \u003cmin price\u003e and \u003cmax price\u003e values",
  "keyword": "And "
});
formatter.step({
  "name": "price of products listed should be between the filter range",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product name",
        "min price",
        "max price"
      ]
    },
    {
      "cells": [
        "Apple MacBook Pro (16-Inch, 16GB RAM, 512GB Storage) - Space Gray",
        "2000",
        "3000"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the Amazon homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "step.SearchResultSteps.user_on_the_Amazon_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search by product name anf filter by price range",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewCase"
    }
  ]
});
formatter.step({
  "name": "user search by \"Apple MacBook Pro (16-Inch, 16GB RAM, 512GB Storage) - Space Gray\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.SearchResultSteps.user_search_by(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "filter by 2000 and 3000 values",
  "keyword": "And "
});
formatter.match({
  "location": "step.SearchResultSteps.filter_by_and_values(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price of products listed should be between the filter range",
  "keyword": "Then "
});
formatter.match({
  "location": "step.SearchResultSteps.price_of_products_listed_should_be_between_the_filter_range()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});