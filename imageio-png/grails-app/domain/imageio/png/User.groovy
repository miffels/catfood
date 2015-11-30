package imageio.png

class User {

	/**
	 * Account name of this user. This usually is the email address.
	 */
	String name
	
	/**
	 * Creation timestamp of this profile
	 */
	Long created = new Date().time
	
	/**
	 * Current user authentication token used to authorize API requests
	 */
	String token
	
	/**
	 * ID of the device associated with this profile
	 */
	String deviceId
	
	List profiles
	
	static hasMany = [profiles: Profile]
	static transients = ["token"]

    static constraints = {
		name blank: false
		deviceId blank: false
    }

}
