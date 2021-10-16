import exceptions.BadFruitException

fun main(args :Array<String>){

    var myListOfFruits = mutableListOf<Fruit>(
        Strawberry(FruitColor.RED, 5,true),
        Orange(FruitColor.ORANGE,isSweet = true),
        Apple(FruitColor.GREEN,9),
        Banana(FruitColor.YELLOW,6,false),
        )

    for (fruit in myListOfFruits){
        fruit.describeFruit()

        try {
            Fruit.FruitHelper.isNiceFruit(fruit)
        }
        catch (err: BadFruitException){
            println(err.seriousMessage)
        }
    }


}

fun Fruit.getWeightG():String = this.weight.toString()+"g"