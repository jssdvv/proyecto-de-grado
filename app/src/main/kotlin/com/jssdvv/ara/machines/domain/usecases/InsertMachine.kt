package com.jssdvv.ara.machines.domain.usecases

import com.jssdvv.ara.machines.domain.models.InvalidMachineException
import com.jssdvv.ara.machines.domain.models.MachineEntity
import com.jssdvv.ara.machines.domain.repositories.MachineRepository

class InsertMachine(
    private val repository: MachineRepository
) {
    @Throws(InvalidMachineException::class)
    suspend operator fun invoke(entity: MachineEntity) {
        if (entity.name.isBlank()) {
            throw InvalidMachineException("La máquina debe tener un nombre")
        }
        if (entity.category.isBlank()) {
            throw InvalidMachineException("La máquina debe tener una categoría")
        }
        repository.insertMachine(entity)
    }
}