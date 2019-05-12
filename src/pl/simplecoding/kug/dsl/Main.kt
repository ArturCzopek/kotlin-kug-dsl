package pl.simplecoding.kug.dsl

  fun main(args: Array<String>) {
    val tournament = tournament {
      name = "KUG Tournament"
      battles {
        knight("John") {
          level = 20
          equipment {
            "Sword" power 20
            "Shield" power 5
            "Nike Air Max" power 40
          }
          spells {
            "Hohoho" spellPower 4
          }
        } versus wizard("Mike") {
          level = 25
          equipment {
            "Rod" power 15
          }
          spells {
            "Vingardium Leviosa" spellPower 20
            "Not Found" spellPower 40
          }
        }
      }
    }

    println("Tournament winner: ${tournament.winner?.name ?: "NO ONE"}")
}
