package gorm.mongodb.statictest

import org.bson.types.ObjectId;

class Language {
	
	ObjectId id

	/**
	 * ISO 639-1 language identifier (two-character code)
	 */
	String key

	/**
	 * Verbose language identifier
	 */
	String label
	
    static constraints = {
		key blank: false, unique: true
		label blank: false
    }
	
}
