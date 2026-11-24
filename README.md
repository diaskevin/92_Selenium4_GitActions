# Chapter02 Selenium JavaDocs

The aim of this project is to provide test coverage of the packages provided by the Selenium 4
    Document Sources
        https://www.selenium.dev/documentation/
        https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/2.50.1/overview-summary.html
        https://github.com/SeleniumHQ/seleniumhq.github.io/blob/trunk/README.md
    Project Packages include:
        Actions & Interaction  
        BiDi-  ChromeEndPoint
        Chrome(Capability & Options)
        Support (Colour & Threads)
        WebDriver (Navigation & Options & Windows-elements)
        Features
            Assertions
            BaseUtility (Ch03 ???) 
            Cookies
            Elements
            Latency
            Screenshots


To VALIDATE extensibility of the designed COC of this project, runtime execute over several browser types amd operating systems
    Browser Types: Chrome, Edge, Firefox, Safari
    OS Types: Windows Mac


## Convention
Globally declare WebDriver
Default Chrome browser type
Baselined maven POM ( https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)
    POM uses generic version for selenium-java i.e. <version>4.0.0+</version>
Default resource location c:/qa

### Configuration
System.setProperty not used (Selenium 4.23.1, includes Selenium Manager for automatic driver management)
@Disabled For now, DevTools (CDP-api) tests
@Disabled For now, ParseInt tests
Runtime (as a prelude to Ch03): run tests in this chapter on different Browser types and device types machines


##### Selenium Inheritance
WebDrive is an interface
    ChromiumDriver extends RemoteDriver, which in turn implements WebDriver interface
        Capabilities is a method WITHIN ChromiumDriver with a return type of 'Capabilities'
        ChromeDriver and EdgeDriver are child classes of ChromiumDriver
        GeckoDriver is NOT within ChromiumDriver
THIS constructor 
        WebDrive has own 'this' constructor with a return type of WebDriver
        ChromiumOptions has own 'this' constructor with a return type of ChromiumOptions
        Capabilities has own 'this' constructor with a return type of Capabilities    
WebDriver Constructor:
        WebDriver declared (as driver), new constructor for Driver Type, only then use the driver.get
Capabilities Constructor:
        Capabilities declared (as cap), new constructor for Capabilities, then cap.getBrowserNName
ChromiumOptions Constructor:
        ChromiumOptions declared (as options), new constructor for ChromeOptions, then options.setMaximizeWindow
Example of Java CONSTRUCTORS:
        1) WedDriver CONSTRUCTOR
            WebDriver driver;
            driver = new ChromeDriver();
            driver.get(bbc.co.uk);
        2) ChromiumOptions CONSTRUCTOR
            WebDriver driver;
            ChromeOptions options = new ChromeOptions();
            options.setMaxmizeWindow();
        3) ChromeDriver CONSTRUCTOR (See doc_CAPABILITIES/mutableCapabilities/SeleniumCapabilities_Test)
             Capabilities cap;
             cap = driver.getCapabilities();
             String browser= cap.getBrowserName();
                 BUT WE NEED TO GO DOWN TO CHORMIUM
                 ChromiumDriver driver;
                 driver = new ChromeDriver();
                 driver.get("bbc.co.uk")'
                 Capabilities cap;
                 cap = driver.getCapabilities();
                 String browser= cap.getBrowserName();
Class Hierarchy:
            Class within a class hierarchy:
                The remote webdriver class is a part of the Selenium WebDriver framework
                that allows you to execute browser automation tests on a remote machine or server.
            It enables you to run your tests on different browsers and operating systems without having to install them locally.
                The RemoteWebDriver class communicates with a remote server (like Selenium Grid) using the WebDriver protocol,
                allowing you to control browsers running on different machines.


#### See Project Files
README.md
    TIPS:
        Webdrive Google Chrome Options    
    REVIEW:
        MyGitHub_Chapters
        AI
        WIP
    RESULT:
        Runtime Durations











