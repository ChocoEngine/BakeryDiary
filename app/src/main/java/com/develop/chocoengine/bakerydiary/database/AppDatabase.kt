package com.develop.chocoengine.bakerydiary.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.develop.chocoengine.bakerydiary.dao.PhaseDictionaryDao
import com.develop.chocoengine.bakerydiary.entity.PhaseDictionary

@Database(entities = arrayOf(PhaseDictionary::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun phaseDictionaryDao(): PhaseDictionaryDao
}