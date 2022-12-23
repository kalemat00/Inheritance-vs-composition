interface InterFace {
    val name:String
    val surname:String
    val age:Int

    fun function(): String{
        return ("${name} ${surname} ${age}")
    }
}