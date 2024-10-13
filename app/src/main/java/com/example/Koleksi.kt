package com.example

fun contohList() {
    println("=== List ===")
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Circle")
    println(shape)

    shape.remove("Triangle")
    println(shape)

    shape[0] = "oval"
    println(shape)

    val shapesLocked: List<String> = shape
    println(shapesLocked)

}

fun contohSet() {
    println()
    println("=== Set ===")

    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Rectangle")
    println(shape)

    shape.remove("Circle")
    println(shape)

    val shapesLocked: Set<String> =shape
    println(shapesLocked)

}

fun contohMap() {
    println()
    println("=== Map ===")
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1,"Square" to 2, "Triangle" to 3)
    println(readOnlyShape)
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)
    shape["Rectangle"] = 4
    println(shape)
    shape.remove("Circle")
    println(shape)
    shape["Square"] = 5
    println(shape)

    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)

