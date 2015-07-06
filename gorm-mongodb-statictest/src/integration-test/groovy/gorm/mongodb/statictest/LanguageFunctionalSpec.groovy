package gorm.mongodb.statictest



import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import grails.transaction.*

import spock.lang.*


@Integration(applicationClass=Application)
@TestFor(Language)
class LanguageFunctionalSpec extends Specification {
	
    void "Test initialization"() {
        expect: "Default languages should be there"
		Language.findByKey "en"  // PASS
		Language.count() || Language.findAll() // FAIL
    }
	
}
