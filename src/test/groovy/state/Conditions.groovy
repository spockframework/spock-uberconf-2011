package state

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.*

class Conditions extends Specification {
    def "when-then style"() {
        when:
        def x = Math.max(5, 9)

        then:
        x == 9
    }

    def "expect style"() {
        expect:
        Math.max(5, 9) == 9
    }

    def "more complex conditions"() {
        expect:
        getGermanCarBrands().any { it.size() >= 3 }

        computeAnswerToTheUniverse() closeTo(42, 0.01)

        generateLoremIpsum() ==
                """
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec pulvinar,
nibh a ornare tempor, tortor nisl consequat nisi, non varius elit massa
non ligula. Integer sit amet congue ligula. Nam lectus dui, rutrum a
mattis id, imperdiet eget ipsum. Nullam sollicitudin nunc vitae urna
fermentum pellentesque. In libero leo, mollis posuere vulputate nec,
sagittis at nulla. Nullam convallis nulla odio. Duis nisi mi, ultricies
id venenatis ac, condimentum tempus ligula.
"""
    }

    def getGermanCarBrands() { ["audi", "bmw", "porsche"] }

    BigDecimal computeAnswerToTheUniverse() { 42.00387455 }

    def generateLoremIpsum() {
        """
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec pulvinar,
nibh a ornare tempor, tortor nisl consequat nisi, non varius elit massa
non ligula. Integer sit amet congue ligula. Nam lectus dui, rutrum a
mattis id, imperdiet eget ipsum. Nullam sollicitudin nunc vitae urna
fermentum pellentesque. In libero leo, mollis posuere vulputate nec,
sagittis at nulla. Nullam convallis nulla odio. Duis nisi mi, ultricies
id venenatis ac, condimentum tempus ligula.
"""
    }
}
