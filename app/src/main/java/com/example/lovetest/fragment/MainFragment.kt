package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    // onViewCreated에서 초기화를 해야되기 때문에 나중에 할 수 있게 설정
    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater,
                               container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    // 뷰가 만들어지고 나서 호출되는 함수
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        // 해당 id=view(btn_next)를 누를 시 다음 페이지로 넘어감
        btn_next.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }

}