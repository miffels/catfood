package navigationtest

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(FromDomain)
class FromDomainSpec extends Specification {

    def setup() {
        mockDomains(FromDomain, ToDomain, ToDomainSubclass)
        ToDomain toDomain = new ToDomainSubclass(subclassProperty: "testValue")
        FromDomain fromDomain = new FromDomain(toDomain: toDomain)
        fromDomain.save(flush: true)
    }

    def cleanup() {
    }

    void "Subclass property access via navigations"() {
        expect:"Properties defined in subclasses should be read"
        FromDomain.count == 1
        ToDomain toDomain = FromDomain.findAll().first().toDomain
        toDomain.getClass() == ToDomainSubclass
        toDomain.subclassProperty == "testValue"
    }
}
