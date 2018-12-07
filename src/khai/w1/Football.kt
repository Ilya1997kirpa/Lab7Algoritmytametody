package khai.w1

import khai.general.*

data class Football_club(
        override var club: String = "",
        override var city: String="город ",
        override var country: Country = Country.NONE,
        override var stadium: String = "",
        override var league: League = League.NONE,
        override var captain: String = "",
        override var yearofFoundation: String,
        override var price: Double,
        override var coach: String,
        override var holder: String,
        override var typeSports: TypeSports,
        override var rating: Int

): SportsClass() {

    override fun setBasicInformation(club: String, typeSport: TypeSports, yearofFoundation: String): Sport {
        println("$club, $typeSport, $yearofFoundation")
    return super .setBasicInformation(club, typeSport, yearofFoundation)
    }
    override fun getShortInfo(): String {
        return "$club, лига:  ${league},  рейтинг FIFA <${rating}>"
    }
}



/*
Decorator pattern
*/
data class ConcertRecord(val football_club : Football_club ): Sport by football_club{

    override fun getInfo(): String {
        return "$club  (${football_club.coach}) - $$price , " +
                "${(football_club.league).getName()}]; "+ super.getInfo()
    }
}