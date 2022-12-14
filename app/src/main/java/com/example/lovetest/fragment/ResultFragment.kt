package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_result.*

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        option = arguments?.getInt("index")?: -1    // 엘비스 연산자를 이용하여 전체가 null일 경우에 -1 이용

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        setResult(option)

        btn_home.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }

    }

    fun setResult(option: Int) {

        when(option) {
            1 -> {
                tv_main.text = "You are a QUITTER!"
                //tv_main.setText("")와 동일
                tv_sub.text = "You can let the person easily."
            }
            2 -> {
                tv_main.text = "You should focus on yorself"
                tv_sub.text = "You becomne really clingy to your ex."
            }
            3 -> {
                tv_main.text = "You should take it easy"
                tv_sub.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                tv_main.text = "You are pretty mature."
                tv_sub.text = "You can easily accept the break - up"
            }
        }
    }

}