package com.github.sudakovandrey.holybibleapp.data.net

import com.github.sudakovandrey.holybibleapp.core.Abstract
import com.github.sudakovandrey.holybibleapp.data.BookData

interface BookServerToDataMapper : Abstract.Mapper {
    fun map(id: Int, name: String): BookData
}