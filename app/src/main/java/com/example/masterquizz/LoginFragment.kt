package com.example.masterquizz

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.DrawableCompat.inflate

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.masterquizz.databinding.ActivityMainBinding.inflate
import com.example.masterquizz.databinding.FragmentLoginBinding


class LoginFragment: Fragment() {

    private val binding: FragmentLoginBinding by lazy {
        FragmentLoginBinding.inflate(layoutInflater)
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

//        Handler(Looper.getMainLooper()).postDelayed(
//            {
//                findNavController().navigate(R.id.NOME DA NAVEGAÇÃO)
//            }, SPLASH_DELAY
//        )
    }

}