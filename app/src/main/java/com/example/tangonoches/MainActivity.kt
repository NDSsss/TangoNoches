package com.example.tangonoches

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.tangonoches.presentation.main.MainVm
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainVm: MainVm
    var peopleDispossable: Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainVm = ViewModelProviders.of(this).get(MainVm::class.java)
        setContentView(R.layout.activity_main)
        act_main_btn_load.setOnClickListener {
            peopleDispossable = mainVm.getPeople().subscribe { people ->
                act_main_tv.text = people.joinToString("\n")
            }
        }
        act_main_btn_add.setOnClickListener {
            peopleDispossable = mainVm.addPerson(
                act_main_et_name.text.toString(),
                act_main_et_last_name.text.toString()
            ).subscribe(
                { toast(this, "Success")},
                { toast(this, "Fial")}
            )
        }
    }
}

fun log(message:String){
    Log.d("APP_TAG", message)
}

fun toast(context: Context, message: String){
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}
