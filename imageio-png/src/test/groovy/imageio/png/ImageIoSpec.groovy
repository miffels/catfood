package imageio.png

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.*

import javax.imageio.ImageIO

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class ImageIoSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test"() {
        expect:"Reading dat image should work"
        ImageIO.read(getClass().getResourceAsStream("/default.png"))
    }
}