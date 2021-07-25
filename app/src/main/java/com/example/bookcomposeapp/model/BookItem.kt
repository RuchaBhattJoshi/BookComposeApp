package com.example.bookcomposeapp.model

import kotlinx.serialization.Serializable

@Serializable
data class BookItem(
    val authors: List<String> = emptyList(),
    val categories: List<String> = emptyList(),
    val isbn: String,
    val longDescription: String,
    @Transient val pageCount: Int,
    val publishedDate: String,
    val shortDescription: String,
    @Transient val status: String,
    val thumbnailUrl: String,
    val title: String
)