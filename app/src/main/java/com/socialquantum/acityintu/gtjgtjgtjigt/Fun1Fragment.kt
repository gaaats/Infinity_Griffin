package com.socialquantum.acityintu.gtjgtjgtjigt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.socialquantum.acityintu.R
import com.socialquantum.acityintu.databinding.FragmentFun1Binding


class Fun1Fragment : Fragment() {
    private var fragmentGaaameBinding: FragmentFun1Binding? = null
    private val binding
        get() = fragmentGaaameBinding ?: throw RuntimeException("FragmentFun1Binding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaameBinding = FragmentFun1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            binding.topp.setOnClickListener {
                Toast.makeText(requireContext(), "Try again, friend", Toast.LENGTH_SHORT).show()
            }
            binding.center.setOnClickListener {
                Toast.makeText(requireContext(), "Try again, friend", Toast.LENGTH_SHORT).show()
            }
            binding.boot.setOnClickListener {
                findNavController().navigate(R.id.action_fun1Fragment_to_fun2Fragment)
            }


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaaameBinding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}