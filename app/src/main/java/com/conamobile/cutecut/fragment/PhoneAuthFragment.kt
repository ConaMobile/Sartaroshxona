package com.conamobile.cutecut.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.conamobile.cutecut.R
import com.conamobile.cutecut.databinding.FragmentPhoneAuthBinding

//check login or sign up
class PhoneAuthFragment : BaseFragment() {
    private var _binding: FragmentPhoneAuthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_phone_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPhoneAuthBinding.bind(view)
        binding.apply {

            phoneAuthNextButton.setOnClickListener {
                findNavController().navigate(R.id.action_phoneAuthFragment_to_nameAuthFragment)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}