package khai.w1

import khai.general.SportInterface

interface ADDREMOVE {
    fun add(sport: Sport) : Boolean
    fun remove(sport: Sport) : Boolean
    fun contains(sport: Sport) : Boolean
    fun getAll(): Collection<Sport>
}

class ListADDREMOVE(val collection: MutableList<Sport>): ADDREMOVE{

    override fun add(sport: Sport): Boolean  = when{
        !collection.contains(sport) -> collection.add(sport)
        else -> false
    }

    override fun remove(sport: Sport): Boolean = when{
        collection.contains(sport) -> collection.remove(sport)
        else -> false
    }

    override fun contains(sport: Sport): Boolean = collection.contains(sport)

    override fun getAll(): List<Sport> {
        println("Команды:")
        for (index in 0 until collection.toList().size) {
            println(collection.toList()[index].getInfo())
        }

        return collection.toList()
    }
        }
