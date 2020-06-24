package mx.ragore.budget.tracker.repository

import mx.ragore.budget.tracker.model.Transaction
import org.springframework.data.mongodb.repository.MongoRepository

interface TransactionRepository : MongoRepository<Transaction, String>