package com.example.whatsappproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class FindchannelsAdapter(var findChannelList : List<FindchannelsClass>) : RecyclerView.Adapter<FindchannelsAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var channelImage = view.findViewById<ImageView>(R.id.ivImage)
        var channelName = view.findViewById<TextView>(R.id.tvChannelName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.findchannels_items,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return findChannelList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.channelImage.setImageResource(findChannelList[position].channelImage)
        holder.channelName.text = findChannelList[position].channelName
    }
}
