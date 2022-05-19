package com.example.masterquizz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.masterquizz.databinding.FragmentLoginBinding
import retrofit2.Response

class LoginFragment(private val apiService: ApiService): Fragment(),ApiService {

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



        // enviar para API


        binding.loginEnter.setOnClickListener {

            getValidation( binding.loginEmail.text.toString(), binding.loginPassword.text.toString())

        }
    }

   override fun getValidation(email: String, senha: String) {

        val response = apiService.getValidation(email, senha)

        if (response.isSuccessful){
           return findNavController().navigate(R.id.action_loginFragment_to_subjectFragment)
        }
        else{
            return Toast.makeText(context, "USUARIO E/OU SENHA INVALIDOS", Toast.LENGTH_SHORT).show()
        }

    }

}


