package isdomainclass.bug

import groovy.transform.EqualsAndHashCode

// Defined according to http://gorm.grails.org/6.0.x/hibernate/manual/#compositePrimaryKeys
@EqualsAndHashCode(includes = ["salesOrderId", "index"])
class SalesOrderItem implements Serializable {

    long salesOrderId
    long index

    int quantity

    static belongsTo = [salesOrder: SalesOrder]

    static mapping = {
        id composite:['salesOrderId', 'index']
    }

    static constraints = {
    }
    
}
