package com.android.baseapp.data.remote

import com.android.baseapp.data.model.BaseAppResponse
import retrofit2.Response

interface RemoteDataSource {

    suspend fun getBaseAppResponse(): Response<BaseAppResponse>
}