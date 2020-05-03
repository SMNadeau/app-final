package com.mycompany.recipeapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.video_row.view.*

class VideoAdapter(val context: Context, val videos: List<Items>): RecyclerView.Adapter<VideoAdapter.CustomViewHolder>() {

    private val TAG = "VideoAdapter"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentVideo = videos[position]

        holder.name.text = currentVideo.snippet.title
        Picasso.get().load(currentVideo.snippet.thumbnails.default.url).into(holder.image)
    }

    override fun getItemCount(): Int {
        return videos.size
    }

    inner class CustomViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val name = itemView.video_title
        val image = itemView.video_image
    }
}