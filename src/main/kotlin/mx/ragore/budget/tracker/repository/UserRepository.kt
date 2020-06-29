package mx.ragore.budget.tracker.repository

import mx.ragore.budget.tracker.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, Long>
