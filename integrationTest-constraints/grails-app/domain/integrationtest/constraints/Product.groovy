package integrationtest.constraints

class Product {

    String description

    static constraints = {
        description maxSize: 10
    }
}
