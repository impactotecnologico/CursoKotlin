package clases

class Person(var name: String, var age: Int, var college: String?) {
     
    var email: String = ""
 
  constructor(name:String, age:Int, college: String?, email: String) : this(name, age, college) {
        this.email = email
    }
}


var jake = Person("Jake Hill", 24, "Stephen's College", "jake.hill@example.com")