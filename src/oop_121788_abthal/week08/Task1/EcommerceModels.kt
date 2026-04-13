package oop_121788_abthal.week08.Task1

sealed class Product()

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String, val size: String) : Product()