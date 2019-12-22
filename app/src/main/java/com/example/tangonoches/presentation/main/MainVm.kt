package com.example.tangonoches.presentation.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.tangonoches.di.DaggerMainComponent
import com.example.tangonoches.log
import com.example.tangonoches.models.Person
import com.example.tangonoches.responses.BaseResponse
import com.example.tangonoches.serviseies.GoogleDocService
import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.lang.Exception
import javax.inject.Inject

class MainVm : ViewModel() {

    @Inject
    lateinit var googleDocService: GoogleDocService

    init {
        DaggerMainComponent.create().inject(this)
    }

    fun getPeople(): Single<List<Person>> =
        googleDocService
            .getPeopleNeedAction("getPeople")
            .map { it.people }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError {
                log(it.localizedMessage)
            }

    fun addPerson(name: String, lastName: String): Completable =
        googleDocService
            .addPerson("addPerson", name, lastName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .flatMapCompletable {
                if (it.result == 0) {
                    Completable.complete()
                } else {
                    Completable.error(Exception("result != 0"))
                }
            }
}