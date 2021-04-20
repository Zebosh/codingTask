# API Testing Exercise

#### _Prepared by Zebo Narimanova_ _(QA Test Engineer)_
[Linkedin Profile: https://www.linkedin.com/in/zebonarimanova/](https://www.linkedin.com/in/zebonarimanova/)


## Framework
#### is based on Rest Assured with Cucumber BDD(JUnit Assertions)
---
### System Requirements
* Build tool- Maven

* System Requirements- Java 8+ SDK

---
### TASK:
#### Using Rest-Assured, Cucumber, and Java, create a scenario to validate the specific user information.
---
API base url: `https://dummyapi.io/data/api/`

API endpoint: `/user/{userId}`

---
## Test RUN
***Notes:*** to run the scenarios, @user tag in the CukesRunner class

***1. Way***

 * Go  **src->test->java->io->dummyapi->runners->CukesRunner** and RUN
 * To generate "HTML Cucumber Report":
 >Open Maven  right side panel-> Double Click on
 >Project's Lifecycle-> click "verify"

***2. Way***
Run from command line-> invoke `mvn clean verify`
---
## Test Reports Locations

1- Cucumber HTML Plugin Reports target -> cucumber-html-reports > overview-steps.html (Right Click and Open in any Browser )
---

2021 April &copy Zebo Narimanova
