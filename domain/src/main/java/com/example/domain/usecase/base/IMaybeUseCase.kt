package com.example.domain.usecase.base

import io.reactivex.Maybe

interface IMaybeUseCase<T, in P> {
    fun execute(params: P): Maybe<T>
}
