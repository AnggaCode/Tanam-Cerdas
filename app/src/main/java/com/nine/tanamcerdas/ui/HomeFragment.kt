package com.nine.tanamcerdas.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.nine.tanamcerdas.R
import com.nine.tanamcerdas.core.data.plantList
import com.nine.tanamcerdas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val popularAdapter : PopularAdapter by lazy { PopularAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = plantList.sortedByDescending { it.popularity }.take(6)
        popularAdapter.submitList(data)


        with(binding){
            btnBijian.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(CategoryFragment.TYPE, "biji")
                findNavController().navigate(R.id.action_navigation_home_to_categoryFragment, bundle)
            }
            btnUmbi.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(CategoryFragment.TYPE, "umbi")
                findNavController().navigate(R.id.action_navigation_home_to_categoryFragment, bundle)
            }
            btnKategoriBuah.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(CategoryFragment.TYPE, "buah")
                findNavController().navigate(R.id.action_navigation_home_to_categoryFragment, bundle)
            }
            btnKategoriSayur.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(CategoryFragment.TYPE, "sayur")
                findNavController().navigate(R.id.action_navigation_home_to_categoryFragment, bundle)
            }
        }
    }
}