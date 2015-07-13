package gorm.domainclass.bootstrap

class Test {

	def getSomeConfiguredUrl() {
		"http://www.google.de?q=$domainClass.grailsApplication.config.gorm.domainclass.bootstrap.query"
	}

    static constraints = {
    }
}
