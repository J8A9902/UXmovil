package com.example.alarmux

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alarmux.databinding.FragmentCreateAlarmaBinding
import com.example.alarmux.databinding.FragmentCreateGrupoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CreateAlarma.newInstance] factory method to
 * create an instance of this fragment.
 */
class CreateAlarma : Fragment() {
    private var _binding: FragmentCreateAlarmaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCreateAlarmaBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCancelar.setOnClickListener {
            findNavController().navigate(R.id.action_createAlarma_to_alarmasList)
        }
        binding.btnCrear.setOnClickListener {
            findNavController().navigate(R.id.action_createAlarma_to_alarmasList)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}