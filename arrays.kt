fun main(args: Array<String>) {
    var arrayInt=Array<String>(5){" "}
    for (snb in 0..4){
        println("enter")
        arrayInt[snb]= readLine()!!.toString()

    }
    println("List of elemnts")

    for (snb in arrayInt){
        print(snb)
    }

}



