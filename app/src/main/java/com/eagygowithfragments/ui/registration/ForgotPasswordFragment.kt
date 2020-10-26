package com.eagygowithfragments.ui.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eagygowithfragments.R
import kotlinx.android.synthetic.main.fragment_forgot_password.*
import kotlinx.android.synthetic.main.fragment_forgot_password.action_back
import kotlinx.android.synthetic.main.fragment_login_with_email.*

class ForgotPasswordFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_forgot_password, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        action_back.setOnClickListener {
            activity?.onBackPressed()
        }
        action_continue.setOnClickListener {
            findNavController().navigate(R.id.action_forgotPasswordFragment_to_resetPasswordFragment)
        }
    }
}