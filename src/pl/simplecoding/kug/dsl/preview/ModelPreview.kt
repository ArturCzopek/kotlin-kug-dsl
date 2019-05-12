package pl.simplecoding.kug.dsl.preview

private enum class Profession(val label: String) {
  KNIGHT("Knight"),
  WIZARD("Wizard");
}


private data class Hero(
    val name: String, val profession: pl.simplecoding.kug.dsl.Profession, var level: Int,
    val equipment: List<Item>, val spells: List<Spell>, val power: Double
)

private class Item(val name: String, val power: Int)

private class Spell(val name: String, val power: Int)

private class Battle(private val hero1: Hero, private val hero2: Hero, val winner: Hero)

private class Tournament(val name: String, val battles: List<Battle>, val winner: Hero)