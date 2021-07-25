package com.example.bookcomposeapp.utils

import com.example.bookcomposeapp.model.BookItem

sealed class DetailState {
    object Empty: DetailState()
    object Loading : DetailState()
    data class Success(val data: BookItem) : DetailState()
    data class Error(val exception: Throwable) : DetailState()
}