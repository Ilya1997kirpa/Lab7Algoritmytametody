package khai.w1



import khai.w1.Hoсkey_club
import khai.general.League
import khai.general.TypeSports
import khai.general.Country


fun main(args: Array<String>){

    val club1 = Football_club("Барселона","Barcelona",
            league=League.La_Liga, captain = "Лионель Месси",price = 3.16,yearofFoundation = "1899",
            coach = "Эрнесто Вальверде", holder = "Жозеп Бартомеу", typeSports = TypeSports.football, rating = 4)

    println(club1.getShortInfo())

    //contentinfo
    club1.country = Country.Spain
    club1.stadium = "Camp Nou"
    println(club1.getInfo())

    val club2= Football_club("","Рим",Country.Italy,"Стадио Олимпико",League.Series_A,"","",0.2,
            "","",typeSports = TypeSports.football, rating = 13)
    //tech info section
    club2.setBasicInformation("Рома",TypeSports.football,"1899")
    println(club2.getInfo())

    val list = initDataClasses()
    for (index in 0 until list.size){
        println(list[index].getInfo())
    }

}

fun initDataClasses() : List<Sport> {
    val club3 = Football_club(

            country = Country.Germany,
            stadium = "Альянц Арена",
            city = "Мюнхен",
            league = League.Bundesliga,
            captain = "Мануэль Нойер",
            price = 0.786,
            yearofFoundation = "1900",
            coach = "Нико Ковач",
            holder = "Ули Хёнесс",
            typeSports= TypeSports.football,
            rating=8
    )
            .setBasicInformation("Бавария", typeSport = TypeSports.football, yearofFoundation = "1900")

    val club4 = ConcertRecord(
            Football_club(
                    "",
                    "Буэнос-Айрес",
                    country = Country.Argentina,
                    league = League.Super_League,
                    price=0.72,
                    yearofFoundation = "1905",
                    coach = "Гильермо Баррос Скелотто",
                    holder = "",
                    typeSports = TypeSports.football,
                    rating = 12
            )

                    .setBasicInformation("Бока Хуниорс", typeSport = TypeSports.football,
                            yearofFoundation = "1905") as Football_club
    )
    val club5:Sport = Basketball_club("Чикаго Буллз",
            TypeSports.basketball,
            city = "Чикаго",
            country = Country.USA,
            coach = "Фред Хойберг",
            league = League.NBA,
            price = 1.5,
            yearofFoundation = "1966",
            rating =  3)


    val club6 = Hoсkey_club (

            typeSports = TypeSports.hockey,
            country = Country.Russia,
            coach = "Игорь Никитин",
            league = League.KHL,
            yearofFoundation = "1946",
            price = 1.3,
            rating = 1
    ).setBasicInformation(club = "ЦСКА", typeSport = TypeSports.hockey, yearofFoundation = "1946" )

    return listOf(club3,club4,club5,club6)
}