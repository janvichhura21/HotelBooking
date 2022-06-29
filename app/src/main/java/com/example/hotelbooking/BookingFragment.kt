package com.example.hotelbooking

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.hotelbooking.booking.BestDealAdapter
import com.example.hotelbooking.booking.LatestsearchesAdpter
import com.example.hotelbooking.booking.PopularCountriesAdapter
import com.example.hotelbooking.booking.TourAdapter
import com.example.hotelbooking.databinding.FragmentBookingBinding
import com.example.hotelbooking.model.CenterZoomLayoutManager
import com.example.hotelbooking.model.Places
import com.example.hotelbooking.model.PopularCountries
import com.example.hotelbooking.mybookings.MyBookingsActivity
import com.example.hotelbooking.room.RoomActivity

class BookingFragment : Fragment() {
    lateinit var latestsearchesAdpter: LatestsearchesAdpter
    lateinit var popularCountriesAdapter: PopularCountriesAdapter
    lateinit var bestDealAdapter: BestDealAdapter
    lateinit var binding:FragmentBookingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_booking, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val linearLayoutManager = CenterZoomLayoutManager(requireContext())


        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        linearLayoutManager.reverseLayout = true
        linearLayoutManager.stackFromEnd = true
       // binding..layoutManager = linearLayoutManager// here u have to add
        binding.imageView.layoutManager=linearLayoutManager



        //auto center views
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(binding.imageView)
        binding.imageView.isNestedScrollingEnabled = false
        val place  = listOf(Places("https://images.unsplash.com/photo-1586611292717-f828b167408c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80"),
            "https://images.unsplash.com/photo-1529921879218-f99546d03a9d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80",
"https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
"https://images.unsplash.com/photo-1615460549969-36fa19521a4f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80"
        )
        val places=Places()
        places.url="https://images.unsplash.com/photo-1586611292717-f828b167408c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80"
      //  places.add("https://images.unsplash.com/photo-1529921879218-f99546d03a9d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80")
        binding.imageView.adapter = TourAdapter(places)
        latestsearchrv()
        popularcountries()
        bestDeals()
        clicktobook()
    }

    private fun clicktobook() {
        binding.bookBtn.setOnClickListener {
            startActivity(Intent(requireActivity(),RoomActivity::class.java))
        }
    }

    private fun bestDeals() {
        binding.bestDealsRv.apply {
            layoutManager=LinearLayoutManager(requireContext())
            bestDealAdapter=BestDealAdapter()
            adapter=bestDealAdapter

        }
    }

    private fun popularcountries() {

        binding.popularCountriesRv.apply {
            val pc=ArrayList<PopularCountries>()
            pc.add(PopularCountries("https://images.unsplash.com/photo-1586611292717-f828b167408c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80","IceLand"))
            pc.add(PopularCountries("https://images.unsplash.com/photo-1529921879218-f99546d03a9d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80","New York"))
            pc.add(PopularCountries("https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80","Los Angles"))
            pc.add(PopularCountries("https://images.unsplash.com/photo-1615460549969-36fa19521a4f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80","Amstedam"))
            val linearLayoutManager = CenterZoomLayoutManager(requireContext())
            linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
            linearLayoutManager.reverseLayout = true
            linearLayoutManager.stackFromEnd = true
            layoutManager=linearLayoutManager
            popularCountriesAdapter= PopularCountriesAdapter(pc)
            val snapHelper = LinearSnapHelper()
            snapHelper.attachToRecyclerView(binding.popularCountriesRv)
            binding.imageView.isNestedScrollingEnabled = false
          //  layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            adapter=popularCountriesAdapter
        }
    }

    private fun latestsearchrv() {
        binding.lastSearchRv.apply {
            latestsearchesAdpter= LatestsearchesAdpter()
            layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            adapter=latestsearchesAdpter
        }
    }
}