package com.ahmetgur.noteAppCompose.feature_note.domain.use_case

import com.ahmetgur.noteAppCompose.feature_note.domain.model.InvalidNoteException
import com.ahmetgur.noteAppCompose.feature_note.domain.model.Note
import com.ahmetgur.noteAppCompose.feature_note.domain.repository.NoteRepository
import com.ahmetgur.noteappcompose.R

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw InvalidNoteException(context.getString(R.string.titleException))
        }
        if (note.content.isBlank()){
            throw InvalidNoteException(context.getString(R.string.contentException))
        }
        repository.insertNote(note)
    }
}