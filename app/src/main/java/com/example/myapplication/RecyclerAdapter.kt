package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemLayoutBinding

class RecyclerAdapter(private val items: List<Todo>): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    /**
     * size of list
     */
    override fun getItemCount(): Int = items.size

    /**
     * init binding
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecyclerViewHolder(binding)
    }

    /**
     * bind
     */
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(items[position])
    }

    /**
     * bind items with data
     */
    inner class RecyclerViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Todo) {
            binding.textView.text = item.title
        }
    }
}