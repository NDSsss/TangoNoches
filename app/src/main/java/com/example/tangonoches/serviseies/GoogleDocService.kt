package com.example.tangonoches.serviseies

import com.example.tangonoches.responses.BaseResponse
import com.example.tangonoches.responses.GetPeopleResponse
import io.reactivex.Single
import retrofit2.http.*

interface GoogleDocService {

    @GET("exec?action=addItem")
    fun getPeople(): Single<GetPeopleResponse>

    @GET("exec")
    fun getPeopleNeedAction(@Query("action") action:String): Single<GetPeopleResponse>

    @FormUrlEncoded
    @POST("exec")
    fun addPerson(
        @Query("action") action: String,
        @Field("firstName") name:String,
        @Field("lastName") lastName:String
    ): Single<BaseResponse>
}