package pl.simplecoding.kug.dsl

fun battles(vararg battles: Battle) = battles.toList()

fun spells(vararg spells: Spell) = spells.toList()

fun items(vararg items: Item) = items.toList()

infix fun Hero.versus(opponent: Hero) = Battle(this, opponent)

infix fun String.power(power: Int) = Item(this, power)

infix fun String.spellPower(power: Int) = Spell(this, power)
