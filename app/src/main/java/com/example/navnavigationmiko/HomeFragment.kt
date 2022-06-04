package com.example.navnavigationmiko

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navnavigationmiko.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       // o binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)


        //onclick
        val navController = findNavController()
        binding.btnHomeInside.setOnClickListener(){
            Toast.makeText(context,"prueba",Toast.LENGTH_SHORT).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val nombre = binding.etName.text.toString()
            val paterno = binding.etPaterno.text.toString()
            val materno = binding.etMaterno.text.toString()
            val usuario = binding.etUsuario.text.toString()
            val correo = binding.etCorreo.text.toString()


            val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(nombre,paterno,materno,usuario,correo)
            navController.navigate(directions)
        }
        return binding.root
    }


}