package com.nathan.kotlin.base

import android.content.Context

abstract class BasePresenter<V>(var context: Context?) {

    var view: V? = null

    fun attachView(view: V?) {
        this.view = view
    }

    fun detachView() {
        this.view = null
        this.context = null
    }
}