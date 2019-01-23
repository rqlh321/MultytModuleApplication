package com.sic.basemodule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.sic.core.MyClass
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

open class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        MyClass()

        runBlocking {
            test()
            Toast.makeText(context, "Hello ${BaseFragment::class.java.simpleName}", Toast.LENGTH_SHORT).show()
        }


        return inflater.inflate(R.layout.abc_action_bar_title_item,container,false)
    }

    suspend fun test() {
        delay(2000)
        println("Hello")
    }
}