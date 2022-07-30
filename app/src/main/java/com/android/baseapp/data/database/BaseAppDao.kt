package com.android.baseapp.data.database

import androidx.room.*
import com.android.baseapp.data.model.BaseAppResponse

@Dao
interface BaseAppDao {

    @Query("SELECT * FROM cereal_table ORDER BY dbId DESC LIMIT 1")
    fun getAllDataInTable(): BaseAppResponse
}