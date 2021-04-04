package com.ppb.reminderplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var rvAssigment: RecyclerView
    private var title = "Overview"
    private val list = ArrayList<Assigment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAssigment = findViewById(R.id.rv_assigment)
        rvAssigment.setHasFixedSize(true)

        list.addAll(AssigmentData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAssigment.layoutManager = LinearLayoutManager(this)
        val listAssigmentAdapter = ListAssigmentAdapter(list)
        rvAssigment.adapter = listAssigmentAdapter

        listAssigmentAdapter.setOnItemClickCallback(object : ListAssigmentAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Assigment) {
                //Jika Itemnya diklick
            }
        })
    }
}