package com.github.sudakovandrey.holybibleapp.data

import com.github.sudakovandrey.holybibleapp.core.Abstract
import com.github.sudakovandrey.holybibleapp.data.net.BooksServerModel
import com.github.sudakovandrey.holybibleapp.domain.BookDomain
import retrofit2.HttpException
import java.net.UnknownHostException

interface BooksDataToDomainMapper : Abstract.Mapper {
    fun map(books: List<BooksServerModel>): BookDomain
    fun map(e: Exception): BookDomain

    class Base : BooksDataToDomainMapper {
        override fun map(books: List<BooksServerModel>): BookDomain {
            return BookDomain.Success()
        }

        override fun map(e: Exception): BookDomain {
            val errorType = when (e) {
                is UnknownHostException -> 0 //enum class ErrorType { NoConnection
                is HttpException -> 1 // ServerUnavailable
                else -> 2 // GenericException
            }
            return BookDomain.Fail(errorType)
        }
    }
}