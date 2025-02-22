package com.marisma.retroware

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.marisma.retroware.data.userName
import com.marisma.retroware.databinding.FragmentUserInfoBinding



class UserInfoFragment : Fragment() {

    private var _binding: FragmentUserInfoBinding? = null
    private val binding get() = _binding!!
    private var username: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            username = it.getString("USERNAME")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mostrar el nombre de usuario
        binding.usernameText.text = userName.nombre

        // Configurar el botón para cambiar la imagen
        binding.btnChangeImage.setOnClickListener {
            // Aquí puedes implementar la lógica para abrir la galería o la cámara
            openImagePicker()
        }
    }



    private fun openImagePicker() {
        // Implementa la lógica para abrir la galería o la cámara
        // Por ejemplo, puedes usar un Intent para abrir la galería
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, REQUEST_CODE_PICK_IMAGE)
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_PICK_IMAGE && resultCode == Activity.RESULT_OK) {
            val imageUri = data?.data
            imageUri?.let {
                // Usar Glide para cargar la imagen con un borde circular
                Glide.with(this)
                    .load(imageUri)
                    .circleCrop() // Aplicar el efecto de recorte circular
                    .into(binding.profileImage)
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    companion object {

        private const val REQUEST_CODE_PICK_IMAGE = 100

        fun newInstance(username: String) = UserInfoFragment().apply {
            arguments = Bundle().apply {
                putString("USERNAME", username)
            }
        }
    }
}
