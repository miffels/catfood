package scaffolding.embedded

class User {

    String loginName

    static hasOne = [profile: Profile]

    static embedded = ["profile"]

    static constraints = {
    }
}
