package com.lokodom.myworkoutroutines.domain.model

import com.lokodom.myworkoutroutines.R

data class Equipment(
    val id: Int,
    val name: String
)

data class EquipmentDisplay(
    val equipment: Equipment,
    val image: Int
)

val equipmentList: List<EquipmentDisplay> = listOf(
    EquipmentDisplay(Equipment(1,"Barbell"), R.drawable.barbell),
    EquipmentDisplay(Equipment(2,"SZ-Bar"), R.drawable.sz_bar),
    EquipmentDisplay(Equipment(3,"Dumbell"), R.drawable.dumbells),
    EquipmentDisplay(Equipment(4,"Gym mat"), R.drawable.gym_mat),
    EquipmentDisplay(Equipment(5,"Swiss Ball"), R.drawable.swiss_ball),
    EquipmentDisplay(Equipment(6,"Pull-up bar"), R.drawable.pull_up_bar),
    EquipmentDisplay(Equipment(7,"none (bodyweight exercise)"), R.drawable.body),
    EquipmentDisplay(Equipment(8,"Bench"), R.drawable.flat_bench),
    EquipmentDisplay(Equipment(9,"Incline bench"), R.drawable.bench),
    EquipmentDisplay(Equipment(10,"Kettlebell"), R.drawable.kettlebell)
)
