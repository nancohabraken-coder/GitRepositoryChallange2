package com.Mangodemo.Basics_springboot

class QuoteNotFoundException(
private val id: Long
): RuntimeException(
    "A quote with ID $id not found"
)
