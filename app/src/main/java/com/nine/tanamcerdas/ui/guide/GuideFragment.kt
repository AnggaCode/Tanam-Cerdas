package com.nine.tanamcerdas.ui.guide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.nine.tanamcerdas.R
import com.nine.tanamcerdas.core.data.plantList
import com.nine.tanamcerdas.databinding.FragmentGuideBinding
import com.nine.tanamcerdas.ui.GuideAdapter
import com.nine.tanamcerdas.ui.PopularAdapter

class GuideFragment : Fragment() {
    private var _binding: FragmentGuideBinding? = null
    private val binding get() = _binding!!
    private val popularAdapter by lazy {
        PopularAdapter { data ->
            findNavController().navigate(R.id.action_navigation_guide_to_detailFragment)
        }
    }
    private val guideAdapter by lazy {
        GuideAdapter { data ->
            findNavController().navigate(R.id.action_navigation_guide_to_detailFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSearchView()

        // ** mengambil 5 data terpopuler
        val popularPlants = plantList.sortedByDescending { it.popularity }.take(5)
        val allGuide = plantList.shuffled()
        with(binding) {
            popularAdapter.submitList(popularPlants)
            guideAdapter.submitList(allGuide)
            rvPopular.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                setHasFixedSize(true)
                adapter = popularAdapter
            }
            rvAll.apply {
                layoutManager =
                    LinearLayoutManager(requireContext())
                setHasFixedSize(true)
                adapter = guideAdapter
            }
        }
    }

    private fun setupSearchView() {
        binding.searchView.setupWithSearchBar(binding.searchBar)
        binding.searchView.editText.setOnEditorActionListener { _, actionId, _ ->
            binding.searchBar.text = binding.searchView.text
            binding.searchView.hide()
            val query = binding.searchView.text.toString()
            val filteredList = plantList.filter { it.plantName.contains(query, ignoreCase = true) }
            guideAdapter.submitList(filteredList)
            false
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGuideBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val TAG = "GuideFragment"
    }
}