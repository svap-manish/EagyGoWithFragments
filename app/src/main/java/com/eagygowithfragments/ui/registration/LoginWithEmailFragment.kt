package com.eagygowithfragments.ui.registration

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eagygowithfragments.R
import com.eagygowithfragments.ui.home.HomeActivity
import kotlinx.android.synthetic.main.fragment_login_with_email.*

class LoginWithEmailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_login_with_email, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        action_back.setOnClickListener {
            activity?.onBackPressed()
        }
        action_sign_up.setOnClickListener {
            findNavController().navigate(R.id.action_loginWithEmailFragment_to_signUpFragment)
        }
        action_forgot_password.setOnClickListener {
            findNavController().navigate(R.id.action_loginWithEmailFragment_to_forgotPasswordFragment)
        }
        action_login.setOnClickListener {
            startActivity(Intent(context, HomeActivity::class.java))
        }
    }
}