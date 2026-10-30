package com.Mangodemo.Basics_springboot

import com.Mangodemo.Basics_springboot.repository.QuotesRepository
import org.springframework.stereotype.Service

@Service
class QuotesService(
    private val quotesRepository: QuotesRepository
) {

    open fun getQuote() = quotesRepository.getQuotes()

    open fun insertQuote(quote: QuoteDTO): QuoteDTO{
       return quotesRepository.insertQuote(quote)

    }

    open fun updateQuote(quote: QuoteDTO) :QuoteDTO{
       return quotesRepository.updateQuote(quote)

    }

    open fun deleteQuote(quoteId:Long){
       if( quotesRepository.deleteQuote(quoteId)){
           throw QuoteNotFoundException(quoteId)
       }
        }

}