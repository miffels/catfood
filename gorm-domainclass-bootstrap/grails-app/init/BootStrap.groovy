import gorm.domainclass.bootstrap.Test

class BootStrap {

	def grailsApplication

    def init = { servletContext ->
		new Test().someConfiguredUrl
		grailsApplication.mainContext.getBean(Test.name).someConfiguredUrl
    }
    def destroy = {
    }
}
