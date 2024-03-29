package com.example.whatsappproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class StatusAdapter (var status : List<StatusClass>) : RecyclerView.Adapter<StatusAdapter.StatusViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusViewHolder {
        var inflater : LayoutInflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.status_item,parent,false)
        return StatusViewHolder(view)
    }

    override fun onBindViewHolder(holder: StatusAdapter.StatusViewHolder, position: Int) {
        holder.userName.setText(status[position].userName)
       // holder.callTime.setText(status[position].Time)
        holder.image.setImageResource(status[position].image)

    }

    override fun getItemCount(): Int {
        return status.size
    }

    class StatusViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val userName= view.findViewById<TextView>(R.id.tvuserName)
       // val callTime = view.findViewById<TextView>(R.id.tvTime)
        val image =view.findViewById<ImageView>(R.id.ivImage)
    }
}