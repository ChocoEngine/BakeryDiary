package com.develop.chocoengine.bakerydiary.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.develop.chocoengine.bakerydiary.database.dao.PhaseDictionaryDao
import com.develop.chocoengine.bakerydiary.database.entity.PhaseDictionary
import com.develop.chocoengine.bakerydiary.database.entity.Recipes
import com.develop.chocoengine.bakerydiary.database.entity.Schedule

@Database(entities = arrayOf(PhaseDictionary::class, Recipes::class, Schedule::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun phaseDictionaryDao(): PhaseDictionaryDao
}