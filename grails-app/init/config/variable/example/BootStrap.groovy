package config.variable.example
import grails.util.Holders
class BootStrap {

    def init = { servletContext ->
		println Holders.config.testUserHome
		println Holders.config.testGrailsHome
		println Holders.config.testAppName
		println Holders.config.testVersion
    }
    def destroy = {
    }
}
