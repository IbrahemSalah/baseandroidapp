package com.android.baseapp.data.database

import com.android.baseapp.data.model.BaseAppResponse

interface DbDataSource {
    suspend fun getAllDataInTable(): BaseAppResponse
}