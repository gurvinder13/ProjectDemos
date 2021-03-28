package com.example.projectdemos

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var mainActivityViewModel:MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView=findViewById(R.id.txt1)
        val fab: FloatingActionButton =findViewById(R.id.btn1)
        mainActivityViewModel= ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        val count: LiveData<Int> = mainActivityViewModel.getInitialcount()
        count.observe(this, Observer {
            txt1.setText("Count is "+it)
        })

        fab.setOnClickListener {
            mainActivityViewModel.getCurrentCount()
        }
    }}