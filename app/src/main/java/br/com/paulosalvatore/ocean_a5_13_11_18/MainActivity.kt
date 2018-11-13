package br.com.paulosalvatore.ocean_a5_13_11_18

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

	    val usuariosViewModel = ViewModelProviders.of(this).get(UsuariosViewModel::class.java)

        /*if (usuariosViewModel.nome != "") {
            textView.text = usuariosViewModel.nome
        }*/

        textView.setOnClickListener {
            usuariosViewModel.nome.value = "Paulo"
//            textView.text = "Paulo"
//            usuariosViewModel.nome = textView.text.toString()
        }

        usuariosViewModel.nome.observe(this, Observer<String> { nome ->
            textView.text = nome
        })

	    /*savedInstanceState?.let {
		    val nome = it.getString("NOME")
		    textView.text = nome
	    }*/
    }

	/*override fun onSaveInstanceState(outState: Bundle?) {
		super.onSaveInstanceState(outState)
		outState?.putString("NOME", textView.text.toString())
	}*/
}
