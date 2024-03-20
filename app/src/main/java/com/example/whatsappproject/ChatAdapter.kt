package com.example.whatsappproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter (var chats : List<ChatsClass>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        var inflater : LayoutInflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.chats_item,parent,false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.userName.setText(chats[position].userName)
        holder.chatMsg.setText(chats[position].chatMsg)
        holder.image.setImageResource(chats[position].image)
        holder.time.setText(chats[position].Time)
    }

    override fun getItemCount(): Int {
        return chats.size
    }

    class ChatViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val userName= view.findViewById<TextView>(R.id.tvUserName)
        val chatMsg= view.findViewById<TextView>(R.id.tvchatMsg)
        val image = view.findViewById<ImageView>(R.id.ivImageview)
        val time =view.findViewById<TextView>(R.id.tvTime)
    }
}