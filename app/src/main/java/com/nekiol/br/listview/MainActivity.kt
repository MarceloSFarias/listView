package com.nekiol.br.listview

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.nekiol.br.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaNumeros =ArrayList<Int>()

        listaNumeros.add(1)
        listaNumeros.add(10)
        listaNumeros.add(5)
        listaNumeros.add(4)
        listaNumeros.add(8)

        val adapter = ArrayAdapter(this, R.layout.simple_expandable_list_item_1, listaNumeros)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicou em ${listaNumeros.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}