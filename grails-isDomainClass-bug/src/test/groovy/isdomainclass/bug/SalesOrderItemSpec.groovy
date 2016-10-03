package isdomainclass.bug

import grails.test.mixin.TestFor
import grails.util.Holders
import org.grails.core.artefact.DomainClassArtefactHandler
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(SalesOrderItem)
class SalesOrderItemSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "is Domain class"() {
        expect:"SalesOrderItem to be a domain class"
        // Actually throws "org.grails.core.exceptions.GrailsConfigurationException: Cannot add Domain class [class isdomainclass.bug.SalesOrderItem]. It is not a Domain!"
        DomainClassArtefactHandler.isDomainClass SalesOrderItem
    }
}
