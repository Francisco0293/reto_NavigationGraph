package mx.edu.itm.link.reto_navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import mx.edu.itm.link.reto_navigationgraph.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        val navController = findNavController()
        binding.buttonHomeToInside.setOnClickListener {
            val nameArgument = binding.editTextName.text.toString()
            val middleArgument = binding.editTextMiddle.text.toString()
            val lastArgument = binding.editTextLast.text.toString()
            val userArgument = binding.editTextUser.text.toString()
            val mailArgument = binding.editTextEmail.text.toString()
            val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(nameArgument,middleArgument,lastArgument,userArgument,mailArgument)
            navController.navigate(directions)
        }

        return binding.root
    }

}