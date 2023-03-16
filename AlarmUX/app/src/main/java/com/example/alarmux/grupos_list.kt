package com.example.alarmux

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alarmux.databinding.FragmentGruposListBinding
import com.example.alarmux.databinding.FragmentSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [grupos_list.newInstance] factory method to
 * create an instance of this fragment.
 */
class grupos_list : Fragment() {
    private var _binding: FragmentGruposListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGruposListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imCrear.setOnClickListener {
            findNavController().navigate(R.id.action_grupos_list_to_createGrupo)
        }
        binding.imModify.setOnClickListener {
            findNavController().navigate(R.id.action_grupos_list_to_modifyGrupo)
        }
        binding.imDelete.setOnClickListener {
            findNavController().navigate(R.id.action_grupos_list_to_deleteGrupoFragment)
        }
        binding.cvGrupo.setOnClickListener {
            findNavController().navigate(R.id.action_grupos_list_to_alarmasList)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}