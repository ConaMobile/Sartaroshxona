package com.conamobile.cutecut.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.conamobile.cutecut.fragment.AccountFragment
import com.conamobile.cutecut.fragment.BarberHistoryFragment
import com.conamobile.cutecut.fragment.HomeUserFragment

class MainUserViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {

        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> {
                HomeUserFragment()
            }
            1 -> {
                BarberHistoryFragment()
            }
            2 -> {
                AccountFragment()
            }

            else -> {
                Fragment()
            }

        }
    }
}
