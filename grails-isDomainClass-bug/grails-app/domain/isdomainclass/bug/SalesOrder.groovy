package isdomainclass.bug

class SalesOrder {

    static hasMany = [items: SalesOrderItem]

    static constraints = {
    }
}
