package com.boltic28.state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boltic28.state.states.Destroyed
import com.boltic28.state.states.Draft
import com.boltic28.state.states.Moderation
import com.boltic28.state.states.Published

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val document: Document = Document()

        document.apply {
            publish()
            publish()
            checkState()
            publish()
            cancel()
            checkState()
            cancel()
            publish()
        }
    }
}