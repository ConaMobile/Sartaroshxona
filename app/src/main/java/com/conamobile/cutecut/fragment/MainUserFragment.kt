package com.conamobile.cutecut.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.conamobile.cutecut.R
import com.conamobile.cutecut.adapters.MainUserViewPagerAdapter
import com.conamobile.cutecut.databinding.FragmentMainUserBinding

class MainUserFragment : BaseFragment() {
    private var _binding: FragmentMainUserBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainUserBinding.bind(view)

        bottomNavigationManager(parentFragmentManager)
    }

    private fun bottomNavigationManager(fragmentManager: FragmentManager) {
        binding.apply {
            mainUserViewPager2.adapter = MainUserViewPagerAdapter(fragmentManager, lifecycle)
            mainUserViewPager2.currentItem = 0

            mainUserViewPager2.registerOnPageChangeCallback(object :
                ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    mainUserBottomNavigation.selectTabAt(position)
                }
            })

            mainUserBottomNavigation.selectTabAt(0)
            mainUserViewPager2.currentItem = mainUserBottomNavigation.selectedIndex

            mainUserBottomNavigation.onTabSelected = {
                mainUserViewPager2.currentItem = mainUserBottomNavigation.selectedIndex
            }

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}