package com.example.domain.data.repository

import com.example.domain.data.entity.BookEntity
import com.example.domain.repository.IBookRepository
import io.reactivex.Observable

class FakeBookRepository : IBookRepository {
    override fun getAllBooks(): Observable<List<BookEntity>> {
        return Observable.just(
            listOf(BookEntity("L'étranger", "Albert Camus"), BookEntity("L'Iliade", "Homère"))
        )
    }
}