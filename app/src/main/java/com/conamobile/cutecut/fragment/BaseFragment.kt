package com.conamobile.cutecut.fragment

import android.content.Intent
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.conamobile.cutecut.activity.MainBarberActivity
import com.conamobile.cutecut.activity.MainUserActivity

open class BaseFragment : Fragment() {
    fun intentMainBarberActivity() {
        startActivity(Intent(context, MainBarberActivity::class.java))
        requireActivity().finish()
    }

    fun intentMainUserActivity() {
        startActivity(Intent(context, MainUserActivity::class.java))
        requireActivity().finish()
    }

    fun toast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}