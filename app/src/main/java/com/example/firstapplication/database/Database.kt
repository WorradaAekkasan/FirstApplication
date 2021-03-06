package com.example.firstapplication.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase(){
    abstract val contactDao: ContactDao
    companion object{
        @Volatile
        private var INSTANCE: com.example.firstapplication.database.Database? = null
        fun getInstance(context: Context): com.example.firstapplication.database.Database {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        com.example.firstapplication.database.Database::class.java,
                        "database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}