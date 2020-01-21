package com.example.domain.usecase.base

import io.reactivex.Observable

interface IObservableUseCase<T, in P> {
    fun execute(params: P): Observable<T>
}
