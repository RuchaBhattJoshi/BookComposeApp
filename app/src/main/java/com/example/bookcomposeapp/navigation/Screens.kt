package com.example.bookcomposeapp.navigation

import androidx.annotation.StringRes
import com.example.bookcomposeapp.R

sealed class Screens(val route: String, @StringRes val resourceId: Int) {
    object BookList : Screens("book_list", R.string.text_bookList)
    object Details : Screens("book_details", R.string.text_bookDetails)
}
