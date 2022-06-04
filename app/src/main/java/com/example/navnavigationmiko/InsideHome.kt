package com.example.navnavigationmiko

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.navnavigationmiko.databinding.FragmentInsideHomeBinding
import android.R
import androidx.navigation.fragment.findNavController
import com.example.navnavigationmiko.databinding.ActivityMainBinding
import com.example.navnavigationmiko.databinding.FragmentHomeBinding


class InsideHome : Fragment() {

private lateinit var  binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideHomeBinding.inflate(layoutInflater)

        var argumentoRecibido1 = arguments?.getString("nombre")
        var argumentoRecibido2 = arguments?.getString("appaterno")
        var argumentoRecibido3 = arguments?.getString("apmaterno")
        var argumentoRecibido4 = arguments?.getString("usuario")
        var argumentoRecibido5 = arguments?.getString("email")
        binding.txt1.setText(argumentoRecibido1)
        binding.txt2.setText(argumentoRecibido2)
        binding.txt3.setText(argumentoRecibido3)
        binding.txt4.setText(argumentoRecibido4)
        binding.txt5.setText(argumentoRecibido5)
        return binding.root

     //   return inflater.inflate(R.layout.fragment_inside_home, container, false)
    }


}