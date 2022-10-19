package com.github.sudakovandrey.holybibleapp.data

import com.github.sudakovandrey.holybibleapp.core.Abstract
import com.github.sudakovandrey.holybibleapp.data.net.BooksServerModel
import com.github.sudakovandrey.holybibleapp.domain.BookDomain

sealed class BookData : Abstract.Object<BookDomain, BooksDataToDomainMapper>() {
    class Success(private val books: List<BooksServerModel>) : BookData() {
        override fun map(mapper: BooksDataToDomainMapper) = mapper.map(books)
    }

    class Fail(private val e: Exception) : BookData() {
        override fun map(mapper: BooksDataToDomainMapper) = mapper.map(e)
    }
}
