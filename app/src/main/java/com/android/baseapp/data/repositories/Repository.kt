package com.android.baseapp.data.repositories


import com.android.baseapp.data.database.DbDataSource
import com.android.baseapp.data.model.APIResult
import com.android.baseapp.data.model.BaseAppResponse
import com.android.baseapp.data.raw.RawDataSource
import com.android.baseapp.data.sharedpref.PrefDataSource

interface Repository : PrefDataSource, DbDataSource, RawDataSource {

    suspend fun getBaseAppResponse(): APIResult<BaseAppResponse>
    fun dummyOffline(): APIResult<String>
}
