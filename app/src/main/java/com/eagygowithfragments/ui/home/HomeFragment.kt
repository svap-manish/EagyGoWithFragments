package com.eagygowithfragments.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eagygowithfragments.R
import com.eagygowithfragments.model.UserData
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showResultBtn.setOnClickListener {
            val userData = UserData(
                name = etName.text.toString(),
                email = etEmail.text.toString(),
                mobile = etMobile.text.toString(),
                country = etCountry.text.toString()
            )
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToResultFragment(userData))
        }
    }
}