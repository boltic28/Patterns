package com.boltic28.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boltic28.designpatterns.toDisplay.DrawDisplay
import com.boltic28.designpatterns.toFly.HighFly
import com.boltic28.designpatterns.toFly.LowFly
import com.boltic28.designpatterns.toFly.NoFly
import com.boltic28.designpatterns.toQuack.LoudQuack
import com.boltic28.designpatterns.toQuack.NoQuack
import com.boltic28.designpatterns.toQuack.SilentQuack
import com.boltic28.designpatterns.toWorkWithData.CapitalName
import com.boltic28.designpatterns.toWorkWithData.LowerName

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //create subjects by combining different realizations of interfaces
        println("-------start-------")
        Duck("MallardDuck", LowFly(), SilentQuack(), DrawDisplay(), CapitalName()).apply {
            display()
            fly()
            quack()
        }
        Duck("RubberDuck", NoFly(), LoudQuack(), DrawDisplay(), CapitalName()).apply {
            display()
            fly()
            quack()
        }
        Duck("CloudDuck", HighFly(), NoQuack(), DrawDisplay(), LowerName()).apply {
            display()
            fly()
            quack()
        }
    }
}