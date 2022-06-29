package com.example.hotelbooking.mybookings.tabLayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.FragmentFinishedBinding
import com.example.hotelbooking.mybookings.tabLayout.adapter.FinishedAdapter

class FinishedFragment : Fragment() {
    lateinit var binding: FragmentFinishedBinding
    lateinit var finishedAdapter: FinishedAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_finished, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        finishedAdapterRv()
    }

    private fun finishedAdapterRv() {
        binding.finishedRv.apply {
            finishedAdapter= FinishedAdapter()
            layoutManager=LinearLayoutManager(requireContext())
            adapter=finishedAdapter
        }
    }
}