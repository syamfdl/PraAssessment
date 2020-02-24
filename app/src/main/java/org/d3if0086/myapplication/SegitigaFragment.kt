package org.d3if0086.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3if0086.myapplication.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(inflater, R.layout.fragment_segitiga, container, false)

        //Write Code Here
        binding.btnHitung.setOnClickListener {
            var alasSegitiga = etAlasSegitiga.text.toString().toDouble()
            var tinggiSegitiga = etTinggiSegitiga.text.toString().toDouble()

            var luasSegitiga = 0.5*(alasSegitiga * tinggiSegitiga)
            var kelilingSegitiga = alasSegitiga*alasSegitiga+alasSegitiga

            tvLuasSegitiga.text = "Luas = " + luasSegitiga.toString()
            tvKelilingSegitiga.text = "Keliling = " + kelilingSegitiga.toString()
        }

        return binding.root
    }


}
