package oop_121788_abthal.week11

// Extension function with receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function with a parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}