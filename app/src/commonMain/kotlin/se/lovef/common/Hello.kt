package se.lovef.common

fun hello(vararg input: String) = "Hello " + input.joinToString(" and ")
