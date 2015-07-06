import gorm.mongodb.statictest.Language

class LanguageBootStrap {
	
	def i18nService
	
	def init = { servletContext ->
		initLanguages()
	}
	
	def destroy = {
	}
	
	def initLanguages() {
		def languages =  [
			new Language(key: "en", label: "language.label.English"),
		]
		
		def existing = Language.findAll().key
		
		languages
			.findAll { !existing.contains(it.key) }
			.each { it.save(flush: true) }
			
		assert languages.size() == Language.count() // PASS
	}
}
