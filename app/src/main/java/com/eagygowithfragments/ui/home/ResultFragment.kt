package com.eagygowithfragments.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.eagygowithfragments.R
import com.eagygowithfragments.model.UserData
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {
    private val args: ResultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_result, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        args.userData?.let {
            tvName.text = it.name
            tvEmail.text = it.email
            tvMobile.text = it.mobile
            tvCountry.text = it.country
        }
    }
}