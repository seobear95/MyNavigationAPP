package com.jeiu.mynavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jeiu.mynavigationapp.databinding.FragmentMenuBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding : FragmentMenuBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_menu, container, false)
        _binding = FragmentMenuBinding.inflate(
            inflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(   // 화면이 이미 만들어진 다음 실행됨
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        // 나중에 버튼 이벤트 작성
        binding.btnAndroid.setOnClickListener {
            moveToDetail("Android")
        }
        binding.btnKotlin.setOnClickListener {
            moveToDetail("Kotlin")
        }
        binding.btnBackHome.setOnClickListener {
            findNavController().popBackStack()
        }



    }

    private fun moveToDetail(subjectText : String){
        val bundle = Bundle()
        bundle.putString(
            "subject",   // key
            subjectText    // value
        )

        findNavController().navigate(
            R.id.action_menuFragment_to_detailFragment
            , bundle
        )
    }


}