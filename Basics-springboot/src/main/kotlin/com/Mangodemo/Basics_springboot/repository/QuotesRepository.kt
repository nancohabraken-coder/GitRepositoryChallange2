package com.Mangodemo.Basics_springboot.repository

import com.Mangodemo.Basics_springboot.QuoteDTO
import org.springframework.stereotype.Repository

@Repository
class QuotesRepository {

    private val quotes = mutableListOf<QuoteDTO>()

    open fun getQuotes() = quotes

    open fun insertQuote(quote: QuoteDTO): QuoteDTO{
        quotes.add(quote)
        return quote
    }
    open fun updateQuote(quote: QuoteDTO): QuoteDTO {
        val index = quotes.indexOfFirst { it.id == quote.id }
        quotes[index] = quote
        return quote
    }

    open fun deleteQuote(quoteId:Long): Boolean {
        val quoteToDelete = quotes.find { it.id == quoteId }
       return if (quoteToDelete != null) {
            quotes.remove(quoteToDelete)
           true
        } else {
             false
        }
    }

}