package com.example.hotelbooking.room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.FragmentRoomDetailsBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class RoomDetailsFragment : Fragment() {
    lateinit var binding: FragmentRoomDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_room_details, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottomsheet()
    }

    private fun bottomsheet() {
        BottomSheetBehavior.from(binding.bottomSheet).apply {
            peekHeight=650
            this.state=BottomSheetBehavior.STATE_COLLAPSED
        }
    }

}