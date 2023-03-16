package com.example.alarmux

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.alarmux.databinding.FragmentAlarmasListBinding
import com.example.alarmux.databinding.FragmentGruposListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlarmasList.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlarmasList : Fragment() {
    private var _binding: FragmentAlarmasListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAlarmasListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imCrear.setOnClickListener {
            findNavController().navigate(R.id.action_alarmasList_to_createAlarma)
        }
        binding.imModify.setOnClickListener {
            findNavController().navigate(R.id.action_alarmasList_to_modifyAlarma)
        }
        binding.imFlecha.setOnClickListener {
            findNavController().navigate(R.id.action_alarmasList_to_grupos_list)
        }
        binding.imDelete.setOnClickListener {
            findNavController().navigate(R.id.action_alarmasList_to_deleteAlarma)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}