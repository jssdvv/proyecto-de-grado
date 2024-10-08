package com.jssdvv.ara.machines.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jssdvv.ara.machines.domain.models.ActivityEntity
import com.jssdvv.ara.machines.domain.models.MachineEntity
import com.jssdvv.ara.machines.domain.models.MachinesTypeConverters

@Database(
    entities = [
        MachineEntity::class,
        ActivityEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(MachinesTypeConverters::class)
abstract class MachinesDatabase : RoomDatabase() {
    abstract val machineDao: MachineDao
    abstract val activityDao: ActivityDao

    companion object {
        const val DATABASE_NAME = "machinesDatabase"
    }
}