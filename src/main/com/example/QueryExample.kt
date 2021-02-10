package com.example

import org.example.generated.MyFirstQuery
import org.example.generated.MySecondQuery

fun main() {
    val foo = MySecondQuery.Bar("qux")
    val bar = MyFirstQuery.Bar("qux")
    check(foo == bar)
}