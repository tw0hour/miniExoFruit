class Strawberry(color: FruitColor,weight: Int, isSweet: Boolean = true) : Fruit(color,weight,isSweet){

    override fun describeFruit(){
        var sweet:String = if (isSweet) "is" else "isNot"

        println("My strawberry $sweet sweet, weight ${getWeightG()}, is $color and here is a list of the benefits:")
        for (benefit in benefits!!){
            println("- $benefit")
        }
    }
}