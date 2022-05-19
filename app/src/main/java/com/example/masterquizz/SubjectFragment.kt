package com.example.masterquizz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.masterquizz.databinding.FragmentLoginBinding
import com.example.masterquizz.databinding.FragmentSubjectsBinding

class SubjectFragment:Fragment() {
    private val binding: FragmentSubjectsBinding by lazy {
        FragmentSubjectsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}