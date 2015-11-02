import grails.converters.JSON
import grails.hateoas.User

class BootStrap {

    def init = { servletContext ->
        if(!User.count()) {
            new User(username: "1", email: "1@acme.org").save(flush: true)
            new User(username: "2", email: "2@acme.org").save(flush: true)
        }

        JSON.createNamedConfig('details') {
            it.registerObjectMarshaller(User) { User user ->
                final String fullname = [user.firstname, user.lastname].join(' ')
                final userMap = [
                        id      : user.id,
                        username: user.username,
                        email   : user.email,
                ]
                if (fullname) {
                    userMap.fullname = fullname
                }
                userMap
            }
            // Add for other resources a marshaller within
            // named configuration.
        }

        JSON.createNamedConfig('short') {
            it.registerObjectMarshaller(User) { User user ->
                final userMap = [
                        id      : user.id,
                        username: user.username
                ]
                userMap
            }
            // Add for other resources a marshaller within
            // named configuration.
        }
    }
    def destroy = {
    }
}
