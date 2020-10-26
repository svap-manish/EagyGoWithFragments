package com.eagygowithfragments.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eagygowithfragments.R
import kotlinx.android.synthetic.main.fragment_login_with_email.*
import kotlinx.android.synthetic.main.fragment_sign_up.*
import kotlinx.android.synthetic.main.fragment_sign_up.action_login


class SignUpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_sign_up, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        action_sign_up_with_email.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_signUpWithEmailFragment)
        }
        action_login.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}