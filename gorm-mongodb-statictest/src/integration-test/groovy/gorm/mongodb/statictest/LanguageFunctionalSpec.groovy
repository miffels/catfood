package gorm.mongodb.statictest



import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import grails.transaction.*

import org.junit.ClassRule
import org.junit.Rule

import spock.lang.*

import com.eltepi.test.mongodb.EmbedMongoRule
import com.eltepi.test.mongodb.ResetDatabaseRule


@Integration(applicationClass=Application)
@TestFor(Language)
class LanguageFunctionalSpec extends Specification {
	
	@Shared @ClassRule
	EmbedMongoRule embedMongoRule = new EmbedMongoRule(grailsApplication)
	
	@Rule
	public ResetDatabaseRule resetDatabaseRule = new ResetDatabaseRule(embedMongoRule.db)
	
    void "Test initialization"() {
        expect: "Default languages should be there"
		Language.findByKey "en"  // PASS
		Language.count() || Language.findAll() // FAIL
    }
	
}
