package com.example.pembelajaran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.nav_header, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.i_upload-> Toast.makeText(applicationContext, "ini adalah upload",Toast.LENGTH_SHORT).show()
            R.id.i_like -> Toast.makeText(applicationContext, "ini adalah like",Toast.LENGTH_SHORT).show()
            R.id.i_dm -> Toast.makeText(applicationContext, "ini adalah dm",Toast.LENGTH_SHORT).show()
            else -> return super.onOptionsItemSelected(item)
        }
      return true
    }
}