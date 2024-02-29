package com.example.whatsappproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CallAdapter (var calls : List<CallClass>) : RecyclerView.Adapter<CallAdapter.CallViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallViewHolder {
        var inflater : LayoutInflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.call_item,parent,false)
        return CallViewHolder(view)
    }

    override fun onBindViewHolder(holder: CallAdapter.CallViewHolder, position: Int) {
        holder.userName.text =calls[position].userName
        holder.callTime.text =calls[position].Time
    }

    override fun getItemCount(): Int {
        return calls.size
    }

    class CallViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val userName= view.findViewById<TextView>(R.id.tvuserName)
        val callTime = view.findViewById<TextView>(R.id.tvcallTime)
    }
}