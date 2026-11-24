# Chapter02 Selenium JavaDocs

Selenium 4 Minimum Coverage Project

Project Objective:
    The objective of this project is to establish a baseline automated test suite that provides minimum functional coverage of core Selenium 4 capabilities

Scope:
    Validated against the latest stable Selenium 4 release.
    Executed against the Selenium project website: https://selenium.dev.
        Verifies a representative set of Selenium 4 features and interfaces.
        Confirms successful runtime execution using the latest Selenium 4 package versions.
        Executes locally and within GitHub Actions using headless browser configurations.
        Provides a foundation for subsequent chapters and advanced implementation examples.
        Demonstrates cross-browser and cross-platform execution to validate framework portability.
            Supported Browsers:
                                    Google Chrome
                                    Microsoft Edge
                                    Mozilla Firefox
                                    Apple Safari
            Supported Operating Systems:
                                    Windows
                                    Linux
Success Criteria:
            Tests execute successfully using the latest Selenium 4 dependencies
            Tests run unattended within GitHub Actions CI/CD pipelines
            Browser compatibility is demonstrated across Chrome, Edge, Firefox and Safari
            Platform compatibility is demonstrated across Windows and Linux environments
            Framework architecture supports extension for additional Selenium 4 feature coverage in later chapters

## Convention
    POM uses generic version for selenium-java i.e. <version>4.0.0+</version>
        System.setProperty not used (Selenium 4.23.1, includes Selenium Manager for automatic driver management)

### Configuration
Test URL used: 
        https://selenium.dev
        http://www.example.com
        http://the-internet.herokuapp.com/hovers

#### See Project Files
README.md
    RESULT:
        Runtime Durations