package com.example.matrialdes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView:NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout= findViewById(R.id.drawerLayout)
        navView=findViewById(R.id.navview)
        toggle= ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close,)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1-> {
                    Toast.makeText(this@MainActivity, "Item1 Cliced", Toast.LENGTH_LONG).show()
                }
                R.id.item2-> {
                    Toast.makeText(this@MainActivity, "Item2 Cliced", Toast.LENGTH_LONG).show()
                }
                R.id.item3-> {
                    Toast.makeText(this@MainActivity, "Item3 Cliced", Toast.LENGTH_LONG).show()
                }
            }
           true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}