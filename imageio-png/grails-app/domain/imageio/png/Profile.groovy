package imageio.png

class Profile {

    String firstName
	String lastName
	String email
	
    static constraints = {
		email email: true
		firstName blank: false
		lastName blank: false
    }
}
