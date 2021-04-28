package com.nathan.kotlin.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<V : IBaseView, P : BasePresenter<V>> : AppCompatActivity() {

    private val view: V by lazy { createView() }
    val presenter: P by lazy { createPresenter()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        setupView()

        presenter.attachView(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    abstract fun getLayoutId(): Int

    abstract fun setupView()

    abstract fun createPresenter(): P

    abstract fun createView(): V
}