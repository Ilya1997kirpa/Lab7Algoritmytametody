package khai.w1


import khai.amo.catalog.*
import khai.general.*


interface Sport {
    //Content
    var club: String
    var typeSports: TypeSports
    var yearofFoundation: String
    var city: String
    var country: Country
    var coach: String
    var captain: String
    var stadium: String
    // Tech data
    var holder: String
    var league: League

    //  Usage data
    var mark: Int
    var overlooked: Boolean
    var price: Double
    var rating: Int

    fun getShortInfo(): String = "(Клуб: $club, Вид спорта: $typeSports)"

    fun getInfo(): String = "$country, $city"

    fun setBasicInformation(club: String, typeSport: TypeSports, yearofFoundation: String): Sport

    fun setContentInfo(typeSport: TypeSports, club: String, city: String, stadium: String, captain: String,
                       coach: String, yearofFoundation: String, holder: String): Sport


    //    w3
    enum class SportsFields {
        club,
        typeSports,
        yearofFoundation,
        city,
        country,
        stadium,
        coach,
        captain,
        holder,
        league,
        price,
        mark,
        overlooked;
    }

    fun getFieldName(): List<String> = SportsFields.values().toList().map { it.name }
}
//w/
/*
fun getFieldValue(field: Sport.SportsFields) = when(field){
    Sport.SportsFields.club -> this::club
    Sport.SportsFields.typeSports -> this::typeSports
    Sport.SportsFields.yearofFoundation ->this::yearofFoundation
    Sport.SportsFields.city-> this::city
    Sport.SportsFields.country ->this::country
    Sport.SportsFields.coach -> this::coach
    Sport.SportsFields.captain -> this::captain
    Sport.SportsFields.holder ->this::holder
    Sport.SportsFields.league ->this::league
    Sport.SportsFields.mark ->this::mark
    Sport.SportsFields.stadium -> this::stadium
    Sport.SportsFields.overlooked -> this::overlooked
    Sport.SportsFields.price -> this::price
}
fun getFieldName() = Sport.SportsFields.values().toList().map{ it.name }



*/
//    w4
fun Sport.mapToFields(data: Map <String, String>){
    this.setContentInfo(
            TypeSports.valueOf(data["typeSports"]?:"NONE"),
            data["club"]?:"",
            data["city"]?:"",
            data["stadium"]?:"",
            data["captain"]?:"",
            data["coach"]?:"",
            data["yearofFoundation"]?:"",
            data["holder"]?:""



                )
    this.setBasicInformation(
            data["club"]?:"",
            TypeSports.valueOf(data["typeSports"]?:"NONE"),
            data["yearofFoundation"]?:""

    )
    this.league = League.valueOf(data["league"]?:"NONE")
    this.country = Country.valueOf(data["country"]?:"NONE")
    this.mark = data["mark"]?.toInt()?:0
    this.price = data["price"]?.toDouble()?:0.0
}

fun Sport.fieldsToMap() : Map<String,String> {
    val map = mutableMapOf<String,String>()

    map["class"] = this::class.simpleName ?: this::class.toString()
       map["typeSports"] = this.typeSports.name
    map["club"] = this.club.toString()
    map["city"] = this.city.toString()
    map["stadium"] = this.stadium.toString()
    map["captain"] = this.captain.toString()
    map["coach"] = this.coach
    map["yearofFoundation"] = this.yearofFoundation
    map["holder"] = this.holder.toString()
    map["league"] = this.league.getName()
    map["country"] = this.country.getName()
    map["mark"] = this.mark.toString()
    map["price"] = this.price.toString()
    return map.toMap()
}

