package org.example

import org.example.generated.MyFirstQuery
import org.example.generated.MySecondQuery

fun main() {
    val bar1 = MyFirstQuery.Bar("qux")
    val bar2 = MySecondQuery.Bar("qux")
    check(bar1::class == bar2::class)  // fails, but how to make this work?
}