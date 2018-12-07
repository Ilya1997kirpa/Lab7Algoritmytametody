package khai.w1

import khai.general.League
import khai.general.TypeSports
import khai.general.Country

data class Basketball_club(
        override var club: String = "",
        override   var typeSports: TypeSports,
        override var country: Country,
        override var coach:String = "",
        override var league: League,
        override var yearofFoundation: String,
        override var price: Double,
        override var rating: Int,
        override var city: String

): SportsClass(){

    override fun setContentInfo(typeSport: TypeSports, club: String, city: String, stadium: String, captain: String, coach: String, yearofFoundation: String, holder: String): Sport {
        return super.setContentInfo(typeSport, club, city, stadium, captain, coach, yearofFoundation, holder)
    }
    override fun getShortInfo(): String {
        return "$club ($country)< $yearofFoundation > < $coach>, стоимость: $$price млрд"
    }
}
