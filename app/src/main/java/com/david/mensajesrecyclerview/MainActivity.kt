package com.david.mensajesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.david.mensajesrecyclerview.adapter.MessagesAdapter
import com.david.mensajesrecyclerview.data.MessagesSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMessages:RecyclerView = findViewById(R.id.mensajesRecyclerView)
        val dataset = MessagesSource.data
        rvMessages.adapter=MessagesAdapter(dataset)
    }
}