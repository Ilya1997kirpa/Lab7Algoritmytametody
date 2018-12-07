package khai.general

interface EnumClasses{}

interface SportInterface{}

enum class TypeSports: EnumClasses, SportInterface {
    football, basketball, handball, hockey, volleyball, NONE;


}

enum class Country : EnumClasses {
    England, Brazil, Argentina, Germany, Holland, Spain, Italy, France, USA, Russia, Serbia, NONE;
    fun isContinental() = when(this){
        England, Germany, Holland, Spain, Italy, France, USA, Russia, Serbia -> "Europe"
        Brazil, Argentina -> "America"
        else ->  "Другой континент"
    }
}

enum class League : EnumClasses {
    Premier_League,Major_League, Bundesliga, First_Division,Series_A,
    Eredivisie, La_Liga, League_of_Endez, NBA, NHL, KHL, Liga_1, MLS, Super_League, NONE;

}
fun EnumClasses.getName() = when(this){
    is TypeSports -> name
    is Country -> name
    is League -> name
    else -> ""
}



