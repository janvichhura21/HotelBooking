package com.example.hotelbooking.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.FragmentBeginBinding
import com.example.hotelbooking.homeTab.HomeActivity
import com.example.hotelbooking.model.replaceFragment


class BeginFragment : Fragment() {
    lateinit var binding: FragmentBeginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_begin, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ttb=AnimationUtils.loadAnimation(requireContext(),R.anim.ttb)
        val stb=AnimationUtils.loadAnimation(requireContext(),R.anim.stb)
        val btn=AnimationUtils.loadAnimation(requireContext(),R.anim.btn1_anime)

        binding.imageView2.startAnimation(stb)
        binding.text.startAnimation(ttb)
        binding.textView2.startAnimation(ttb)
        binding.createAccBtn.startAnimation(btn)

        createAccount()
        skipBtn()
    }

    private fun skipBtn() {
        binding.skipBtn.setOnClickListener {
           startActivity(Intent(requireContext(),HomeActivity::class.java))
        }
    }

    private fun createAccount() {
        binding.createAccBtn.setOnClickListener {
            activity?.replaceFragment(R.id.frame,LoginFragment())
        }
    }


}