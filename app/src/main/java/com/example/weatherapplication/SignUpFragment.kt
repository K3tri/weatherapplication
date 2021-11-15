package com.example.weatherapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputLayout

class SignUpFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.get_access)

        button.setOnClickListener {
            val login = view.findViewById<TextInputLayout>(R.id.outlinedTextField_Login)
            val password = view.findViewById<TextInputLayout>(R.id.outlinedTextField_Password)

            if(login.editText?.editableText.isNullOrEmpty() || password.editText?.editableText.isNullOrEmpty()){
                Toast.makeText(requireContext(), "Нельзя оставлять поля пустыми", Toast.LENGTH_SHORT).show()
                login.error = "Нельзя оставлять пустыми"
                password.error = "Нельзя оставлять пустыми"
            }
            else{
                findNavController().navigate(R.id.action_signUpFragment_to_edit_accauntFragment)
            }


        }
    }

}

