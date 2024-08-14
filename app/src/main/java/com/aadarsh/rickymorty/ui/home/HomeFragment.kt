package com.aadarsh.rickymorty.ui.home
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aadarsh.rickymorty.databinding.FragmentHomeBinding
import com.aadarsh.rickymorty.utils.click
class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        setUpUi()
        return binding.root
    }
    private fun setUpUi() = with(binding) {
        imageCharacters.click {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToListFragment())
        }
    }
}