package com.conamobile.cutecut.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.conamobile.cutecut.R
import com.conamobile.cutecut.databinding.FragmentNameAuthBinding

class NameAuthFragment : BaseFragment() {
    private var _binding: FragmentNameAuthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_name_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNameAuthBinding.bind(view)

        binding.apply {
            nameAuthSignUpUserButton.setOnClickListener {
                intentMainUserActivity()
            }
            nameAuthSignUpBarberButton.setOnClickListener {
                intentMainBarberActivity()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}