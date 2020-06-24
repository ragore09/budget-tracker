package mx.ragore.budget.tracker.repository

import mx.ragore.budget.tracker.model.Budget
import org.springframework.data.mongodb.repository.MongoRepository

interface BudgetRepository : MongoRepository<Budget, String> 