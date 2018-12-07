package khai.amo.catalog.w3




import khai.amo.catalog.w2.SportManager
import khai.general.League
import khai.general.TypeSports
import khai.w1.initDataClasses

fun main(args: Array<String>) {


    val list = initDataClasses()
    val manager = SportManager
    list.forEach { println("Adding: "+manager.add(it)) }
    println(manager.getAll())

    println( "Writting: " + manager.write() )
            //println( "Clear: " + manager.clear() )
    //println( "All records after clearing: " + manager.getAll())

    //println( "Loading: " + manager.load() )
   // println( "All records after loading: " + manager.getAll())

    SportFactory.create(League.Liga_1)
        ?.let{
            it.setContentInfo(

                    TypeSports.NONE,
                    "",
                    "Париж",
                    "Парк де Пренс",
                    "Тиаго Силва",
                    "Томас Тухель",
                    "",
                    "Qatar Sports Investments"



            ).setBasicInformation(
                    "ПСЖ",
                    TypeSports.basketball,
                    "1970"
            )
            println("Adding created: " + manager.add(it) )
        }
    println(manager.getAll())
    println( "Writting: " + manager.write() )

}