package com.boltic28.command

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val order = Order("order 1")

        // commands for work with order
        val saveCommand = Save(order)
        val openCommand = Open(order)
        val printCommand = Print(order)

        // class that can execute methods for order
        val waiter: Waiter = Waiter(saveCommand, openCommand, printCommand)

        waiter.apply {
            save()
            open()
            print()
        }
    }
}