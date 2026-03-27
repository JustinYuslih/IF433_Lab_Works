package oop_00000120765_JustinYuslih.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object{
        fun forgeStarterSword(): Weapon{
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon{
            val item = GameItem("Pedang Besi", 10, ItemRarity.EPIC)
            return Weapon(item, 50)
        }
    }
}