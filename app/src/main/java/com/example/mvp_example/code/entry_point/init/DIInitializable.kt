package com.example.mvp_example.code.entry_point.init

import android.content.Context
import com.example.mvp_example.code.base.IInitializable
import com.example.mvp_example.code.asset_table.DIContainer.assetTableModule
import com.example.mvp_example.code.categories.DIContainer.categoriesModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class DIInitializable:IInitializable<Context> {
    override fun init(context: Context) {
        initKoin(context);
    }

    private fun initKoin(context: Context) {
        GlobalContext.startKoin {
            androidLogger(Level.ERROR)
            androidContext(context)
            modules(
                listOf(
                    assetTableModule,
                    categoriesModule
                )
            )
        }
    }
}