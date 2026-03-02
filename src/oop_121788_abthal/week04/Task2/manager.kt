package oop_121788_abthal.week04.Task2

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Bonus standar (10%) + Rp 500.000
        return super.calculateBonus() + 500000
    }
}