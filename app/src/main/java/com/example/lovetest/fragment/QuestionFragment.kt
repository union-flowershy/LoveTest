package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_question.*

/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

// 상속은 하나만 받을 수 있지만, 인터페이스는 여러개 받을 수 있다.
class QuestionFragment : Fragment(), View.OnClickListener {

    // onViewCreated에서 초기화를 해야되기 때문에 나중에 할 수 있게 설정
    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater,
                               container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    // 뷰가 만들어지고 나서 호출되는 함수
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_next2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.btn_next2 -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }
}