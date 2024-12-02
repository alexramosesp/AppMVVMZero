package com.enaitzdam.appmvvmzero

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.enaitzdam.appmvvmzero.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            val age = binding.editTextAge.text.toString().toIntOrNull()
            if (age != null) {
                val count = homeViewModel.countAlumnsByAge(age)
                binding.tvAge.text = "Número de alumnos con la edad $age: $count"
            } else {
                binding.tvAge.text = "Por favor ingresa una edad válida"
            }
        }

        return binding.root
    }
}
