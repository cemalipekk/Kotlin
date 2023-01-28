package com.cemalipek.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor
        var myUser = User("James", 50)
        myUser.name = "Lars"
        myUser.age = 60

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())

        //encapsulation

        var james = Musician("James", "Bağlama", 55)
        println(james.age.toString())

        //inheritance

        var lars = SuperMusician("Lars","guitar", 45)
        println(lars.age)
        println(lars.name)
        println()
        lars.sing()

        //static polymorpishm

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorpishm

        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        //abstract & interface

        //var myPeople = People()  bu şekilde çağramayaız abstractları


        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()


        //Lambda expressions

        fun printString(myString : String){
            println(myString)
        }
        printString("My Test String")

        val testString = {myString : String -> println(myString) }

        testString("My Lambda String")

        val multiplyLambda = {a: Int, b: Int -> a*b}

        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}

        //asynchrnous

        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion : () -> Unit){
            //url -> download
            //data
            completion()

            downloadMusicians("metallica.com",{
                println("completed && ready") })
        }



    }
}