package com.example.whatsappproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter (var chats : List<ChatsClass>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        var inflater : LayoutInflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.chats_item,parent,false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.apply {
        }
    }

    override fun getItemCount(): Int {
        return chats.size
    }

    class ChatViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val userName= view.findViewById<TextView>(R.id.tvuserName)
        val chatMsg= view.findViewById<TextView>(R.id.tvchatMsg)
    }
}