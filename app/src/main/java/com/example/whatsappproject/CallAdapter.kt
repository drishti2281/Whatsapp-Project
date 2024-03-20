package com.example.whatsappproject

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CallAdapter (var calls : List<CallClass>) : RecyclerView.Adapter<CallAdapter.CallViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallViewHolder {
        var inflater : LayoutInflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.call_item,parent,false)
        return CallViewHolder(view)
    }

    override fun onBindViewHolder(holder: CallViewHolder, position: Int) {
       // Log.e("TAG", " calls[position].userName ${calls[position].userName}")
         holder.userName.setText(calls[position].userName)
        holder.callTime. setText(calls[position].Time)
        holder.image.setImageResource(calls[position].image)
    }

    override fun getItemCount(): Int {
        return calls.size
    }

    class CallViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val userName= view.findViewById<TextView>(R.id.tvUserName)
        val callTime = view.findViewById<TextView>(R.id.tvcallTime)
        val image = view.findViewById<ImageView>(R.id.ivShapeview)
    }
}