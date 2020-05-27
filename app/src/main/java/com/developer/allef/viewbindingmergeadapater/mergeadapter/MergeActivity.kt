package com.developer.allef.viewbindingmergeadapater.mergeadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import com.developer.allef.viewbindingmergeadapater.data.DataSource
import com.developer.allef.viewbindingmergeadapater.data.Item
import com.developer.allef.viewbindingmergeadapater.databinding.ActivityMergeBinding

class MergeActivity : AppCompatActivity() {


    private val personAdapter by lazy {
        PersonAdapter()
    }
    private val personTitleAdapter by lazy {
        PersonTitleAdapter()
    }
    private val personBottomAdapter by lazy {
        PersonBottomAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMergeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Minha Agenda"


        val mergeAdapter = MergeAdapter(personTitleAdapter,personAdapter,personBottomAdapter)


        binding.recyclerMerge.apply {
            layoutManager =
                LinearLayoutManager(this@MergeActivity,LinearLayoutManager.VERTICAL,false)
            adapter = mergeAdapter
        }

        personAdapter.addItem(getData())

    }

    private fun getData (): MutableList<Item> {
        return DataSource.getData()
    }
}
