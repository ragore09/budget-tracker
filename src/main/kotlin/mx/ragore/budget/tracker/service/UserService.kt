package mx.ragore.budget.tracker.service

import mx.ragore.budget.tracker.model.dto.UserDTO

interface UserService {
    fun createUser(user: UserDTO): UserDTO
}