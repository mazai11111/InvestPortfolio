package com.example.mvp_example.code.entry_point.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_example.R
import com.example.mvp_example.code.Base.IInitializable
import com.example.mvp_example.code.entry_point.init.DIInitializable
import com.example.mvp_example.code.portfolio_menu.view.PortfolioMenuView

class EntryPointView : AppCompatActivity() {
    private val _init:IInitializable<Context> = DIInitializable() //TO DO: convert to chain of responsibility or decorator. EntryPointView will inherit interface too

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry_point)

        init();
        startFirstScreen();
    }

    private fun startFirstScreen(){
        val intent = Intent(this, PortfolioMenuView::class.java)
        startActivity(intent)
    }

    private fun init(){
        _init.init(this@EntryPointView);
    }
}
