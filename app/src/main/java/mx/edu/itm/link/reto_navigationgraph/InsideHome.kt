package mx.edu.itm.link.reto_navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.edu.itm.link.reto_navigationgraph.databinding.FragmentInsideHomeBinding

class InsideHome : Fragment() {

    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideHomeBinding.inflate(layoutInflater)

        val argumentoRecibido = arguments?.getString("argumentoNombre")
        binding.textView2.setText(argumentoRecibido)

        val argumentoRecibido2 = arguments?.getString("argumentoApellidoPaterno")
        binding.textView3.setText(argumentoRecibido2)

        val argumentoRecibido3 = arguments?.getString("argumentoApellidoMaterno")
        binding.textView4.setText(argumentoRecibido3)

        val argumentoRecibido4 = arguments?.getString("argumentoUsuario")
        binding.textView5.setText(argumentoRecibido4)

        val argumentoRecibido5 = arguments?.getString("argumentoCorreo")
        binding.textView8.setText(argumentoRecibido5)
        return binding.root
    }

}