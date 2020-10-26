package com.eagygowithfragments.ui.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.eagygowithfragments.R
import kotlinx.android.synthetic.main.fragment_sign_up_with_email.*

class SignUpWithEmailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_sign_up_with_email, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        action_back.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}