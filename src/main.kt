fun main() {
    var nums = listOf(23,23,12,67,24,70,54,34,23,21,12)
    var numsSorted = nums.sortedDescending()
    println(numsSorted)
//    var index = 0
//    for(x in nums){
//        println("index $index - element: $x")
//        index++
//    }
//    println(nums.sum())
//    println(nums.minOrNull())
//    println(nums.maxOrNull())
//    println(nums.average())
//    println(nums[5])
//    println(nums.lastIndexOf(12))
//    println(nums.indexOf(54))
//    println(nums.get(3))
//    println(nums.first())
//    println(nums.last())
//    nums.forEach { x->
//        println(nums)
//    }
    var fruits = mutableListOf<String>()
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Grape")
    fruits.add("Avocado")
    fruits.add("Lemons")
    println(fruits)
    var longNames = fruits.filter { fruit -> fruit.length>5}
    println(longNames)


//
//    //listof creates immutable
//    val classes = listOf("AnitaB", "Lisalab","Lovelace")
//    classes.forEach{
//        println(it)
//    }
////    println(classes)
//    var colors = mutableListOf("Black","Red","yellow")
//    colors.add("Orange")
//    colors.remove("Black")
//    println(colors)

    printsSquareNumber(listOf(1,2,3,4,5,6,7,8,9))
   var toyota = Car("Toyota", "Corolla")
    var ford = Car("Ford", "Fiesta")
    var audi = Car("audi", "A6")
    println(toyota is Car)
    var myCars = listOf(toyota, ford, audi)
    println(myCars)
    myCars.forEach { car->
        if (car.model == ())
            println(car.model)
    }
   var sortedCars = myCars.sortedByDescending { car -> car.make }
    println(sortedCars)
    //sorted and sorteddecesnding
//    myCars.forEach { car->
//        println(car.model)
//    }
//    var cars = Cars("Armada", "Arteon")
//    var myCarrss = listOf(cars)
//    myCarrss.forEach { car ->
//        println(car.model)
//    }


    //print out only models of the cars from your list of cars
//var myCar = listOf<>()
var x = Person("Ruth", 20)
    var  y = Person("Saido", 12)
    var z = Person("Zack", 34)
    var  e = Person("Saido", 12)
    var t = Person("Brian", 36)

    var people = listOf(x,y,z,e,t)
    var adults = people.filter { person -> person.age>=18 }
    println(adults)





}
data class Person(var name:String, var age:Int)
data class Car(var make: String, var model:String)



//when object is created out of class is a type of that class e.g. farmer


//write a function that prints out the square of
// the elements at odd indices given a list of intgers

fun printsSquareNumber(numbers:List<Int>){
    numbers.forEachIndexed { index, i ->
        if(index%2 !=0){
            println(i*i)
        }
    }
}

//create a function that takes in a list of cars
//and returns a list of the model that begin  with vowels
//class Cars(var model:String, var make:String){
//    fun takesInListOfCars(cars: List<String>): String {
//return model
//    }
//
//}


//fun getVowelModels(cars:List<Car>):List<String>{
//    var models = mutableListOf<String>()
//    var vowels = listOf("a","e","i","o","u")
//    cars.forEach { car ->
//        if (vowels.contains(car.model.lowercase().first())){
//            model.add(car.model)
//
//        }
//    }
//    return models
//
//}



//1.create an empty mutable lists of strings - output
//2. create a list of vowels
//3.Loop through lists of cars
//4.for each car check if the model starts with a vowel
//5.Append the model name to list if it begins with a vowel
//6.return the list of models



















