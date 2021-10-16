import exceptions.BadFruitException

abstract class Fruit(var color: FruitColor, var weight: Int, var isSweet: Boolean = true) {
    companion object {
        var benefits: MutableList<String>? = mutableListOf();

        val GREEN: String = "GREEN"
        val YELLOW: String = "YELLOW"
        val ORANGE: String = "ORANGE"
        val RED: String = "RED"

    }

    object FruitHelper {
        fun isNiceFruit(fruit: Fruit){
            if (fruit is Strawberry || fruit is Orange) println("this is a nice fruit")
            else throw BadFruitException("This is a bad fruit")
        }
    }

    init {
        benefits!! += when(color){
            FruitColor.GREEN -> GREEN
            FruitColor.YELLOW -> YELLOW
            FruitColor.ORANGE -> ORANGE
            FruitColor.RED -> RED
        }
    }

    open fun describeFruit(){
        var sweet:String = if (isSweet) "is" else "isNot"

        println("My fruit $sweet sweet, weight ${getWeightG()}, is $color and here is a list of the benefits:")
        for (benefit in benefits!!){
            println("- $benefit")
        }
    }

    
}