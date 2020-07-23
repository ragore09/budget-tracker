package mx.ragore.budget.tracker.model

import org.springframework.data.annotation.Id

data class User (
        @Id
        val id: Long,
        val name: String,
        val lastName: String,
        val createdAt: Long,
        val email: String
)
