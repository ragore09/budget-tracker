package mx.ragore.budget.tracker.model

import org.springframework.data.annotation.Id

data class Budget (
        @Id
        val id: String,
        val userId: Long,
        val createdAt: Long,
        val amount: Double,
        val startDate: Long,
        val endDate: Long,
        val remaining: Double,
        val description: String
)
