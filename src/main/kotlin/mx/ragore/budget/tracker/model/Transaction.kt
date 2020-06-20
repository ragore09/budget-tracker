package mx.ragore.budget.tracker.model

data class Transaction (
        val userId: Long,
        val createdAt: Long = System.currentTimeMillis(),
        val amount: Double,
        val category: Int,
        val budgetId: Long,
        val description: String
)
