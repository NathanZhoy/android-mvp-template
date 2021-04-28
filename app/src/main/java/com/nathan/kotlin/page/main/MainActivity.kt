package com.nathan.kotlin.page.main

import android.os.Bundle
import android.widget.Toast
import com.nathan.kotlin.R
import com.nathan.kotlin.base.BaseActivity


class MainActivity : BaseActivity<IMainView, MainPresenter>(), IMainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun setupView() {
    }

    override fun createPresenter(): MainPresenter {
        return MainPresenter(this)
    }

    override fun createView(): IMainView {
        return this
    }

    override fun showMsg(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
    }
}
