package com.socialquantum.acityintu.gtjgtjgtjigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.socialquantum.acityintu.R
import com.socialquantum.acityintu.databinding.FragmentFun2Binding


class Fun2Fragment : Fragment() {
    private var fragmentFun2Binding: FragmentFun2Binding? = null
    private val fun2Binding
        get() = fragmentFun2Binding ?: throw RuntimeException("FragmentFun2Binding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentFun2Binding = FragmentFun2Binding.inflate(inflater, container, false)
        return fun2Binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            fun2Binding.clooose.setOnClickListener {
                requireActivity().finish()
            }
            fun2Binding.ressss.setOnClickListener {
                findNavController().navigate(R.id.action_fun2Fragment_to_fun1Fragment)
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
        fragmentFun2Binding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            fun2Binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}