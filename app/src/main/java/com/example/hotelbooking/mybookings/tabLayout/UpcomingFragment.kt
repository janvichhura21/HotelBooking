package com.example.hotelbooking.mybookings.tabLayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.FragmentUpcomingBinding
import com.example.hotelbooking.mybookings.tabLayout.adapter.UpcomingAdapter

class UpcomingFragment : Fragment() {
    lateinit var binding: FragmentUpcomingBinding
    lateinit var upcomingAdapter: UpcomingAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_upcoming, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        upcomingAdapterRv()
    }

    private fun upcomingAdapterRv() {
        binding.myBookingsFragmentRv.apply {
            upcomingAdapter=UpcomingAdapter()
            layoutManager=LinearLayoutManager(requireContext())
            adapter=upcomingAdapter
        }
    }


}