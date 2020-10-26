package com.eagygowithfragments.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eagygowithfragments.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_login, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Without Safe-Args
        /*action_login_with_email.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_loginWithEmailFragment)
        }
        action_sign_up.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }*/


        //With Safe-Args
        action_login_with_email.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToLoginWithEmailFragment())
        }
        action_sign_up.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignUpFragment())
        }
    }
}