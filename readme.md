# Config Variable Issue
The four variables mentioned in section 4.1 of [this page](https://docs.grails.org/4.0.2/guide/conf.html) are no longer injected into application.groovy as of Grails 4.0.2.

This project has 4 variables configured in application.groovy which it prints during bootstrap. In 4.0.2, this will crash with an exception.

If you change the grailsVersion variable to 4.0.1, the app will start up.