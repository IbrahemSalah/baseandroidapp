package com.android.baseapp.data.database

class DbDataSourceImpl(val appDatabase: AppDatabase) : DbDataSource {

    override suspend fun getAllDataInTable() = appDatabase.baseAppDao().getAllDataInTable()
}