package com.nkechinnaji.datasorting

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.nkechinnaji.datasorting.UiUtils.setImages
import com.nkechinnaji.datasorting.UiUtils.setTextDescriptions


class SortPicsAdapter (var listener: OnItemClickListener): RecyclerView.Adapter<SortPicsAdapter.SortPicViewHolder>() {

    private var count = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SortPicViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item_row, parent, false)
        val viewHolder = SortPicViewHolder(layout)
        return viewHolder
    }

    override fun onBindViewHolder(holder: SortPicViewHolder, position: Int) {
        val images = setImages()
        val imageItems = images[position]
        val descriptions: ArrayList<String> = setTextDescriptions()
        val textItems = descriptions[position]

        holder.textDesc.text = textItems
        holder.textComments.text = textItems
        holder.image.setImageResource(imageItems)

        holder.itemView.setOnClickListener{
            //count - num of clicks
            //position- itemView position
            ++count
            listener?.onItemClick(position, count)
            if(count > 1 ){
                count = 0
                holder.textComments.text = textItems

            } else{
                //Convert string to array, alphabetize and return as string sentence
                val textContent = textItems
                val words : Array<String> = textContent.split("\\s+".toRegex()).dropLastWhile{
                    it.isEmpty() }.toTypedArray()
                for(i  in words.indices){
                    words[i] = words[i].replace("[^\\w]".toRegex(), "")
                }
                val alphabetized = words.sortedWith(compareBy { it.lowercase() })
                holder.textComments.text = alphabetized.joinToString(" ").lowercase()
            }
            }
    }

    override fun getItemCount(): Int {
        return setTextDescriptions().size
    }

    inner class SortPicViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image = view.findViewById<AppCompatImageView>(R.id.item_image)
        var textDesc = view.findViewById<AppCompatTextView>(R.id.item_desc)
        var textComments = view.findViewById<AppCompatTextView>(R.id.item_desc_ii)

    }
    interface OnItemClickListener {
        fun onItemClick(position: Int, clickCount: Int)
    }
}