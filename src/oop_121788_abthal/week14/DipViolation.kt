package oop_121788_abthal.week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase() // Hard-coded! Tightly coupled!
    fun getUser(id: Int): List<String> = database.query("SELECT * FROM users WHERE id=$id")
}