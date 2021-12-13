$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TvPurchase.feature");
formatter.feature({
  "name": "Television",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tv"
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
  "name": "User launches application",
  "keyword": "Given "
});
formatter.match({
  "location": "TVPurchaseSteps.user_launches_Amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv Purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.step({
  "name": "User search tv",
  "keyword": "When "
});
formatter.match({
  "location": "TVPurchaseSteps.user_search_tv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on tv name",
  "keyword": "And "
});
formatter.match({
  "location": "TVPurchaseSteps.user_click_on_tv_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Buy now",
  "keyword": "Then "
});
formatter.match({
  "location": "TVPurchaseSteps.user_click_on_Buy_now()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User launches application",
  "keyword": "Given "
});
formatter.match({
  "location": "TVPurchaseSteps.user_launches_Amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv Purchase by using one dim list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.step({
  "name": "User search tv by one dim list",
  "rows": [
    {
      "cells": [
        "Samsung 108 cm",
        "Mi 80 cm",
        "LG 80 cm"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TVPurchaseSteps.user_search_tv_by_one_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on tv name",
  "keyword": "And "
});
formatter.match({
  "location": "TVPurchaseSteps.user_click_on_tv_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Buy now",
  "keyword": "Then "
});
formatter.match({
  "location": "TVPurchaseSteps.user_click_on_Buy_now()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User launches application",
  "keyword": "Given "
});
formatter.match({
  "location": "TVPurchaseSteps.user_launches_Amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv Purchase by using one dim map",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.step({
  "name": "User search tv by one dim map",
  "rows": [
    {
      "cells": [
        "1",
        "Samsung 108 cm"
      ]
    },
    {
      "cells": [
        "2",
        "Mi 80 cm"
      ]
    },
    {
      "cells": [
        "3",
        "LG 80 cm"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TVPurchaseSteps.user_search_tv_by_one_dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on tv name",
  "keyword": "And "
});
formatter.match({
  "location": "TVPurchaseSteps.user_click_on_tv_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Buy now",
  "rows": [
    {
      "cells": [
        "Tv Name"
      ]
    },
    {
      "cells": [
        "Samsung 108 cm"
      ]
    },
    {
      "cells": [
        "Mi 80 cm"
      ]
    },
    {
      "cells": [
        "LG 80 cm"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TVPurchaseSteps.user_click_on_Buy_now()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});