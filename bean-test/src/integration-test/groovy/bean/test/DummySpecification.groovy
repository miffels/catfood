package bean.test

import bean.test.beans.DummyDependency
import grails.testing.mixin.integration.Integration
import grails.transaction.Rollback
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
@Rollback
class DummySpecification extends Specification {

	@Autowired
	DummyDependency dummyDependency

	def testDI() {
		expect:
		dummyDependency
	}

}
