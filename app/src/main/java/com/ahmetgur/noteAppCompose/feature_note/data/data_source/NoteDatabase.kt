package com.ahmetgur.noteAppCompose.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ahmetgur.noteAppCompose.feature_note.domain.model.Note
import com.ahmetgur.noteappcompose.R

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = context.getString(R.string.notes_db)
    }
}