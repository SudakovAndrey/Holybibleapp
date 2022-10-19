package com.github.sudakovandrey.holybibleapp.data.net

import com.github.sudakovandrey.holybibleapp.core.Abstract
import com.github.sudakovandrey.holybibleapp.data.BookData
import com.google.gson.annotations.SerializedName

data class BooksServerModel(
    @SerializedName("id")
    private val id: Int,
    @SerializedName("name")
    private val name: String
) : Abstract.Object<BookData, BookServerToDataMapper>() {
    override fun map(mapper: BookServerToDataMapper): BookData {
        return mapper.map(id, name)
    }
}