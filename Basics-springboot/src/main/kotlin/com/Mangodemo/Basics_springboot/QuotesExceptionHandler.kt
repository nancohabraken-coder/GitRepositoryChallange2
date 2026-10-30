package com.Mangodemo.Basics_springboot

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class QuotesExceptionHandler {

    @ExceptionHandler(QuoteNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    open fun onQuoteNotFound(e: QuoteNotFoundException) = mapOf(
        "errorCode" to "QuoteNotFound",
        "Message" to e.message
    )
}