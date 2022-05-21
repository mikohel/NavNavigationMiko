package com.example.navnavigationmiko

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navnavigationmiko.databinding.FragmentInsideHomeBinding

class InsideHome : Fragment() {

private lateinit var  binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideHomeBinding.inflate(layoutInflater)
        var argumentoRecibido = arguments?.getString("argumentoPasado")
        binding.txt2.setText(argumentoRecibido)
        return binding.root

     //   return inflater.inflate(R.layout.fragment_inside_home, container, false)
    }


}