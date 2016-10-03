package isdomainclass.bug

import grails.test.mixin.TestFor
import grails.util.Holders
import org.grails.core.artefact.DomainClassArtefactHandler
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(SalesOrder)
class SalesOrderSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "is Domain class"() {
        expect:"SalesOrder to be a domain class"
        DomainClassArtefactHandler.isDomainClass SalesOrder
    }
}
