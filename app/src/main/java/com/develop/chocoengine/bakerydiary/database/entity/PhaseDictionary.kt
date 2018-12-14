package com.develop.chocoengine.bakerydiary.database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "phasedictionary")
data class PhaseDictionary (
        @PrimaryKey(autoGenerate = true) var id:Int,
        @ColumnInfo(name = "text") var text:String
    )