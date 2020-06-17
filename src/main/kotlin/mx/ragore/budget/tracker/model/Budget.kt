package mx.ragore.budget.tracker.model

data class Budget (
        val userId: Int,
        val createdAt: Long,
        val amount: Double,
        val startDate: Long,
        val endDate: Long,
        val remaining: Double,
        val description: String
)