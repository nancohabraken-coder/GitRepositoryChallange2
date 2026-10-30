package com.Mangodemo.Basics_springboot

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.net.URL

@RestController
@RequestMapping("/Quotes")
class QuoteController(
    private val quotesService: QuotesService
) {
    open val quotes = mutableListOf<QuoteDTO>()

    @GetMapping
    open fun loadQuotes(
        @RequestParam(value = "q", required = false) query: String?,
    ): List<QuoteDTO> {
        return quotesService.getQuote()
    }

    @PostMapping
    open fun postQuote(
        @RequestBody quoteDTO: QuoteDTO
    ): QuoteDTO {
        return quotesService.insertQuote(quote=quoteDTO)
    }

    @PutMapping
    open fun putQuote(
        @RequestBody quoteDTO: QuoteDTO
    ): QuoteDTO {
        return quotesService.updateQuote(quote=quoteDTO)
    }
@DeleteMapping("/{id}")
open fun deleteQuote(
    @PathVariable("id") id: Long
) {
    val quoteToDelete = quotes.find { it.id == id }
     if (quoteToDelete != null) {
        quotes.remove(quoteToDelete)
    }else {
        return quotesService.deleteQuote(id)

    }
}

}

class `Quote controller` {
}