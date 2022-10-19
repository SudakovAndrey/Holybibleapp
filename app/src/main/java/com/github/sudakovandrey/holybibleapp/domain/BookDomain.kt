package com.github.sudakovandrey.holybibleapp.domain

import com.github.sudakovandrey.holybibleapp.core.Abstract
import com.github.sudakovandrey.holybibleapp.presentation.BookUi

sealed class BookDomain : Abstract.Object<BookUi, Abstract.Mapper.Empty>() {
    class Success() : BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            TODO("Not yet implemented")
        }
    }

    class Fail(errorType: Int): BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            TODO("Not yet implemented")
        }

    }

}
