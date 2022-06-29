package com.example.hotelbooking.room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.FragmentRoomBinding

class RoomFragment : Fragment() {
    lateinit var binding: FragmentRoomBinding
    lateinit var roomAdapter: RoomAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_room, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        roomAdapterRv()
    }

    private fun roomAdapterRv() {
        binding.roomRv.apply {
            layoutManager=LinearLayoutManager(requireContext())
            roomAdapter=RoomAdapter(requireContext())
            adapter=roomAdapter
        }
    }
}