package khai.w1

import khai.general.League
import khai.general.TypeSports
import khai.general.Country
import khai.w1.Sport
import khai.w1.SportsClass


data class Hoсkey_club(
        override var club: String = "",
        override   var typeSports: TypeSports,
        override var country: Country,
        override var coach:String = "",
        override var league: League,
        override var yearofFoundation: String, override var price: Double, override var rating: Int

): SportsClass(){

    override fun getShortInfo(): String {
        return "$typeSports club $club   ($country, $league)"
    }

}

