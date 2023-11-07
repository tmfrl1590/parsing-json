package com.json.parsing_json.network

import com.json.parsing_json.model.Question
import retrofit2.http.GET
import javax.inject.Singleton


@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}