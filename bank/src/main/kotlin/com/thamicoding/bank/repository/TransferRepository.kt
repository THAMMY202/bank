package com.thamicoding.bank.repository

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface TransferRepository : CrudRepository<TransactionDbModel, UUID> {
}