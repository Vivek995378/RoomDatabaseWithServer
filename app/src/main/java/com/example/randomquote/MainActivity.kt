package com.example.randomquote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cheezycode.randomquote.R
import com.example.randomquote.adapters.CustomAdapter
import com.example.randomquote.adapters.PagingAdapter
import com.example.randomquote.viewmodels.MainViewModel
import com.example.randomquote.viewmodels.MainViewModelFactory
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PagingAdapter()
        recyclerView.adapter = adapter

        val repository = (application as QuoteApplication).quoteRepository

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        lifecycleScope.launchWhenCreated {
            mainViewModel.getQuotes().observe(this@MainActivity , Observer{
                adapter.submitData(lifecycle ,it)
            })
        }
//        mainViewModel.quotes.observe(this, Observer {
//           // Toast.makeText(this@MainActivity, it.results.size.toString(), Toast.LENGTH_SHORT).show()
////            val adapter = CustomAdapter(it.results)
////            recyclerView.adapter = adapter
//            adapter.submitData(it)
//        })
    }
}