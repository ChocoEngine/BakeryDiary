package com.develop.chocoengine.bakerydiary.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.develop.chocoengine.bakerydiary.database.entity.PhaseDictionary

@Dao
interface PhaseDictionaryDao {

    @Query("SELECT * FROM phasedictionary")
    fun getPhases(): List<PhaseDictionary>

    @Query("SELECT * FROM phasedictionary WHERE id=:id")
    fun getPhaseById(id:Int): PhaseDictionary
}
