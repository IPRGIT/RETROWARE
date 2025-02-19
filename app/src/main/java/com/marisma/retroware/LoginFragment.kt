package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.marisma.retroware.databinding.FragmentLoginBinding



class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.buttonLogin.setOnClickListener {
            val usernameInput = binding.editTextUsername.text.toString().trim()

            if (usernameInput.isNotEmpty()) {
                // Navegar a ViewPagerFragment con el nombre de usuario
                val action = LoginFragmentDirections.actionLoginFragment2ToViewPagerFragment(username = usernameInput)
                findNavController().navigate(action)
            } else {
                Toast.makeText(requireContext(), "Por favor, introduce tu nombre", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}