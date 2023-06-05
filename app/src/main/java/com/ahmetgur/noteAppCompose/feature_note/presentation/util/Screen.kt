package com.ahmetgur.noteAppCompose.feature_note.presentation.util

import com.ahmetgur.noteappcompose.R

sealed class Screen(val route: String){
    object NotesScreen: Screen(context.getString(R.string.noteScreen))
    object AddEditNoteScreen: Screen(context.getString(R.string.addEditNoteScreen))
}
