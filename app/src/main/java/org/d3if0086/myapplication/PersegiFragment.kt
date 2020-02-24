package org.d3if0086.myapplication


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi.*
import org.d3if0086.myapplication.databinding.FragmentPersegiBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPersegiBinding>(inflater, R.layout.fragment_persegi, container, false)

        //Write Code Here
        binding.btnHitung.setOnClickListener {
            var panjangPersegi = etPanjang.text.toString().toDouble()
            var lebarPersegi = etLebar.text.toString().toDouble()

            var luasPersegi = panjangPersegi * lebarPersegi
            var kelilingPersegi = 2*(panjangPersegi+lebarPersegi)

            tvLuasSegitiga.text = "Luas = " + luasPersegi.toString()
            tvKelilingSegitiga.text = "Keliling = " + kelilingPersegi.toString()
        }

        binding.btnShare.setOnClickListener {  }
        return binding.root
    }

}
