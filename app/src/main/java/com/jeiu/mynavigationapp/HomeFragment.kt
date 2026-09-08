package com.jeiu.mynavigationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jeiu.mynavigationapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding: FragmentHomeBinding
        get() = _binding!!

    override fun onCreateView(  // 최초에 화면이 만들어질 때
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )


        return binding.root
    }

    override fun onViewCreated(   // 화면이 이미 만들어진 다음 실행됨
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        // 나중에 버튼 이벤트 작성
        binding.btnMoveMenu.setOnClickListener {
            findNavController().navigate(
                R.id.action_homeFragment_to_menuFragment
            )
        }
    }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}