package oop_00000120765_JustinYuslih.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> "Ketemu Monster ${event.monsterName}"
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("[LOOT] Kamu mendapatkan item baru!")
            println(">> Nama: $name | Damage: $damage | Rarity: $rarity (Drop Chance: ${rarity.dropChance}%)")
        }
        is BattleState.GameOver -> "Game Selesai Karena ${event.reason}"
        is BattleState.SafeZone -> "Kamu lagi di Safe Zone"
    }
}