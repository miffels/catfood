package isdomainclass.bug

import org.apache.commons.lang.builder.HashCodeBuilder

// Example from http://gorm.grails.org/6.0.x/hibernate/manual/#compositePrimaryKeys
class Person implements Serializable {

    String firstName
    String lastName

    boolean equals(other) {
        if (!(other instanceof Person)) {
            return false
        }

        other.firstName == firstName && other.lastName == lastName
    }

    int hashCode() {
        def builder = new HashCodeBuilder()
        builder.append firstName
        builder.append lastName
        builder.toHashCode()
    }

    static mapping = {
        id composite: ['firstName', 'lastName']
    }
}
