package com.innovapp.demoavan.presentation.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.innovapp.demoavan.R

/**
 * CREATE by RaulEB on 6/08/2021
 **/
class TeamAdapter(private val dataSet: ArrayList<String>) :
    RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    interface ClickListener {
        fun onAddClick(team: String, typeAction: Int)
    }

    private var clickListener: ClickListener? = null

    fun setOnClickListener(clickListener: ClickListener) {
        this.clickListener = clickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_adapter_team, parent, false)
        return TeamViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
        holder.textSentence.text = dataSet[position]
        holder.buttonAdd.setOnClickListener {
            clickListener!!.onAddClick(dataSet[position], 0)
        }
        holder.card.setOnClickListener {
            clickListener!!.onAddClick(dataSet[position], 1)
        }
    }

    override fun getItemCount() = dataSet.size


    class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView
        val buttonAdd: ImageView
        val textSentence: TextView
        val card: CardView

        init {
            textView = view.findViewById(R.id.text1)
            buttonAdd = view.findViewById(R.id.addMember)
            textSentence = view.findViewById(R.id.textSentence)
            card = view.findViewById(R.id.card)
        }

    }
}