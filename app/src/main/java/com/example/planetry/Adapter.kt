package com.example.planetry

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*


class Adapter(var planet:List<Planetdata>): RecyclerView.Adapter<Adapter.myViewHolder>() {


    class myViewHolder(view: View) :RecyclerView.ViewHolder(view){
            var title = view.title
            var planetimg = view.planet_img
            var galaxy = view.galaxy
            var distance = view.distance
            var gravity = view.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage:Int?=null
        holder.title.text=planet[position].title
        holder.galaxy.text=planet[position].galaxy
        holder.distance.text=planet[position].distance+" m km"
        holder.gravity.text=planet[position].gravity+" m/ss"

        when(planet[position].title!!.toString())
        {
            "mars" ->{
                dummyImage = R.drawable.mars
            }
            "neptune" ->{
                dummyImage = R.drawable.neptune
            }
            "earth" ->{
            dummyImage = R.drawable.earth
        }
            "saturn" ->{
                dummyImage = R.drawable.saturn
            }
            "jupiter" ->{
            dummyImage = R.drawable.jupiter
        }
            "uranus" ->{
                dummyImage = R.drawable.uranus
            }
            "moon" ->{
                dummyImage = R.drawable.night
            }
            "venus" ->{
                dummyImage = R.drawable.venus
            }

        }
        var hold= holder?.planetimg?.setImageResource(dummyImage!!)


    }

    override fun getItemCount(): Int {
        return planet.size
    }

}

