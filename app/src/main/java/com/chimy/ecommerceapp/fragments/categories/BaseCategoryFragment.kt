package com.chimy.ecommerceapp.fragments.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.chimy.ecommerceapp.R
import com.chimy.ecommerceapp.adapters.bestProductAdapter
import com.chimy.ecommerceapp.databinding.FragmentBaseCategoryBinding
import com.chimy.ecommerceapp.databinding.FragmentMainCategoryBinding

open class BaseCategoryFragment : Fragment(R.layout.fragment_base_category) {
    private lateinit var binding: FragmentBaseCategoryBinding
    private lateinit var offerAdapter: bestProductAdapter
    private lateinit var bestProductAdapter: bestProductAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseCategoryBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupOfferRv()
        setupBestProductsRv()
    }

    private fun setupBestProductsRv() {
        bestProductAdapter = bestProductAdapter()
        binding.rvBestProducts.apply {
            layoutManager = GridLayoutManager(requireContext(),2, GridLayoutManager.VERTICAL,false)
            adapter = bestProductAdapter
        }
    }

    private fun setupOfferRv() {
        offerAdapter = bestProductAdapter()
        binding.rvBestProducts.apply {
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            adapter = offerAdapter
        }
    }

}
