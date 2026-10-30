package com.Mangodemo.Basics_springboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class HwControllerRestController {

    @GetMapping
    open fun helloWorld() = "Site check"

}
class HWController {
}