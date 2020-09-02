$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/geerthanakannan/eclipse-workspace/MoneyControlCucumber/src/test/resources/resources/Features/testcase.feature");
formatter.feature({
  "line": 2,
  "name": "MoneyCtrlSpecial",
  "description": "",
  "id": "moneyctrlspecial",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MoneyCtrl"
    }
  ]
});
formatter.background({
  "line": 3,
  "name": "user logged in the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is in the home page of money controls and get the title of page",
  "keyword": "Given "
});
formatter.match({
  "location": "MoneyCtrlBackroundStep.the_user_is_in_the_home_page_of_money_controls_and_get_the_title_of_page()"
});
formatter.result({
  "duration": 4065172276,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "clicking on Special tab on MoneyCtrl Page",
  "description": "",
  "id": "moneyctrlspecial;clicking-on-special-tab-on-moneyctrl-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tc_01_Specials"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "move and hover over specials",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on grow your business image source and then comeback to original page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close app",
  "keyword": "Then "
});
formatter.match({
  "location": "MoneyCtrlSpecialsStep.page_is_opened()"
});
formatter.result({
  "duration": 12015494,
  "status": "passed"
});
formatter.match({
  "location": "MoneyCtrlSpecialsStep.move_and_hover_over_specials()"
});
formatter.result({
  "duration": 6105642546,
  "status": "passed"
});
formatter.match({
  "location": "MoneyCtrlSpecialsStep.click_on_grow_your_business_image_source_and_then_comeback_to_original_page()"
});
formatter.result({
  "duration": 8797491858,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d84.0.4147.125)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1819:21b7:9bc9:e69d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u002711.0.8\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.125, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/sm/r7djlz193cg...}, goog:chromeOptions: {debuggerAddress: localhost:49486}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 47f1af7163ede06db2addd9ed864eeff\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getWindowHandle(RemoteWebDriver.java:472)\n\tat com.pages.MoneyCtrlSpecials.clickon_grow_your_business(MoneyCtrlSpecials.java:50)\n\tat com.stepDefinition.MoneyCtrlSpecialsStep.click_on_grow_your_business_image_source_and_then_comeback_to_original_page(MoneyCtrlSpecialsStep.java:35)\n\tat ✽.Then click on grow your business image source and then comeback to original page(/Users/geerthanakannan/eclipse-workspace/MoneyControlCucumber/src/test/resources/resources/Features/testcase.feature:18)\n",
  "status": "failed"
});
formatter.match({
  "location": "MoneyCtrlSpecialsStep.close_app()"
});
formatter.result({
  "status": "skipped"
});
});