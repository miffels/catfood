package definebeans

import definebeans.Application
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration(applicationClass = Application)
class DefineBeansSpec extends Specification {

    def defineBeansTest() {
        given: "A handful of beans"

        // See https://testing.grails.org/latest/guide/index.html#_other_spring_configuration
        defineBeans {
          // Nothing to define, really
        }

        expect: "This to work"

        1 == 1
    }

}
