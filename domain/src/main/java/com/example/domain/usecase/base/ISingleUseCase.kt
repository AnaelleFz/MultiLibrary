package com.example.domain.usecase.base

import io.reactivex.Single

interface ISingleUseCase<T, in P> {
    fun execute(params: P): Single<T>
}
