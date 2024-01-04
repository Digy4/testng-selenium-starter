# testng-selenium-starter
TestNG and Selenium starter to use with DigyRunner

[TestNG](https://testng.org) and [Selenium](https://www.selenium.dev/) Integration with DigyRunner to be able to run against any Remote selenium grid and visualise in Digy Dashboard.


![Digy4 Logo](https://digy4.com/wp-content/uploads/2021/12/logo.png)

## Register at [Digy4](https://dashboard.digy4.com)
- Register and get all the information required to be able to successfully run this demo test

## How to build and run using maven
- How to install maven https://maven.apache.org/install.html

### Try Digy4 Pre-Integrated StarterKit and View Results Instantly in the Dashboard
- Have you created an account with DigyDashboard? Please click https://dashboard.digy4.com to create one
- Login to your account and click on Admin Panel -> Projects -> Add Project to the bottom left section of the dashboard
- Add a Project name that (eg: demo) and other details and submit it
- Click Profile under user icon on the top right section of the dashboard
- Under Credentials section, copy Client ID and Client Secret and have it somewhere safe
- Clone the repository. Run `git clone https://github.com/Digy4/testng-selenium-starter`
- `cd testng-selenium-starter`
- For -Ddigy4.projectName=, use the project name you have created above (eg: Demo)
- For digy4.client_id use the client ID and digy4.client_secret, use the client secret from above
- ` mvn clean install -Ddigy4.framework=testng -Ddigy4.starter.parallel=classes -Ddigy4.teamName=Avengers -Ddigy4.projectName=demo -Ddigy4.testType=WEB -Ddigy4.moduleName=LocalBrowser -Ddigy4.suiteName=integration -Ddigy4.threads=2 -Ddigy4.browser=chrome  -Ddigy4.cloudFarm=CUSTOM -Ddigy4.localBrowser=chrome -Ddigy4.client_id= -Ddigy4.client_secret=`
- Once this has completed, you can see the results in the DigyDashboard https://dashboard.digy4.com
### [Details steps available here](https://help.digy4.com/docs/digy-dashboard/digyrunner-integration/selenium-testng/)

## Configurations
- Supply Hub URL for any remote/local selenium grid `digy4.hubUrl` in `src/test/resources/digy4.config.properties` file or pass via -Ddigy4.hubUrl via command line
- More details on parameters https://help.digy4.com/docs/digy-dashboard/digyrunner-integration/

## Run the tests

### For running tests with configuration parallel=classes
- Run `mvn clean install -Ddigy4.starter.parallel=classes -Ddigy4.framework=testng -Ddigy4.teamName=Avengers -Ddigy4.projectName=Demo -Ddigy4.testType=WEB -Ddigy4.moduleName=LocalBrowser -Ddigy4.suiteName=integration -Ddigy4.threads=2 -Ddigy4.browser=chrome  -Ddigy4.cloudFarm=CUSTOM -Ddigy4.localBrowser=chrome -Ddigy4.client_id= -Ddigy4.client_secret=`

### For running tests with configuration parallel=methods
- Run `mvn clean install -Ddigy4.starter.parallel=methods -Ddigy4.framework=testng -Ddigy4.teamName=Avengers -Ddigy4.projectName=Demo -Ddigy4.testType=WEB -Ddigy4.moduleName=LocalBrowser -Ddigy4.suiteName=integration -Ddigy4.threads=2 -Ddigy4.browser=chrome  -Ddigy4.cloudFarm=CUSTOM -Ddigy4.localBrowser=chrome -Ddigy4.client_id= -Ddigy4.client_secret=`

## Explore the results in the Digy Dashboard
- Visit `https://dashboard.digy4.com/`