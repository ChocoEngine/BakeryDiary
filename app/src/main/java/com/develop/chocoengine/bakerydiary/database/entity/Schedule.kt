package com.develop.chocoengine.bakerydiary.database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "schedule")
data class Schedule (
        @PrimaryKey(autoGenerate = true) var id:Int,
        @ColumnInfo(name = "title") var title:String,
        @ColumnInfo(name = "version") var version:String
    )