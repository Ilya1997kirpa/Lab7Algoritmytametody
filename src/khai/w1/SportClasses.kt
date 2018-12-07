package khai.w1

import khai.general.Country
import khai.general.League
import khai.general.TypeSports


abstract class SportsClass: Sport {
    override fun setContentInfo(typeSport: TypeSports, club: String, city: String, stadium: String,
                                captain: String, coach: String,
                                yearofFoundation: String, holder: String): Sport {
       this.typeSports=typeSports
        this.club=club
        this.city=city
        this.stadium=stadium
        this.captain=captain
        this.coach=coach
        this.yearofFoundation=yearofFoundation
        this.holder=holder
        return this
    }
    override var club: String = ""
    override var typeSports: TypeSports = TypeSports.NONE
    override var mark = 0
    override var overlooked = false
    override var city: String = ""
    override var captain: String =""
    override var country: Country = Country.NONE
    override var coach: String = ""
    override var stadium: String = ""
    override var holder: String = ""
    override var league: League = League.NONE

    override fun getInfo(): String {

        return "${getShortInfo()}, $stadium, "+(super.getInfo() )
    }
    override fun setBasicInformation(club: String, typeSport: TypeSports, yearofFoundation: String): Sport {
        this.club = club
        this.typeSports = typeSports
        this.yearofFoundation = yearofFoundation
        return this
        }
    }






/*
Decorator pattern
Strategy pattern
 */
//        val infoStrategy: (String)->String


//
//fun AudioClass.readProperties():List<KProperty1<AudioClass, *>>{
//    val classInst = this.javaClass.kotlin
//    val fieldList = mutableListOf<KProperty1<AudioClass,*>>()
//
//    fieldList.addAll(classInst.declaredMemberProperties)
//    fieldList.addAll( (classInst.superclasses[0] as KClass<AudioClass>).declaredMemberProperties)
//
//    return fieldList
//}
//
//fun AudioClass.propertiesToString():List<String>{
//    val propList = this.readProperties()
//    return propList.map { it.name }
//}