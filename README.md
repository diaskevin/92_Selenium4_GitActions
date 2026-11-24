# Chapter02 Selenium JavaDocs

The aim of this project is to provide test coverage of the packages provided by the Selenium 4: 
https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/2.50.1/overview-summary.html

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

#### Document Sources
https://www.selenium.dev/documentation/
https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/2.50.1/overview-summary.html
https://github.com/SeleniumHQ/seleniumhq.github.io/blob/trunk/README.md
    To understand what the methods in Selenium do, refer to the official Selenium documentation.
        Visit the Official Selenium Website: Go to the Selenium official website at
            Navigate to the API Documentation:
                Look for the API documentation section, which provides detailed information about the classes, methods, and their functionalities.
        Read Method Descriptions:
        Each method in the documentation will have a description explaining what it does, its parameters, return values, and any exceptions it may throw.
            Check Examples:
                Many methods include code examples that demonstrate how to use them in practice. This can help you understand their usage better.
            Search for Specific Methods:
                If you are looking for a specific method, you can use the search functionality on the documentation page to quickly find it and read about its purpose and usage.


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

What does ChromeOptions do?
    ChromeOptions is a class in Selenium WebDriver
        that allows you to customize and configure the behavior of the Chrome browser when running automated tests.
    It provides various options to:
        set preferences
        enable or disable features
        control the browser's behavior
    Some common uses of ChromeOptions include:
        1. Setting the browser to run in headless mode (without a GUI).
        2. Disabling extensions or plugins that may interfere with tests.
        3. Specifying the path to a custom Chrome binary or user profile.
        4. Configuring proxy settings for network requests.
        5. Adding command-line arguments to modify browser behavior (e.g., disabling GPU, setting window size).

    ChromiumDriver has a method within it called Capabilities() and that  
                WedDriver with child RemoteWebDriver
                WedDriver, RemoteWebDriver, ChromiumDiver  [with method Captbilities()]
                WedDriver, RemoteWebDriver, ChromiumDiver, [children: @ChromeDriver @EdgeDriver]
                    RemoteWebDriver with child ChromiumDiver
                        ChromiumDiver with method Captbilities()
    View Class documentation: 
                Click Ctrl, click blue hyperlink <Class_Name>
                Click blue '@' in Documentation to see children classes of the current class
    IntelliSense:
                Child class displays methods inherited up the chain from super classes above

###### WIP:
VERIFY what are the affected child classes of 'Base Utility'
VERIFY what class uses POM commons-io 2.15.1
VERIFY element with type By for xpath Id
VERIFY element with type By for xpath Name
VERIFY element with type By for xpath Id and getTyxt (Type cast?)
VERIFY Frame with WebElement getText
VERIFY Window with WebElement and getText
VERIFY WindowHandle WebElement and getText
VALIDATE log SPLF
VALIDATE log 4kj?
VALIDATE charted progress with JavDocs
VALIDATE Local Run of Repo ch02 across browsers (Safari & Edge) on one machine
VALIDATE Run Repo_ch02 Maven project (one POM) across two machine (Windows & Mac)
VALIDATE skill to run the official Selenium Dev Repo on GitHub