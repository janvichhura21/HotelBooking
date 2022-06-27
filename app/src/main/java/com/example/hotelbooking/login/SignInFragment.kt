package com.example.hotelbooking.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.FragmentSignInBinding
import com.example.hotelbooking.model.addBackButtonListener
import com.example.hotelbooking.model.replaceFragment

class SignInFragment : Fragment() {
    lateinit var binding: FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_sign_in, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        back()
    }

    private fun back() {
        addBackButtonListener {
            activity?.replaceFragment(R.id.frame,LoginFragment())
        }
    }


}