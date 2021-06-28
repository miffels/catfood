package integrationtest.constraints

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@Integration(applicationClass=Application)
@Rollback
class ProductFunctionalSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test constraints"() {
        expect: "Constraints to be in place"
            Product.constrainedProperties.size()
    }
}
