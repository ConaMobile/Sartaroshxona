package com.conamobile.cutecut.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.conamobile.cutecut.R
import com.conamobile.cutecut.databinding.FragmentHomeUserBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class HomeUserFragment : BaseFragment() {
    private var _binding: FragmentHomeUserBinding? = null
    private val binding get() = _binding!!
    private var bottomSheetBehavior: BottomSheetBehavior<*>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeUserBinding.bind(view)
        val playerSheet: ConstraintLayout = requireView().findViewById(R.id.barberInfoLayout)
        bottomSheetBehavior = BottomSheetBehavior.from(playerSheet)
        collapseManager()
    }

    private fun collapseManager() {
        bottomSheetBehavior?.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when {
                    newState == BottomSheetBehavior.STATE_HIDDEN -> {
                        bottomSheetBehavior?.state = BottomSheetBehavior.STATE_COLLAPSED

                    }
                    bottomSheetBehavior?.state == BottomSheetBehavior.STATE_EXPANDED -> {

                    }
                    bottomSheetBehavior?.state == BottomSheetBehavior.STATE_COLLAPSED -> {

                    }
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {}
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}