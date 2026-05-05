package oop_121788_abthal.week11

// Extension function with receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function with a parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    // 'this' can be null here, so it must be handled
    return this == null || this.isEmpty()
}