package com.mustafasehirli.travel.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mustafasehirli.travel.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDataBase : RoomDatabase() {
    abstract fun PlaceDao(): PlaceDao
}