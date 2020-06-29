package mx.ragore.budget.tracker.controller

import mx.ragore.budget.tracker.model.dto.UserDTO
import mx.ragore.budget.tracker.service.UserService
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController("/user")
class UserController(private val userService: UserService) {

    @GetMapping(name = "/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getUser(@PathVariable id: Long): EntityModel<UserDTO> {
        val response = userService.getUser(id)
        return EntityModel.of(
                response,
                linkTo(methodOn(UserController::class.java).getUser(response.id!!)).withSelfRel())
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun createUser(@RequestBody user: UserDTO): EntityModel<UserDTO> {
        val response = userService.createUser(user)
        return EntityModel.of(
                response,
                linkTo(methodOn(UserController::class.java).getUser(response.id!!)).withSelfRel())
    }

}
