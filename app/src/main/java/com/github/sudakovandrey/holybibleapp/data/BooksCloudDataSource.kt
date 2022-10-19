package com.github.sudakovandrey.holybibleapp.data

import com.github.sudakovandrey.holybibleapp.data.net.BooksServerModel
import com.github.sudakovandrey.holybibleapp.data.net.BooksService

interface BooksCloudDataSource {

    suspend fun fetchBooks(): List<BooksServerModel>

    class Base(private val service: BooksService) : BooksCloudDataSource {
        override suspend fun fetchBooks() = service.fetchBooks()
    }
}