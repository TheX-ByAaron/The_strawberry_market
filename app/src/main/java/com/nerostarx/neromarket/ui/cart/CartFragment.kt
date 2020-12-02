package com.nerostarx.neromarket.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nerostarx.neromarket.R
import com.nerostarx.neromarket.databinding.FragmentCartBinding

class CartFragment : Fragment() {

    private val cartViewModel: CartViewModel by activityViewModels()
    private lateinit var binding:FragmentCartBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_cart, container, false)
        return binding.root
    }
}