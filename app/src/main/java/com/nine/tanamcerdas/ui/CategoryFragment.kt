package com.nine.tanamcerdas.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.nine.tanamcerdas.R
import com.nine.tanamcerdas.core.data.plantList
import com.nine.tanamcerdas.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {
    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    private val guideAdapter: GuideAdapter by lazy {
        GuideAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val type = arguments?.getString(TYPE) ?: "buah"
        val data = when(type){
            "buah" -> plantList.filter { it.plantType == "buah" }
            "sayur" -> plantList.filter { it.plantType == "sayur" }
            "biji" -> plantList.filter { it.plantType == "biji" }
            "umbi" -> plantList.filter { it.plantType == "umbi" }
            else -> plantList.filter { it.plantType == "buah" }
        }
        guideAdapter.submitList(data)

        binding.rvBuah.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = guideAdapter
        }
        binding.back.setOnClickListener { it.findNavController().navigateUp() }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val TYPE = "type"
    }
}