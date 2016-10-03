package isdomainclass.bug

import grails.test.mixin.TestFor
import org.grails.core.DefaultGrailsDomainClass
import org.grails.core.artefact.DomainClassArtefactHandler
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test composite key"() {
        expect:"Key to be ['firstName', 'lastName']"
        DomainClassArtefactHandler.isDomainClass(Person)
        new DefaultGrailsDomainClass(Person).properties.find {
            it.identity
        }.name == ["firstName", "lastName"]
    }
}
