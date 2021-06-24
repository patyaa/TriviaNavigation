package com.example.android.navigation

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.navigation.databinding.FragmentTitleBinding
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragemen.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragement : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTitleBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_titleFragement_to_gameFragment))
        return binding.root
    }

}