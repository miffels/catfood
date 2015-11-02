package grails.hateoas

import grails.rest.*

@Resource(uri = '/users', formats = ['json', 'short', 'details'])
class User {

    String username
    String lastname
    String firstname
    String email

    static constraints = {
        email email: true
        lastname nullable: true
        firstname nullable: true
    }

}
