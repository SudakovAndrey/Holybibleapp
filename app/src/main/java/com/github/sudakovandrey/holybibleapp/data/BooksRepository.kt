package com.github.sudakovandrey.holybibleapp.data

interface BooksRepository {

    suspend fun fetchBooks(): BookData

    class Base(private val booksCloudDataSource: BooksCloudDataSource) : BooksRepository {
        override suspend fun fetchBooks() = try {
            val list = booksCloudDataSource.fetchBooks()
            BookData.Success(list)
        } catch (e: Exception) {
            BookData.Fail(e)
        }
    }
}