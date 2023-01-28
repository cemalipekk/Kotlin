package com.cemalipek.kotlinoopproject

class User : People{
    //property
    var name : String? = null
    var age : Int? = null

    //Constructor vs init

    constructor(nameInput:String, ageInput:Int){
        this.name = nameInput
        this.age = ageInput
    }
}