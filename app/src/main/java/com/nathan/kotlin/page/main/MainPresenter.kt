package com.nathan.kotlin.page.main

import android.content.Context
import com.nathan.kotlin.base.BasePresenter

class MainPresenter(context: Context?) : BasePresenter<IMainView>(context), IMainPresenter {

    override fun showMsg(string: String) {
        view?.showMsg(string)
    }

}