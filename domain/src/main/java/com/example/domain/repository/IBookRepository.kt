package com.example.domain.repository

import com.example.domain.data.entity.BookEntity
import io.reactivex.Observable

interface IBookRepository {
    fun getAllBooks(): Observable<List<BookEntity>>
}