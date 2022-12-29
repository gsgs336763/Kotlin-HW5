package com.example.lab11

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import com.example.lab11.MyDBHelper
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.ArrayAdapter
import android.os.Bundle
import com.example.lab11.R
import android.widget.Toast

class MyDBHelper internal constructor(context: Context?) :
    SQLiteOpenHelper(context, name, null, version) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE myTable(book text PRIMARY KEY, price integer NOT NULL)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS myTable")
        onCreate(db)
    }

    companion object {
        private const val name = "mdatabase.db"
        private const val version = 1
    }
}