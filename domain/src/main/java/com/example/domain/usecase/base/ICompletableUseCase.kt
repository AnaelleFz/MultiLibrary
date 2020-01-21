package com.example.domain.usecase.base

import io.reactivex.Completable

interface ICompletableUseCase<in P> {
    fun execute(params: P): Completable
}
