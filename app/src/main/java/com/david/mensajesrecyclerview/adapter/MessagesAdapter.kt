package com.david.mensajesrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.david.mensajesrecyclerview.R
import com.david.mensajesrecyclerview.model.Message

class MessagesAdapter(val messagesDataSet: List<Message>) :
    RecyclerView.Adapter<MessagesAdapter.MessagesViewHolder>() {

    class MessagesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgMessages: ImageView = view.findViewById(R.id.imgMensajes)
        val txt1: TextView = view.findViewById(R.id.txtMensajes1)
        val txt2: TextView = view.findViewById(R.id.txtMensajes2)

        fun vincular(item: Message) {
            imgMessages.setImageResource(item.imgAuthor)
            txt1.text = item.authorName
            txt2.text = item.text
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagesViewHolder {
        val inflador = LayoutInflater.from(parent.context)
        val vistaInflada: View = inflador.inflate(R.layout.mensaje_layout, parent, false)
        return MessagesViewHolder(vistaInflada)
    }

    override fun onBindViewHolder(holder: MessagesViewHolder, position: Int) {
        holder.vincular(messagesDataSet[position])
    }

    override fun getItemCount(): Int {
        return messagesDataSet.size
    }
}