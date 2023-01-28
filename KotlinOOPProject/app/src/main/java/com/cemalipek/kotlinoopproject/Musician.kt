package com.cemalipek.kotlinoopproject

import java.util.SimpleTimeZone

open class Musician(name: String, instrument: String, age: Int) {
    //encapsulation
    var name: String? = name
        private set
        get


    private var instrument: String? = instrument


    var age: Int? = age
        get
        private set

}
