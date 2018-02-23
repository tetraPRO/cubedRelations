/**
* A class is the blueprint or definition
* for the type of object that we need to
* create in memory.
*/
class character{

/**
* Every class definition contains some
* number of attributes which will be
* used to describe the class which
* will be called fields.  These will
* answer the question what does this
* class have?
*/
	def name
	def age
	def planet
	def race
	def language
	def profession
	def hobby
	def balance
	def magic

	/**
	* Every class contains some number of
	* functions.  These are the verbs of
	* the problem domain.  What can the
	* class do?
	*/
	def greeting(){
		"Hi! My name is $name and I have been alive for $age."
	}
}
def char = new character()
char.name = "Philip"
char.age = 34
println char.greeting()
